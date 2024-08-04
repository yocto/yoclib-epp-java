package com.yocto.yoclib.epp;

import java.util.Date;

public class ServerDate {

    private Date value;

    public ServerDate(Date value){
        this.value = value;
    }

    public Date getValue() {
        return this.value;
    }

    public ServerDate setValue(Date value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "ServerDate{" +
                "value=" + value +
                '}';
    }

}
