package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Stated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class StatedTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Stated.class,new Stated());
    }

}