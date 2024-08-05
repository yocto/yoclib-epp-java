package com.yocto.yoclib.epp.xml;

import com.yocto.yoclib.epp.*;
import com.yocto.yoclib.epp.types.CommandTypeChoice;
import com.yocto.yoclib.epp.types.EPPTypeChoice;

import java.time.Instant;
import java.util.Date;

import org.w3c.dom.Element;

public class EPPDeserializer {

    public static final String NAMESPACE = "urn:ietf:params:xml:ns:epp-1.0";

    public static EPP deserializeEPP(Element element){
        EPPTypeChoice choice = null;
        Element choiceElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"greeting")){
            choice = EPPDeserializer.deserializeGreeting(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"hello")){
            choice = EPPDeserializer.deserializeHello(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"command")){
            choice = EPPDeserializer.deserializeCommand(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"response")){
            choice = EPPDeserializer.deserializeResponse(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"extension")){
            choice = EPPDeserializer.deserializeExtension(choiceElement);
        }
        return new EPP().setChoice(choice);
    }

    public static Greeting deserializeGreeting(Element element){
        Element[] children = DeserializerHelper.getChildElements(element.getChildNodes());
        ServerID serverID = EPPDeserializer.deserializeServerID(children[0]);
        ServerDate serverDate = EPPDeserializer.deserializeServerDate(children[1]);
        ServiceMenu serviceMenu = EPPDeserializer.deserializeServiceMenu(children[2]);
        DCP dcp = EPPDeserializer.deserializeDCP(children[2]);
        return new Greeting().setServerID(serverID).setServerDate(serverDate).setServiceMenu(serviceMenu).setDCP(dcp);
    }

    public static ServerID deserializeServerID(Element element){
        return new ServerID(element.getTextContent().trim());
    }

    public static ServerDate deserializeServerDate(Element element){
        return new ServerDate(Date.from(Instant.parse(element.getTextContent().trim())));
    }

    public static ServiceMenu deserializeServiceMenu(Element element){
        //TODO
        return new ServiceMenu();
    }

    public static DCP deserializeDCP(Element element){
        //TODO
        return new DCP();
    }

    public static Hello deserializeHello(Element element){
        return new Hello();
    }

    public static Command deserializeCommand(Element element){
        Element[] children = DeserializerHelper.getChildElements(element.getChildNodes());
        CommandTypeChoice choice = null;
        Element choiceElement = children[0];
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"check")){
            choice = EPPDeserializer.deserializeCheck(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"create")){
            choice = EPPDeserializer.deserializeCreate(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"delete")){
            choice = EPPDeserializer.deserializeDelete(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"info")){
            choice = EPPDeserializer.deserializeInfo(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"login")){
            choice = EPPDeserializer.deserializeLogin(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"logout")){
            choice = EPPDeserializer.deserializeLogout(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"poll")){
            choice = EPPDeserializer.deserializePoll(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"renew")){
            choice = EPPDeserializer.deserializeRenew(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"transfer")){
            choice = EPPDeserializer.deserializeTransfer(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"update")){
            choice = EPPDeserializer.deserializeUpdate(choiceElement);
        }
        Extension extension = null;
        ClientTransactionID clTRID = null;
        Element extensionOrClientTransactionID = children.length>1?children[1]:null;
        Element clTRIDOrNull = children.length>2?children[2]:null;
        if(DeserializerHelper.isCorrectElement(extensionOrClientTransactionID,EPPDeserializer.NAMESPACE,"extension")){
            extension = EPPDeserializer.deserializeExtension(extensionOrClientTransactionID);
        }
        if(DeserializerHelper.isCorrectElement(extensionOrClientTransactionID,EPPDeserializer.NAMESPACE,"clTRID")){
            clTRID = EPPDeserializer.deserializeClientTransactionID(extensionOrClientTransactionID);
        }
        if(DeserializerHelper.isCorrectElement(clTRIDOrNull,EPPDeserializer.NAMESPACE,"clTRID")){
            clTRID = EPPDeserializer.deserializeClientTransactionID(clTRIDOrNull);
        }
        return new Command().setChoice(choice).setExtension(extension).setClientTransactionID(clTRID);
    }

    public static ClientTransactionID deserializeClientTransactionID(Element element){
        return new ClientTransactionID(element.getTextContent().trim());
    }

    public static Check deserializeCheck(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Check().setAny(any);
    }

    public static Create deserializeCreate(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Create().setAny(any);
    }

    public static Delete deserializeDelete(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Delete().setAny(any);
    }

    public static Info deserializeInfo(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Info().setAny(any);
    }

    public static Login deserializeLogin(Element element){
        return new Login();
    }

    public static Logout deserializeLogout(Element element){
        assert element!=null;
        return new Logout();
    }

    public static Poll deserializePoll(Element element){
        return new Poll();
    }

    public static Renew deserializeRenew(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Renew().setAny(any);
    }

    public static Transfer deserializeTransfer(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Transfer().setAny(any);
    }

    public static Update deserializeUpdate(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Update().setAny(any);
    }

    public static Response deserializeResponse(Element element){
        return new Response();
    }

    public static Extension deserializeExtension(Element element){
        return new Extension();
    }

}
