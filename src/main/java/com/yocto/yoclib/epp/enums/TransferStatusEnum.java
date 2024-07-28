package com.yocto.yoclib.epp.enums;

public enum TransferStatusEnum {

    CLIENT_APPROVED("clientApproved"),
    CLIENT_CANCELLED("clientCancelled"),
    CLIENT_REJECTED("clientRejected"),
    PENDING("pending"),
    SERVER_APPROVED("serverApproved"),
    SERVER_CANCELLED("serverCancelled");

    private String value;

    TransferStatusEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
