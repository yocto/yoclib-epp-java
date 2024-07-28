package com.yocto.yoclib.epp;

public class Reason {

    private String lang;

    private String value;

    public String getLanguage() {
        return this.lang;
    }

    public String getValue() {
        return this.value;
    }

    public void setLanguage(String lang) {
        this.lang = lang;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "lang='" + lang + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
