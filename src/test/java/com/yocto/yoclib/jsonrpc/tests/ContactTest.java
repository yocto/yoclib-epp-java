package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Contact;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ContactTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Contact.class,new Contact());
    }

    @Test
    public void testToString(){
        assertEquals("Contact{}",new Contact().toString());
    }

}