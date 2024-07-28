package com.yocto.yoclib.epp;

import java.util.ArrayList;
import java.util.List;

public class ServiceMenu {

    private final List<Version> version = new ArrayList<>();
    private final List<Language> lang = new ArrayList<>();
    private final List<ObjectURI> objURI = new ArrayList<>();
    private ServiceExtension svcExtension;

    public List<Version> getVersion() {
        return this.version;
    }

    public List<Language> getLanguage() {
        return this.lang;
    }

    public List<ObjectURI> getObjectURI() {
        return this.objURI;
    }

    public ServiceExtension getServiceExtension() {
        return this.svcExtension;
    }

    public void setServiceExtension(ServiceExtension svcExtension) {
        this.svcExtension = svcExtension;
    }

    @Override
    public String toString() {
        return "ServiceMenu{" +
                "version=" + version +
                ", lang=" + lang +
                ", objURI=" + objURI +
                ", svcExtension=" + svcExtension +
                '}';
    }

}