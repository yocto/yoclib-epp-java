package com.yocto.yoclib.epp.xml;

import com.yocto.yoclib.epp.*;
import com.yocto.yoclib.epp.enums.VersionEnum;
import com.yocto.yoclib.epp.types.CommandTypeChoice;
import com.yocto.yoclib.epp.types.DCPAccessTypeChoice;
import com.yocto.yoclib.epp.types.EPPTypeChoice;

import java.time.Instant;
import java.util.Date;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public class EPPDeserializer {

    public static final String NAMESPACE = "urn:ietf:params:xml:ns:epp-1.0";

    public static Absolute deserializeAbsolute(Element element){
        return new Absolute(Date.from(Instant.parse(element.getTextContent().trim())));
    }

    public static Access deserializeAccess(Element element){
        Element[] children = DeserializerHelper.getChildElements(element.getChildNodes());
        DCPAccessTypeChoice choice = null;
        Element choiceElement = children[0];
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"all")){
            choice = EPPDeserializer.deserializeAll(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"none")){
            choice = EPPDeserializer.deserializeNone(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"null")){
            choice = EPPDeserializer.deserializeNull(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"other")){
            choice = EPPDeserializer.deserializeOther(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"personal")){
            choice = EPPDeserializer.deserializePersonal(choiceElement);
        }
        if(DeserializerHelper.isCorrectElement(choiceElement,EPPDeserializer.NAMESPACE,"personalAndOther")){
            choice = EPPDeserializer.deserializePersonalAndOther(choiceElement);
        }
        return new Access().setChoice(choice);
    }

    public static Administrator deserializeAdministrator(Element element){
        assert element!=null;
        return new Administrator();
    }

    public static All deserializeAll(Element element){
        assert element!=null;
        return new All();
    }

    public static Business deserializeBusiness(Element element){
        assert element!=null;
        return new Business();
    }

    public static Check deserializeCheck(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Check().setAny(any);
    }

    public static ClientID deserializeClientID(Element element){
        return new ClientID(element.getTextContent().trim());
    }

    public static ClientTransactionID deserializeClientTransactionID(Element element){
        return new ClientTransactionID(element.getTextContent().trim());
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

    public static Contact deserializeContact(Element element){
        assert element!=null;
        return new Contact();
    }

    public static Create deserializeCreate(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Create().setAny(any);
    }

    public static DCP deserializeDCP(Element element){
        //TODO
        return new DCP();
    }

    public static Delete deserializeDelete(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Delete().setAny(any);
    }

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

    public static Expiry deserializeExpiry(Element element){
        //TODO
        return new Expiry();
    }

    public static Extension deserializeExtension(Element element){
        return new Extension();
    }

    public static ExtensionURI deserializeExtensionURI(Element element){
        return new ExtensionURI(element.getTextContent().trim());
    }

    public static ExtensionValue deserializeExtensionValue(Element element){
        //TODO
        return new ExtensionValue();
    }

    public static Greeting deserializeGreeting(Element element){
        Element[] children = DeserializerHelper.getChildElements(element.getChildNodes());
        ServerID serverID = EPPDeserializer.deserializeServerID(children[0]);
        ServerDate serverDate = EPPDeserializer.deserializeServerDate(children[1]);
        ServiceMenu serviceMenu = EPPDeserializer.deserializeServiceMenu(children[2]);
        DCP dcp = EPPDeserializer.deserializeDCP(children[2]);
        return new Greeting().setServerID(serverID).setServerDate(serverDate).setServiceMenu(serviceMenu).setDCP(dcp);
    }

    public static Hello deserializeHello(Element element){
        assert element!=null;
        return new Hello();
    }

    public static Indefinite deserializeIndefinite(Element element){
        assert element!=null;
        return new Indefinite();
    }

    public static Info deserializeInfo(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Info().setAny(any);
    }

    public static Language deserializeLanguage(Element element){
        return new Language(element.getTextContent().trim());
    }

    public static Legal deserializeLegal(Element element){
        assert element!=null;
        return new Legal();
    }

    public static Login deserializeLogin(Element element){
        return new Login();
    }

    public static Logout deserializeLogout(Element element){
        assert element!=null;
        return new Logout();
    }

    public static Message deserializeMessage(Element element){
        String language = element.hasAttribute("lang")?element.getAttribute("lang"):null;
        return new Message(element.getTextContent().trim()).setLanguage(language);
    }

    public static MessageQueue deserializeMessageQueue(Element element){
        //TODO
        return new MessageQueue();
    }

    public static NewPassword deserializeNewPassword(Element element){
        return new NewPassword(element.getTextContent().trim());
    }

    public static None deserializeNone(Element element){
        assert element!=null;
        return new None();
    }

    public static Null deserializeNull(Element element){
        assert element!=null;
        return new Null();
    }

    public static ObjectURI deserializeObjectURI(Element element){
        return new ObjectURI(element.getTextContent().trim());
    }

    public static Options deserializeOptions(Element element){
        //TODO
        return new Options();
    }

    public static Other deserializeOther(Element element){
        assert element!=null;
        return new Other();
    }

    public static Ours deserializeOurs(Element element){
        //TODO
        return new Ours();
    }

    public static Password deserializePassword(Element element){
        assert element!=null;
        return new Password(element.getTextContent().trim());
    }

    public static Personal deserializePersonal(Element element){
        assert element!=null;
        return new Personal();
    }

    public static PersonalAndOther deserializePersonalAndOther(Element element){
        assert element!=null;
        return new PersonalAndOther();
    }

    public static Poll deserializePoll(Element element){
        return new Poll();
    }

    public static Provisioning deserializeProvisioning(Element element){
        assert element!=null;
        return new Provisioning();
    }

    public static Public deserializePublic(Element element){
        assert element!=null;
        return new Public();
    }

    public static Purpose deserializePurpose(Element element){
        //TODO
        return new Purpose();
    }

    public static QueueDate deserializeQueueDate(Element element){
        return new QueueDate(Date.from(Instant.parse(element.getTextContent().trim())));
    }

    public static Reason deserializeReason(Element element){
        String language = element.hasAttribute("lang")?element.getAttribute("lang"):null;
        return new Reason(element.getTextContent().trim()).setLanguage(language);
    }

    public static Recipient deserializeRecipient(Element element){
        //TODO
        return new Recipient();
    }

    public static RecipientDescription deserializeRecipientDescription(Element element){
        return new RecipientDescription(element.getTextContent().trim());
    }

    public static Relative deserializeRelative(Element element){
        return new Relative(element.getTextContent().trim());
    }

    public static Renew deserializeRenew(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Renew().setAny(any);
    }

    public static Response deserializeResponse(Element element){
        return new Response();
    }

    public static ResponseData deserializeResponseData(Element element){
        //TODO
        return new ResponseData();
    }

    public static Result deserializeResult(Element element){
        //TODO
        return new Result();
    }

    public static Retention deserializeRetention(Element element){
        //TODO
        return new Retention();
    }

    public static Same deserializeSame(Element element){
        assert element!=null;
        return new Same();
    }

    public static ServerDate deserializeServerDate(Element element){
        return new ServerDate(Date.from(Instant.parse(element.getTextContent().trim())));
    }

    public static ServerID deserializeServerID(Element element){
        return new ServerID(element.getTextContent().trim());
    }

    public static ServerTransactionID deserializeServerTransactionID(Element element){
        return new ServerTransactionID(element.getTextContent().trim());
    }

    public static ServiceExtension deserializeServiceExtension(Element element){
        //TODO
        return new ServiceExtension();
    }

    public static ServiceMenu deserializeServiceMenu(Element element){
        //TODO
        return new ServiceMenu();
    }

    public static Services deserializeServices(Element element){
        //TODO
        return new Services();
    }

    public static Stated deserializeStated(Element element){
        assert element!=null;
        return new Stated();
    }

    public static Statement deserializeStatement(Element element){
        //TODO
        return new Statement();
    }

    public static TransactionID deserializeTransactionID(Element element){
        //TODO
        return new TransactionID();
    }

    public static Transfer deserializeTransfer(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Transfer().setAny(any);
    }

    public static Unrelated deserializeUnrelated(Element element){
        assert element!=null;
        return new Unrelated();
    }

    public static Update deserializeUpdate(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,true);
        return new Update().setAny(any);
    }

    public static Value deserializeValue(Element element){
        Element anyElement = DeserializerHelper.getChildElements(element.getChildNodes())[0];
        Object any = DeserializerHelper.detectAny(anyElement,false);
        Value value = new Value().setAny(any);
        NamedNodeMap attributes = element.getAttributes();
        for(int i=0;i<attributes.getLength();i++){
            Attr attribute = (Attr) attributes.item(i);
            value.getAnyAttribute().put(attribute.getName(),attribute.getValue());
        }
        return value;
    }

    public static Version deserializeVersion(Element element){
        return new Version(VersionEnum.valueOf(element.getTextContent().trim()));
    }

}
