history(
b(
  l(yeast),
  b(
    b(
      l(fly),
      l(mosquito)
     ),
    b(
      l(frog),
      b(
	l(chicken),
	b(
	  l(mouse),
	  b(
	    l(human),
	    l(chimp)
	   )
	 )
       )
     )
   )
 )).

tree1(l(enkelt)).
tree2(b(l(1),l(2))).
tree3(b(l(1),b(l(2),l(3)))).
tree4(b(b(l(1),l(2)), b(l(3), l(4)))).
tree5(b(l(1), b(l(2), b(l(3),b(l(4),l(5)))))).
tree6(b(b(l(1), b(l(2), b(l(3),b(l(4), l(5))))),
	b(l(6), b(l(7), b(l(8),b(l(9), l(10))))))).


writetree(T) :- writetree(T, 0).
writetree(l(X), N) :-
	indent(N),
	write(X).
writetree(b(X,Y), N) :-
	indent(N),
	write('('), nl,
	Next is N + 2,
	writetree(X, Next),
	write(', '), nl,
	writetree(Y, Next), nl,
	indent(N),
	write(')').

indent(0).
indent(N) :- N>0, write(' '), Next is N-1, indent(Next).

%Om l�v - N �r 1.
count_leaves(l(_), N) :-
	N is 1.
%Om tr�d - F�lj grenarna och l�gg ihop resultatet fr�n deltr�den.
count_leaves(b(L, R), N) :-
	count_leaves(L, N1),
	count_leaves(R, N2),
	N is N1 + N2.

%Om l�v - Listan �r l�vets element.
leaves(l(X), [X]).
%Om tr�d - F�lj grenarna och sl� ihop listorna fr�n deltr�den.
leaves(b(L, R), V) :-
	leaves(L, V1),
	leaves(R, V2),
	append(V2, V1, V).

%Om bara 2 element i listan - Skapa tr�d med tv� l�v.
build_tree([X,Y], b(l(X),l(Y))).
%Om mer �n 2 element - Skapa tr�d med ett l�v samt ett deltr�d och rekursera
%p� den �terst�ende delen av listan. 
build_tree([H|T], b(l(H), Rest)) :-
	build_tree(T, Rest).

%Om l�v - H�jden �r 1.
height(l(_), H) :-
	H is 1.
%Om tr�d - H�jden �r den maximala h�jden av deltr�den + 1.
height(b(L, R), H) :-
	height(L, H1),
	height(R, H2),
	H is max(H1, H2) + 1.

%Om bara ett l�v - balanserat.
balanced(l(_)):-
	true.
%Annars - Balanserat om deltr�dens h�jd skiljer sig med max ett.
balanced(b(L, R)) :-
	height(L, HL),
	height(R, HR),
	abs(HL-HR) =< 1.
%	((HL-HR) > 1;(HL-HR) < -1 -> false ; true).