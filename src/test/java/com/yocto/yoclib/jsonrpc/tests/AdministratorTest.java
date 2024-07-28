package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Administrator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdministratorTest{

    @Test
    public void testConstructor(){
        assertInstanceOf(Administrator.class,new Administrator());
    }

}