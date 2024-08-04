package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.DCPRetentionTypeChoice;

public class Retention{

    private DCPRetentionTypeChoice choice;

    public DCPRetentionTypeChoice getChoice(){
        return this.choice;
    }

    public Retention setChoice(DCPRetentionTypeChoice choice){
        this.choice = choice;
        return this;
    }

    @Override
    public String toString() {
        return "Retention{" +
                "choice=" + choice +
                '}';
    }

}