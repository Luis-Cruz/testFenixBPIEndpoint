
package pt.ist.fenixedu.bpi.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "BPISyncException", targetNamespace = "http://webservice.bpi.fenixedu.ist.pt/")
public class BPISyncException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BPISyncException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public BPISyncException_Exception(String message, BPISyncException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public BPISyncException_Exception(String message, BPISyncException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pt.ist.fenixedu.bpi.webservice.BPISyncException
     */
    public BPISyncException getFaultInfo() {
        return faultInfo;
    }

}
