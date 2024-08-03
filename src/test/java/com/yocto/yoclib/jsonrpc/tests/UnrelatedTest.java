package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Unrelated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class UnrelatedTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Unrelated.class,new Unrelated());
    }

}