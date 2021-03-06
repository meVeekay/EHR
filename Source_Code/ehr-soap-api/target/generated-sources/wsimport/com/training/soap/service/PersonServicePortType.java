
package com.training.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonServicePortType", targetNamespace = "http://com.cubic.net/personservice/1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonServicePortType {


    /**
     * 
     * @param personServiceRequest
     * @return
     *     returns com.training.soap.service.PersonServiceResponseType
     */
    @WebMethod(action = "http://com.cubic.net/PersonService/getPerson")
    @WebResult(name = "PersonServiceResponse", targetNamespace = "http://com.cubic.net/personservice/1.0", partName = "PersonServiceResponse")
    public PersonServiceResponseType searchPerson(
        @WebParam(name = "PersonServiceRequest", targetNamespace = "http://com.cubic.net/personservice/1.0", partName = "PersonServiceRequest")
        PersonServiceRequestType personServiceRequest);

}
