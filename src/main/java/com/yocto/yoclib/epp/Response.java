package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.EPPTypeChoice;

import java.util.ArrayList;
import java.util.List;

public class Response implements EPPTypeChoice {

    private final List<Result> result = new ArrayList<>();
    private MessageQueue msgQ;
    private ResponseData resData;
    private Extension extension;
    private TransactionID trID;

    public List<Result> getResult() {
        return this.result;
    }

    public MessageQueue getMessageQ() {
        return this.msgQ;
    }

    public ResponseData getResponseData() {
        return this.resData;
    }

    public Extension getExtension() {
        return this.extension;
    }

    public TransactionID getTransactionID() {
        return this.trID;
    }

    public Response setMessageQueue(MessageQueue msgQ) {
        this.msgQ = msgQ;
        return this;
    }

    public Response setResponseData(ResponseData resData) {
        this.resData = resData;
        return this;
    }

    public Response setExtension(Extension extension) {
        this.extension = extension;
        return this;
    }

    public Response setTransactionID(TransactionID trID) {
        this.trID = trID;
        return this;
    }

    @Override
    public String toString() {
        return "Response{" +
                "result=" + result +
                ", msgQ=" + msgQ +
                ", resData=" + resData +
                ", extension=" + extension +
                ", trID=" + trID +
                '}';
    }

}
