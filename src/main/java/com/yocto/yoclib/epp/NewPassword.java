package com.yocto.yoclib.epp;

public class NewPassword {

    private String value;

    public NewPassword(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public NewPassword setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "NewPassword{" +
                "value='" + value + '\'' +
                '}';
    }

}
