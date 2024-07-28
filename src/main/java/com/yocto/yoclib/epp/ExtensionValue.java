package com.yocto.yoclib.epp;

public class ExtensionValue {

    private Value value;
    private Reason reason;

    public Value getValue() {
        return this.value;
    }

    public Reason getReason() {
        return this.reason;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ExtensionValue{" +
                "value=" + value +
                ", reason=" + reason +
                '}';
    }

}
