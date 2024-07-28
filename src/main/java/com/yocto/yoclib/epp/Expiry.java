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

    public void setAbsolute(Absolute absolute) {
        this.absolute = absolute;
    }

    public void setRelative(Relative relative) {
        this.relative = relative;
    }

    @Override
    public String toString() {
        return "Expiry{" +
                "absolute=" + absolute +
                ", relative=" + relative +
                '}';
    }

}