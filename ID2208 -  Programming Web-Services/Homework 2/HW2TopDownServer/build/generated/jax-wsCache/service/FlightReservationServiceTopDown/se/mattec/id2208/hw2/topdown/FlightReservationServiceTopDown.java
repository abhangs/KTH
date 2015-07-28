
package se.mattec.id2208.hw2.topdown;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FlightReservationServiceTopDown", targetNamespace = "http://topdown.hw2.id2208.mattec.se/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightReservationServiceTopDown {


    /**
     * 
     * @param authToken
     * @param itineary
     * @param cardNumber
     * @return
     *     returns java.lang.String
     * @throws UnauthorizedException
     */
    @WebMethod(action = "bookTicket")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookTicket", targetNamespace = "http://topdown.hw2.id2208.mattec.se/", className = "se.mattec.id2208.hw2.topdown.BookTicket")
    @ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://topdown.hw2.id2208.mattec.se/", className = "se.mattec.id2208.hw2.topdown.BookTicketResponse")
    public String bookTicket(
        @WebParam(name = "authToken", targetNamespace = "")
        String authToken,
        @WebParam(name = "itineary", targetNamespace = "")
        Itineary itineary,
        @WebParam(name = "cardNumber", targetNamespace = "")
        String cardNumber)
        throws UnauthorizedException
    ;

    /**
     * 
     * @param ticketNumber
     * @param authToken
     * @return
     *     returns se.mattec.id2208.hw2.topdown.Ticket
     * @throws UnauthorizedException
     */
    @WebMethod(action = "issueTicket")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "issueTicket", targetNamespace = "http://topdown.hw2.id2208.mattec.se/", className = "se.mattec.id2208.hw2.topdown.IssueTicket")
    @ResponseWrapper(localName = "issueTicketResponse", targetNamespace = "http://topdown.hw2.id2208.mattec.se/", className = "se.mattec.id2208.hw2.topdown.IssueTicketResponse")
    public Ticket issueTicket(
        @WebParam(name = "authToken", targetNamespace = "")
        String authToken,
        @WebParam(name = "ticketNumber", targetNamespace = "")
        String ticketNumber)
        throws UnauthorizedException
    ;

}