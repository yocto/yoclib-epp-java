package com.yocto.yoclib.epp;

public class Ours{

    private RecipientDescription recDesc;

    public RecipientDescription getRecipientDescription() {
        return this.recDesc;
    }

    public Ours setRecipientDescription(RecipientDescription recDesc) {
        this.recDesc = recDesc;
        return this;
    }

    @Override
    public String toString() {
        return "Ours{" +
                "recDesc=" + recDesc +
                '}';
    }

}