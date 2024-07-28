package com.yocto.yoclib.epp;

public class Relative {

    private String value;

    public Relative(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Relative{" +
                "value='" + value + '\'' +
                '}';
    }

}
