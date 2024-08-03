package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.PersonalAndOther;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PersonalAndOtherTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(PersonalAndOther.class,new PersonalAndOther());
    }

}