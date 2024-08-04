package com.yocto.yoclib.epp;

public class ObjectURI {

    private String value;

    public ObjectURI(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public ObjectURI setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "ObjectURI{" +
                "value='" + value + '\'' +
                '}';
    }

}
