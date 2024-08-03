package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Administrator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AdministratorTest{

    @Test
    public void testConstructor(){
        assertInstanceOf(Administrator.class,new Administrator());
    }

    @Test
    public void testToString(){
        assertEquals("Administrator{}",new Administrator().toString());
    }

}