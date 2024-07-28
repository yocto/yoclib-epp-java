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

    public void setServerID(ServerID svID) {
        this.svID = svID;
    }

    public void setServerDate(ServerDate svDate) {
        this.svDate = svDate;
    }

    public void setServiceMenu(ServiceMenu svcMenu) {
        this.svcMenu = svcMenu;
    }

    public void setDCP(DCP dcp) {
        this.dcp = dcp;
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