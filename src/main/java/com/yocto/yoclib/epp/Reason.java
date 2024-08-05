package com.yocto.yoclib.epp;

public class Reason {

    private String lang;

    private String value;

    public Reason(String value){
        this.value = value;
    }

    public String getLanguage() {
        return this.lang;
    }

    public String getValue() {
        return this.value;
    }

    public Reason setLanguage(String lang) {
        this.lang = lang;
        return this;
    }

    public Reason setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "lang='" + lang + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
