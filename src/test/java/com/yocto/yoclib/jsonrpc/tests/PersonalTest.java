package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PersonalTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Personal.class,new Personal());
    }

    @Test
    public void testToString(){
        assertEquals("Personal{}",new Personal().toString());
    }

}