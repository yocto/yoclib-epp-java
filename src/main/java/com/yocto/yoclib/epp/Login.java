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

    public void setClientID(ClientID clID) {
        this.clID = clID;
    }

    public void setPassword(Password pw) {
        this.pw = pw;
    }

    public void setNewPassword(Password newPW) {
        this.newPW = newPW;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public void setServices(Services svcs) {
        this.svcs = svcs;
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