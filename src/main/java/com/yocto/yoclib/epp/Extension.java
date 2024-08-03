package com.yocto.yoclib.epp;

import com.yocto.yoclib.epp.types.EPPTypeChoice;

import java.util.ArrayList;
import java.util.List;

public class Extension implements EPPTypeChoice {

    private final List<Object> any = new ArrayList<>();

    public List<Object> getAny() {
        return this.any;
    }

    @Override
    public String toString() {
        return "Extension{" +
                "any=" + any +
                '}';
    }

}