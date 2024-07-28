package com.yocto.yoclib.epp;

public class Message {

    private String value;
    private String lang;

    public String getValue() {
        return this.value;
    }

    public String getLanguage() {
        return this.lang;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Message{" +
                "value='" + value + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }

}
