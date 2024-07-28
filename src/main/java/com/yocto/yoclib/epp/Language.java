package com.yocto.yoclib.epp;

public class Language {

    private String value;

    public Language(String value){
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
        return "Language{" +
                "value='" + value + '\'' +
                '}';
    }

}
