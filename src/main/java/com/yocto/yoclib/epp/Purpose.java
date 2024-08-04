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

    public Purpose setAdministator(Administrator admin) {
        this.admin = admin;
        return this;
    }

    public Purpose setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public Purpose setOther(Other other) {
        this.other = other;
        return this;
    }

    public Purpose setProvisioning(Provisioning provisioning) {
        this.provisioning = provisioning;
        return this;
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
