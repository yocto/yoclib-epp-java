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

    public void setAny(Object any) {
        this.any = any;
    }

    public void setAnyAttribute(String anyAttribute) {
        this.anyAttribute = anyAttribute;
    }

    @Override
    public String toString() {
        return "Value{" +
                "any=" + any +
                ", anyAttribute='" + anyAttribute + '\'' +
                '}';
    }

}
