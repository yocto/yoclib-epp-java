package com.yocto.yoclib.epp;

import java.util.Date;

public class QueueDate {

    private Date value;

    public QueueDate(Date value){
        this.value = value;
    }

    public Date getValue() {
        return this.value;
    }

    public QueueDate setValue(Date value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "QueueDate{" +
                "value=" + value +
                '}';
    }

}
