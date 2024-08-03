package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Logout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class LogoutTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Logout.class,new Logout());
    }

}