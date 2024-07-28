package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.enums.TransferOperationEnum;
import com.yocto.yoclib.epp.types.CommandTypeChoice;

public class Transfer implements CommandTypeChoice {

    private TransferOperationEnum op;

    //TODO TYPE: ##other

    public TransferOperationEnum getOperation() {
        return this.op;
    }

    public void setOperation(TransferOperationEnum op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "op=" + op +
                '}';
    }

}
