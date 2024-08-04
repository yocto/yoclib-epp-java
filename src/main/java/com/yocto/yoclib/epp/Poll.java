package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.enums.PollOperationEnum;
import com.yocto.yoclib.epp.types.CommandTypeChoice;

public class Poll implements CommandTypeChoice {

    private PollOperationEnum op;
    private String msgID;

    public PollOperationEnum getOperation() {
        return this.op;
    }

    public String getMessageID() {
        return this.msgID;
    }

    public Poll setOperation(PollOperationEnum op) {
        this.op = op;
        return this;
    }

    public Poll setMessageID(String msgID) {
        this.msgID = msgID;
        return this;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "op=" + op +
                ", msgID='" + msgID + '\'' +
                '}';
    }

}
