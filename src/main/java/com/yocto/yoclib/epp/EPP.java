package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.EPPTypeChoice;

public class EPP{

    EPPTypeChoice choice;

    public EPPTypeChoice getChoice(){
        return this.choice;
    }

    public void setChoice(EPPTypeChoice choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "EPP{" +
                "choice=" + choice +
                '}';
    }

}