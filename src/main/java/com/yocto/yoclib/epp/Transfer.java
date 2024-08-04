package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.enums.TransferOperationEnum;
import com.yocto.yoclib.epp.types.CommandTypeChoice;

public class Transfer implements CommandTypeChoice {

    private TransferOperationEnum op;

    private Object any;

    public Object getAny() {
        return this.any;
    }

    public Transfer setAny(Object any) {
        this.any = any;
        return this;
    }

    public TransferOperationEnum getOperation() {
        return this.op;
    }

    public Transfer setOperation(TransferOperationEnum op) {
        this.op = op;
        return this;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "op=" + op +
                ", any=" + any +
                '}';
    }

}
