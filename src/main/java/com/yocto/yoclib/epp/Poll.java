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

    public void setOperation(PollOperationEnum op) {
        this.op = op;
    }

    public void setMessageID(String msgID) {
        this.msgID = msgID;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "op=" + op +
                ", msgID='" + msgID + '\'' +
                '}';
    }

}
