package com.yocto.yoclib.epp;

public class ClientID {

    private String value;

    public ClientID(String value){
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
        return "ClientID{" +
                "value='" + value + '\'' +
                '}';
    }

}
