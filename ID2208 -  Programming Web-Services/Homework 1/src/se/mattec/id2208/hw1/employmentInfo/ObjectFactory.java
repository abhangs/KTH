//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.01 at 09:23:10 PM CET 
//


package se.mattec.id2208.hw1.employmentInfo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.mattec.id2208.hw1.employmentInfo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.mattec.id2208.hw1.employmentInfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmploymentInfo }
     * 
     */
    public EmploymentInfo createEmploymentInfo() {
        return new EmploymentInfo();
    }

    /**
     * Create an instance of {@link EmploymentInfo.Employment }
     * 
     */
    public EmploymentInfo.Employment createEmploymentInfoEmployment() {
        return new EmploymentInfo.Employment();
    }

    /**
     * Create an instance of {@link EmploymentInfo.Employment.Company }
     * 
     */
    public EmploymentInfo.Employment.Company createEmploymentInfoEmploymentCompany() {
        return new EmploymentInfo.Employment.Company();
    }

}