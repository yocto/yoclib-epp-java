package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.None;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class NoneTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(None.class,new None());
    }

    @Test
    public void testToString(){
        assertEquals("None{}",new None().toString());
    }

}