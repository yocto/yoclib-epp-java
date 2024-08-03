package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.All;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AllTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(All.class,new All());
    }

}