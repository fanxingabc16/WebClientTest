package com.dpcl2.client.util;

public enum SCardProtocol
{
    SCARD_PROTOCOL_T0("SCARD_PROTOCOL_T0", 0), 
    SCARD_PROTOCOL_T1("SCARD_PROTOCOL_T1", 1), 
    SCARD_PROTOCOL_RAW("SCARD_PROTOCOL_RAW", 2), 
    SCARD_PROTOCOL_T0_OR_T1("SCARD_PROTOCOL_T0_OR_T1", 3), 
    SCARD_PROTOCOL_CL("SCARD_PROTOCOL_CL", 4);
    
    private SCardProtocol(final String s, final int n) {
    }
}
