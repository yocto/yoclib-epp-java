package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class BusinessTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Business.class,new Business());
    }

    @Test
    public void testToString(){
        assertEquals("Business{}",new Business().toString());
    }

}