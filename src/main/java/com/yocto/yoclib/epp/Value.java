package com.yocto.yoclib.epp;

public class Value {

    private Object any;
    private String anyAttribute;

    public Object getAny() {
        return this.any;
    }

    public String getAnyAttribute() {
        return this.anyAttribute;
    }

    public Value setAny(Object any) {
        this.any = any;
        return this;
    }

    public Value setAnyAttribute(String anyAttribute) {
        this.anyAttribute = anyAttribute;
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
