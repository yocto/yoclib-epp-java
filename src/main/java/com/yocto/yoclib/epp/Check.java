package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.CommandTypeChoice;

public class Check implements CommandTypeChoice {

    private Object any;

    public Object getAny() {
        return this.any;
    }

    public Check setAny(Object any) {
        this.any = any;
        return this;
    }

    @Override
    public String toString() {
        return "Check{" +
                "any=" + any +
                '}';
    }

}
