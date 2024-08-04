package com.yocto.yoclib.epp;

import java.util.ArrayList;
import java.util.List;

public class DCP{

    private Access access;
    private final List<Statement> statement = new ArrayList<>();
    private Expiry expiry;

    public Access getAccess() {
        return this.access;
    }

    public List<Statement> getStatement() {
        return this.statement;
    }

    public Expiry getExpiry() {
        return this.expiry;
    }

    public DCP setAccess(Access access) {
        this.access = access;
        return this;
    }

    public DCP setExpiry(Expiry expiry) {
        this.expiry = expiry;
        return this;
    }

    @Override
    public String toString() {
        return "DCP{" +
                "access=" + access +
                ", statement=" + statement +
                ", expiry=" + expiry +
                '}';
    }

}