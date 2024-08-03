package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class HelloTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Hello.class,new Hello());
    }

    @Test
    public void testToString(){
        assertEquals("Hello{}",new Hello().toString());
    }

}