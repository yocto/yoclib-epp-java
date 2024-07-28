package com.yocto.yoclib.epp;

public class TransactionID {

    private ClientTransactionID clTRID;
    private ServerTransactionID svTRID;

    public ClientTransactionID getClientTransactionID() {
        return this.clTRID;
    }

    public ServerTransactionID getServerTransactionID() {
        return this.svTRID;
    }

    public void setClientTransactionID(ClientTransactionID clTRID) {
        this.clTRID = clTRID;
    }

    public void setServerTransactionID(ServerTransactionID svTRID) {
        this.svTRID = svTRID;
    }

    @Override
    public String toString() {
        return "TransactionID{" +
                "clTRID=" + clTRID +
                ", svTRID=" + svTRID +
                '}';
    }

}
