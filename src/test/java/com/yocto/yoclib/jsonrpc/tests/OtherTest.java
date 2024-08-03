package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class OtherTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Other.class,new Other());
    }

}