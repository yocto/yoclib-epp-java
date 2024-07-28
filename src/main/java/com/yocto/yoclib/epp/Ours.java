package com.yocto.yoclib.epp;

public class Ours{

    private RecipientDescription recDesc;

    public RecipientDescription getRecipientDescription() {
        return this.recDesc;
    }

    public void setRecipientDescription(RecipientDescription recDesc) {
        this.recDesc = recDesc;
    }

    @Override
    public String toString() {
        return "Ours{" +
                "recDesc=" + recDesc +
                '}';
    }

}