package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Public;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PublicTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Public.class,new Public());
    }

    @Test
    public void testToString(){
        assertEquals("Public{}",new Public().toString());
    }

}