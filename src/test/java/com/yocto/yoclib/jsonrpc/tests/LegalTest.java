package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Legal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class LegalTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Legal.class,new Legal());
    }

}