package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.DCPAccessTypeChoice;
import com.yocto.yoclib.epp.types.DCPRetentionTypeChoice;

public class None implements DCPAccessTypeChoice,DCPRetentionTypeChoice{

    @Override
    public String toString() {
        return "None{}";
    }

}