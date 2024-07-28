package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.DCPAccessTypeChoice;

public class Access {

    DCPAccessTypeChoice choice;

    public DCPAccessTypeChoice getChoice() {
        return this.choice;
    }

    public void setChoice(DCPAccessTypeChoice choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Access{" +
                "choice=" + choice +
                '}';
    }

}
