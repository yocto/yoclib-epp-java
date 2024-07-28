package com.yocto.yoclib.epp;

public class ObjectURI {

    private String value;

    public ObjectURI(String value){
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
        return "ObjectURI{" +
                "value='" + value + '\'' +
                '}';
    }

}
