package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.EPPTypeChoice;

public class Command implements EPPTypeChoice{

    private EPPTypeChoice choice;
    private Extension extension;
    private ClientTransactionID clTRID;

    public EPPTypeChoice getChoice() {
        return this.choice;
    }

    public Extension getExtension() {
        return this.extension;
    }

    public ClientTransactionID getClientTransactionID() {
        return clTRID;
    }

    public void setChoice(EPPTypeChoice choice) {
        this.choice = choice;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    public void setClientTransactionID(ClientTransactionID clTRID) {
        this.clTRID = clTRID;
    }

    @Override
    public String toString() {
        return "Command{" +
                "choice=" + choice +
                ", extension=" + extension +
                ", clTRID=" + clTRID +
                '}';
    }

}