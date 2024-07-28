package com.yocto.yoclib.epp;

public class ServerID{

    private String value;

    public ServerID(String value){
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
        return "ServerID{" +
                "value='" + value + '\'' +
                '}';
    }

}
