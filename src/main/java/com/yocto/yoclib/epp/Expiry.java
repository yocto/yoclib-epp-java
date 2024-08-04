package com.yocto.yoclib.epp;

public class Expiry{

    private Absolute absolute;
    private Relative relative;

    public Absolute getAbsolute() {
        return this.absolute;
    }

    public Relative getRelative() {
        return this.relative;
    }

    public Expiry setAbsolute(Absolute absolute) {
        this.absolute = absolute;
        return this;
    }

    public Expiry setRelative(Relative relative) {
        this.relative = relative;
        return this;
    }

    @Override
    public String toString() {
        return "Expiry{" +
                "absolute=" + absolute +
                ", relative=" + relative +
                '}';
    }

}