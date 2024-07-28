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

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public void setRetention(Retention retention) {
        this.retention = retention;
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