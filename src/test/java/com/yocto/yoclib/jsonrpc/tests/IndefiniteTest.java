package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Indefinite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class IndefiniteTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Indefinite.class,new Indefinite());
    }

}