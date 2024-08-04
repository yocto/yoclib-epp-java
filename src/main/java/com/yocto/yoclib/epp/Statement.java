package com.yocto.yoclib.epp;

public class Statement{

    private Purpose purpose;
    private Recipient recipient;
    private Retention retention;

    public Purpose getPurpose() {
        return this.purpose;
    }

    public Recipient getRecipient() {
        return this.recipient;
    }

    public Retention getRetention() {
        return this.retention;
    }

    public Statement setPurpose(Purpose purpose) {
        this.purpose = purpose;
        return this;
    }

    public Statement setRecipient(Recipient recipient) {
        this.recipient = recipient;
        return this;
    }

    public Statement setRetention(Retention retention) {
        this.retention = retention;
        return this;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "purpose=" + purpose +
                ", recipient=" + recipient +
                ", retention=" + retention +
                '}';
    }

}