package com.dpcl2.client.util;

public enum SCardDisposition
{
    SCARD_LEAVE_CARD("SCARD_LEAVE_CARD", 0), 
    SCARD_RESET_CARD("SCARD_RESET_CARD", 1), 
    SCARD_UNPOWER_CARD("SCARD_UNPOWER_CARD", 2);
    
    private SCardDisposition(final String s, final int n) {
    }
}
