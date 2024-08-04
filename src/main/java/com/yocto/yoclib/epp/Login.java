package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.CommandTypeChoice;

public class Login implements CommandTypeChoice{

    private ClientID clID;
    private Password pw;
    private Password newPW;
    private Options options;
    private Services svcs;

    public ClientID getClientID() {
        return this.clID;
    }

    public Password getPassword() {
        return this.pw;
    }

    public Password getNewPassword() {
        return this.newPW;
    }

    public Options getOptions() {
        return this.options;
    }

    public Services getServices() {
        return this.svcs;
    }

    public Login setClientID(ClientID clID) {
        this.clID = clID;
        return this;
    }

    public Login setPassword(Password pw) {
        this.pw = pw;
        return this;
    }

    public Login setNewPassword(Password newPW) {
        this.newPW = newPW;
        return this;
    }

    public Login setOptions(Options options) {
        this.options = options;
        return this;
    }

    public Login setServices(Services svcs) {
        this.svcs = svcs;
        return this;
    }

    @Override
    public String toString() {
        return "Login{" +
                "clID=" + clID +
                ", pw=" + pw +
                ", newPW=" + newPW +
                ", options=" + options +
                ", svcs=" + svcs +
                '}';
    }

}