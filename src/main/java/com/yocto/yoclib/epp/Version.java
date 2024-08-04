package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.enums.VersionEnum;

public class Version{

    private VersionEnum value;

    public Version(VersionEnum value){
        this.value = value;
    }

    public VersionEnum getValue() {
        return this.value;
    }

    public Version setValue(VersionEnum value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "Version{" +
                "value='" + value + '\'' +
                '}';
    }

}