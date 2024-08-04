package com.yocto.yoclib.epp;

import java.util.Date;

public class Absolute{

    private Date value;

    public Absolute(Date value){
        this.value = value;
    }

    public Date getValue() {
        return this.value;
    }

    public Absolute setValue(Date value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "Absolute{" +
                "value=" + value +
                '}';
    }

}
