package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Same;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class SameTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Same.class,new Same());
    }

}