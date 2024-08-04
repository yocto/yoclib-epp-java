package com.yocto.yoclib.epp.enums;

public enum VersionEnum {

    V1_0("1.0");

    private String value;

    VersionEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return "v"+value;
    }

}
