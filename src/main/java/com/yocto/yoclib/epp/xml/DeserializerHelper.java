package com.yocto.yoclib.epp.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DeserializerHelper {

    public static final Map<String, Function<Element,Object>> ELEMENT_REGISTRY = new HashMap<>();

    public static Element[] getChildElements(NodeList list){
        List<Element> children = new ArrayList<>();
        for(int i=0;i<list.getLength();i++){
            if(list.item(i) instanceof Element){
                children.add((Element) list.item(i));
            }
        }
        return children.toArray(new Element[0]);
    }

    public static boolean isCorrectElement(Element element,String namespaceURI,String localName){
        if(element==null){
            return false;
        }
        return namespaceURI.equals(element.getNamespaceURI()) && localName.equals(element.getLocalName());
    }

    public static void addElementToRegistry(String namespace,String localName,Function<Element,Object> function){
        String fullName = DeserializerHelper.getFullName(namespace,localName);
        DeserializerHelper.ELEMENT_REGISTRY.put(fullName,function);
    }

    private static String getFullName(String namespaceURI,String localName){
        return "{"+namespaceURI+"}:"+localName;
    }

    public static Object detectAny(Element element,boolean other){
        if(element==null){
            return null;
        }
        Element parent = (Element) element.getParentNode();
        String fullName = DeserializerHelper.getFullName(element.getNamespaceURI(),element.getLocalName());
        String parentFullName = (parent!=null)?DeserializerHelper.getFullName(parent.getNamespaceURI(),parent.getLocalName()):null;
        if(other && fullName.equals(parentFullName)){
            return null;
        }
        Function<Element,Object> function = DeserializerHelper.ELEMENT_REGISTRY.get(fullName);
        if(function==null){
            return null;
        }
        return function.apply(element);
    }

}
