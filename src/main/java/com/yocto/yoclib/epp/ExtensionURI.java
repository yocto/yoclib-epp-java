package com.yocto.yoclib.epp;

public class ExtensionURI {

    private String value;

    public ExtensionURI(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ExtensionURI{" +
                "value='" + value + '\'' +
                '}';
    }

}
