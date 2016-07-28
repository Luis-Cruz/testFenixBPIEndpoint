
package pt.ist.fenixedu.bpi.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.ist.fenixedu.bpi.webservice package. 
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

    private final static QName _GetUser_QNAME = new QName("http://webservice.bpi.fenixedu.ist.pt/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://webservice.bpi.fenixedu.ist.pt/", "getUserResponse");
    private final static QName _BPISyncException_QNAME = new QName("http://webservice.bpi.fenixedu.ist.pt/", "BPISyncException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.ist.fenixedu.bpi.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link BPISyncException }
     * 
     */
    public BPISyncException createBPISyncException() {
        return new BPISyncException();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link BpiSyncBean }
     * 
     */
    public BpiSyncBean createBpiSyncBean() {
        return new BpiSyncBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bpi.fenixedu.ist.pt/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bpi.fenixedu.ist.pt/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BPISyncException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bpi.fenixedu.ist.pt/", name = "BPISyncException")
    public JAXBElement<BPISyncException> createBPISyncException(BPISyncException value) {
        return new JAXBElement<BPISyncException>(_BPISyncException_QNAME, BPISyncException.class, null, value);
    }

}
