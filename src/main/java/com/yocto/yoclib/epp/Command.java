package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.CommandTypeChoice;
import com.yocto.yoclib.epp.types.EPPTypeChoice;

public class Command implements EPPTypeChoice{

    private CommandTypeChoice choice;
    private Extension extension;
    private ClientTransactionID clTRID;

    public CommandTypeChoice getChoice() {
        return this.choice;
    }

    public Extension getExtension() {
        return this.extension;
    }

    public ClientTransactionID getClientTransactionID() {
        return clTRID;
    }

    public Command setChoice(CommandTypeChoice choice) {
        this.choice = choice;
        return this;
    }

    public Command setExtension(Extension extension) {
        this.extension = extension;
        return this;
    }

    public Command setClientTransactionID(ClientTransactionID clTRID) {
        this.clTRID = clTRID;
        return this;
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