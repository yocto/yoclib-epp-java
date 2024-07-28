package com.yocto.yoclib.epp.enums;

public enum ResultCodeEnum {

    E1000((short) 1000),
    E1001((short) 1001),
    E1300((short) 1300),
    E1301((short) 1301),
    E1500((short) 1500),
    E2000((short) 2000),
    E2001((short) 2001),
    E2002((short) 2002),
    E2003((short) 2003),
    E2004((short) 2004),
    E2005((short) 2005),
    E2100((short) 2100),
    E2101((short) 2101),
    E2102((short) 2102),
    E2103((short) 2103),
    E2104((short) 2104),
    E2105((short) 2105),
    E2106((short) 2106),
    E2200((short) 2200),
    E2201((short) 2201),
    E2202((short) 2202),
    E2300((short) 2300),
    E2301((short) 2301),
    E2302((short) 2302),
    E2303((short) 2303),
    E2304((short) 2304),
    E2305((short) 2305),
    E2306((short) 2306),
    E2307((short) 2307),
    E2308((short) 2308),
    E2400((short) 2400),
    E2500((short) 2500),
    E2501((short) 2501),
    E2502((short) 2502);

    private short value;

    ResultCodeEnum(short value){
        this.value = value;
    }

    public short getValue(){
        return this.value;
    }
}
