package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.EPPTypeChoice;

public class EPP{

    private EPPTypeChoice choice;

    public EPPTypeChoice getChoice(){
        return this.choice;
    }

    public EPP setChoice(EPPTypeChoice choice) {
        this.choice = choice;
        return this;
    }

    @Override
    public String toString() {
        return "EPP{" +
                "choice=" + choice +
                '}';
    }

}