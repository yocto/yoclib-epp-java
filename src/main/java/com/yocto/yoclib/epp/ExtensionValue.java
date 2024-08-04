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

    public ExtensionValue setValue(Value value) {
        this.value = value;
        return this;
    }

    public ExtensionValue setReason(Reason reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        return "ExtensionValue{" +
                "value=" + value +
                ", reason=" + reason +
                '}';
    }

}
