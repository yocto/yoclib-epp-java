package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Null;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class NullTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Null.class,new Null());
    }

}