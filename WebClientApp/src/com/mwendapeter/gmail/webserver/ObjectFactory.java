
package com.mwendapeter.gmail.webserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mwendapeter.gmail.webserver package. 
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

    private final static QName _AddNum_QNAME = new QName("http://webserver.gmail.mwendapeter.com/", "addNum");
    private final static QName _AddNumResponse_QNAME = new QName("http://webserver.gmail.mwendapeter.com/", "addNumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mwendapeter.gmail.webserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNum }
     * 
     */
    public AddNum createAddNum() {
        return new AddNum();
    }

    /**
     * Create an instance of {@link AddNumResponse }
     * 
     */
    public AddNumResponse createAddNumResponse() {
        return new AddNumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserver.gmail.mwendapeter.com/", name = "addNum")
    public JAXBElement<AddNum> createAddNum(AddNum value) {
        return new JAXBElement<AddNum>(_AddNum_QNAME, AddNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserver.gmail.mwendapeter.com/", name = "addNumResponse")
    public JAXBElement<AddNumResponse> createAddNumResponse(AddNumResponse value) {
        return new JAXBElement<AddNumResponse>(_AddNumResponse_QNAME, AddNumResponse.class, null, value);
    }

}
