package com.yocto.yoclib.epp;

public class Language {

    private String value;

    public Language(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public Language setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "Language{" +
                "value='" + value + '\'' +
                '}';
    }

}
