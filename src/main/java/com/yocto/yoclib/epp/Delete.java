package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.CommandTypeChoice;

public class Delete implements CommandTypeChoice {

    private Object any;

    public Object getAny() {
        return this.any;
    }

    public Delete setAny(Object any) {
        this.any = any;
        return this;
    }

    @Override
    public String toString() {
        return "Delete{" +
                "any=" + any +
                '}';
    }

}
