package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.enums.ResultCodeEnum;
import com.yocto.yoclib.epp.types.ResultTypeChoice;

import java.util.ArrayList;
import java.util.List;

public class Result{

    private Message msg;
    private final List<ResultTypeChoice> choice = new ArrayList<>();
    private ResultCodeEnum code;

    public Message getMsg() {
        return this.msg;
    }

    public List<ResultTypeChoice> getChoice() {
        return this.choice;
    }

    public ResultCodeEnum getCode() {
        return this.code;
    }

    public void setMessage(Message msg) {
        this.msg = msg;
    }

    public void setCode(ResultCodeEnum code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Result{" +
                "msg=" + msg +
                ", choice=" + choice +
                ", code=" + code +
                '}';
    }

}
