
package com.training.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.training.soap.service package. 
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

    private final static QName _PersonServiceResponse_QNAME = new QName("http://com.cubic.net/personservice/1.0", "PersonServiceResponse");
    private final static QName _PersonServiceRequest_QNAME = new QName("http://com.cubic.net/personservice/1.0", "PersonServiceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.training.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonServiceRequestType }
     * 
     */
    public PersonServiceRequestType createPersonServiceRequestType() {
        return new PersonServiceRequestType();
    }

    /**
     * Create an instance of {@link PersonServiceResponseType }
     * 
     */
    public PersonServiceResponseType createPersonServiceResponseType() {
        return new PersonServiceResponseType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.cubic.net/personservice/1.0", name = "PersonServiceResponse")
    public JAXBElement<PersonServiceResponseType> createPersonServiceResponse(PersonServiceResponseType value) {
        return new JAXBElement<PersonServiceResponseType>(_PersonServiceResponse_QNAME, PersonServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.cubic.net/personservice/1.0", name = "PersonServiceRequest")
    public JAXBElement<PersonServiceRequestType> createPersonServiceRequest(PersonServiceRequestType value) {
        return new JAXBElement<PersonServiceRequestType>(_PersonServiceRequest_QNAME, PersonServiceRequestType.class, null, value);
    }

}
