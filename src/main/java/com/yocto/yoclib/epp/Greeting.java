package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.EPPTypeChoice;

public class Greeting implements EPPTypeChoice {

    private ServerID svID;
    private ServerDate svDate;
    private ServiceMenu svcMenu;
    private DCP dcp;

    public ServerID getServerID() {
        return this.svID;
    }

    public ServerDate getServerDate() {
        return this.svDate;
    }

    public ServiceMenu getServiceMenu() {
        return this.svcMenu;
    }

    public DCP getDCP() {
        return this.dcp;
    }

    public Greeting setServerID(ServerID svID) {
        this.svID = svID;
        return this;
    }

    public Greeting setServerDate(ServerDate svDate) {
        this.svDate = svDate;
        return this;
    }

    public Greeting setServiceMenu(ServiceMenu svcMenu) {
        this.svcMenu = svcMenu;
        return this;
    }

    public Greeting setDCP(DCP dcp) {
        this.dcp = dcp;
        return this;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "svID=" + svID +
                ", svDate=" + svDate +
                ", svcMenu=" + svcMenu +
                ", dcp=" + dcp +
                '}';
    }

}