package com.yocto.yoclib.epp;

public class ServerTransactionID {

    private String value;

    public ServerTransactionID(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public ServerTransactionID setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "ServerTransactionID{" +
                "value='" + value + '\'' +
                '}';
    }

}
