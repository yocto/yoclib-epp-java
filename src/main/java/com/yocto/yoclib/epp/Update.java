package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.CommandTypeChoice;

public class Update implements CommandTypeChoice {

    private Object any;

    public Object getAny() {
        return this.any;
    }

    public Update setAny(Object any) {
        this.any = any;
        return this;
    }

    @Override
    public String toString() {
        return "Update{" +
                "any=" + any +
                '}';
    }

}
