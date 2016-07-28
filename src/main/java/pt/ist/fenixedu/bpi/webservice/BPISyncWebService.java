
package pt.ist.fenixedu.bpi.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BPISyncWebService", targetNamespace = "http://webservice.bpi.fenixedu.ist.pt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BPISyncWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns pt.ist.fenixedu.bpi.webservice.BpiSyncBean
     * @throws BPISyncException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://webservice.bpi.fenixedu.ist.pt/", className = "pt.ist.fenixedu.bpi.webservice.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://webservice.bpi.fenixedu.ist.pt/", className = "pt.ist.fenixedu.bpi.webservice.GetUserResponse")
    @Action(input = "http://webservice.bpi.fenixedu.ist.pt/BPISyncWebService/getUserRequest", output = "http://webservice.bpi.fenixedu.ist.pt/BPISyncWebService/getUserResponse", fault = {
        @FaultAction(className = BPISyncException_Exception.class, value = "http://webservice.bpi.fenixedu.ist.pt/BPISyncWebService/getUser/Fault/BPISyncException")
    })
    public BpiSyncBean getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws BPISyncException_Exception
    ;

}