package com.yocto.yoclib.epp.xml;

import com.yocto.yoclib.epp.contact.Check;
import org.w3c.dom.Element;

public class ContactDeserializer {

    public static final String NAMESPACE = "urn:ietf:params:xml:ns:contact-1.0";

    public static Check deserializeCheck(Element element){
        return new Check();
    }

}
