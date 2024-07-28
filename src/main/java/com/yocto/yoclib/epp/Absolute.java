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

    public void setValue(Date value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Absolute{" +
                "value=" + value +
                '}';
    }

}
