package com.yocto.yoclib.epp;

import java.util.ArrayList;
import java.util.List;

public class ResponseData {

    private final List<Object> any = new ArrayList<>();

    public List<Object> getAny() {
        return this.any;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "any=" + any +
                '}';
    }

}
