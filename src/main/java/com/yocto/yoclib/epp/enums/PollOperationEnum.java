package com.yocto.yoclib.epp.enums;

public enum PollOperationEnum {

    ACK("ack"),
    REQ("ack");

    private String value;

    PollOperationEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
