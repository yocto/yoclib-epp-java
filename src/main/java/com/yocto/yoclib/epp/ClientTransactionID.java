package com.yocto.yoclib.epp;

public class ClientTransactionID {

    private String value;

    public ClientTransactionID(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public ClientTransactionID setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "ClientTransactionID{" +
                "value='" + value + '\'' +
                '}';
    }

}
