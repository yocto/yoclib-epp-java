package com.yocto.yoclib.epp;

public class Message {

    private String value;
    private String lang;

    public Message(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public String getLanguage() {
        return this.lang;
    }

    public Message setValue(String value) {
        this.value = value;
        return this;
    }

    public Message setLanguage(String lang) {
        this.lang = lang;
        return this;
    }

    @Override
    public String toString() {
        return "Message{" +
                "value='" + value + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }

}
