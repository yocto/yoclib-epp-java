package com.yocto.yoclib.epp;

public class ClientID {

    private String value;

    public ClientID(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public ClientID setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "ClientID{" +
                "value='" + value + '\'' +
                '}';
    }

}
