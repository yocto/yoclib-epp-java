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

    public TransactionID setClientTransactionID(ClientTransactionID clTRID) {
        this.clTRID = clTRID;
        return this;
    }

    public TransactionID setServerTransactionID(ServerTransactionID svTRID) {
        this.svTRID = svTRID;
        return this;
    }

    @Override
    public String toString() {
        return "TransactionID{" +
                "clTRID=" + clTRID +
                ", svTRID=" + svTRID +
                '}';
    }

}
