package com.yocto.yoclib.jsonrpc.tests;

import com.yocto.yoclib.epp.Version;
import com.yocto.yoclib.epp.enums.VersionEnum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VersionTest {

    @Test
    public void testConstructor(){
        assertInstanceOf(Version.class,new Version(VersionEnum.V1_0));
        assertInstanceOf(Version.class,new Version(null));
    }

    @Test
    public void testGetValue(){
        assertEquals(VersionEnum.V1_0,new Version(VersionEnum.V1_0).getValue());
        assertNull(new Version(null).getValue());
    }

    @Test
    public void testSetValue(){
        assertEquals(VersionEnum.V1_0,new Version(null).setValue(VersionEnum.V1_0).getValue());
        assertNull(new Version(VersionEnum.V1_0).setValue(null).getValue());
    }

    @Test
    public void testToString(){
        assertEquals("Version{value='v1.0'}",new Version(VersionEnum.V1_0).toString());
    }

}