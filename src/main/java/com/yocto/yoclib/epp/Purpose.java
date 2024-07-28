package com.yocto.yoclib.epp;

public class Purpose {

    private Administrator admin;
    private Contact contact;
    private Other other;
    private Provisioning provisioning;

    public Administrator getAdmin() {
        return this.admin;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Other getOther() {
        return this.other;
    }

    public Provisioning getProvisioning() {
        return this.provisioning;
    }

    public void setAdministator(Administrator admin) {
        this.admin = admin;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public void setProvisioning(Provisioning provisioning) {
        this.provisioning = provisioning;
    }

    @Override
    public String toString() {
        return "Purpose{" +
                "admin=" + admin +
                ", contact=" + contact +
                ", other=" + other +
                ", provisioning=" + provisioning +
                '}';
    }

}
