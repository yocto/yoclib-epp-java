package com.yocto.yoclib.epp;

public class RecipientDescription{

    private String value;

    public RecipientDescription(String value){
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
        return "RecipientDescription{" +
                "value='" + value + '\'' +
                '}';
    }

}