package com.yocto.yoclib.epp.enums;

public enum TransferOperationEnum {

    APPROVE("approve"),
    CANCEL("cancel"),
    QUERY("query"),
    REJECT("reject"),
    REQUEST("request");

    private String value;

    TransferOperationEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
