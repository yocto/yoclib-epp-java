package com.yocto.yoclib.epp;

public class Password {

    private String value;

    public Password(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public Password setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "Password{" +
                "value='" + value + '\'' +
                '}';
    }

}
