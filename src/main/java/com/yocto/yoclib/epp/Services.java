package com.yocto.yoclib.epp;

import java.util.ArrayList;
import java.util.List;

public class Services{

    private final List<ObjectURI> objURI = new ArrayList<>();
    private ServiceExtension svcExtension;

    public List<ObjectURI> getObjectURI() {
        return this.objURI;
    }

    public ServiceExtension getServiceExtension() {
        return this.svcExtension;
    }

    public Services setServiceExtension(ServiceExtension svcExtension) {
        this.svcExtension = svcExtension;
        return this;
    }

    @Override
    public String toString() {
        return "Services{" +
                "objURI=" + objURI +
                ", svcExtension=" + svcExtension +
                '}';
    }

}