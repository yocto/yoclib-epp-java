package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.DCPRetentionTypeChoice;

public class Retention{

    private DCPRetentionTypeChoice choice;

    public DCPRetentionTypeChoice getChoice(){
        return this.choice;
    }

    public void setChoice(DCPRetentionTypeChoice choice){
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Retention{" +
                "choice=" + choice +
                '}';
    }

}