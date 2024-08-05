package com.yocto.yoclib.epp;

import java.util.HashMap;
import java.util.Map;

public class Value {

    private Object any;
    private final Map<String,String> anyAttribute = new HashMap<>();

    public Object getAny() {
        return this.any;
    }

    public Map<String,String> getAnyAttribute() {
        return this.anyAttribute;
    }

    public Value setAny(Object any) {
        this.any = any;
        return this;
    }

    @Override
    public String toString() {
        return "Value{" +
                "any=" + any +
                ", anyAttribute='" + anyAttribute + '\'' +
                '}';
    }

}
