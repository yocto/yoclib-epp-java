package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Provisioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ProvisioningTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Provisioning.class,new Provisioning());
    }

    @Test
    public void testToString(){
        assertEquals("Provisioning{}",new Provisioning().toString());
    }

}