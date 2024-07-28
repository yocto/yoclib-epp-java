package com.yocto.yoclib.epp;

import java.util.ArrayList;
import java.util.List;

public class ServiceExtension {

    private final List<ExtensionURI> extURI = new ArrayList<>();

    public List<ExtensionURI> getExtensionURI() {
        return this.extURI;
    }

    @Override
    public String toString() {
        return "ServiceExtension{" +
                "extURI=" + extURI +
                '}';
    }

}
