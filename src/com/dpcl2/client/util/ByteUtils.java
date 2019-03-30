package com.dpcl2.client.util;

import java.io.*;

public class ByteUtils
{
    private static String numbers;
    
    static {
        ByteUtils.numbers = "0123456789ABCDEF";
    }
    
    public static String dumpHex(final byte byte0) {
        if ((byte0 & 0xFF) < 16) {
            return "0" + Integer.toHexString(byte0 & 0xFF);
        }
        return Integer.toHexString(byte0 & 0xFF);
    }
    
    public static String dumpHex(final byte[] abyte0, final int i, final int j) {
        final StringBuffer stringbuffer = new StringBuffer();
        for (int k = i; k < abyte0.length && k < i + j; ++k) {
            stringbuffer.append(dumpHex(abyte0[k]));
        }
        return stringbuffer.toString();
    }
    
    public static String dumpHex(final byte[] abyte0) {
        return dumpHex(abyte0, 0, abyte0.length);
    }
    
    public static boolean isBytesEqual(final byte[] abyte0, final byte[] abyte1) {
        if (abyte0.length != abyte1.length) {
            return false;
        }
        for (int i = 0; i < abyte0.length; ++i) {
            if (abyte0[i] != abyte1[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static final byte[] intToBytes(final int i) {
        final int j = (Integer.toHexString(i).length() + 1) / 2;
        final byte[] abyte0 = new byte[j];
        for (int k = 0; k < j; ++k) {
            abyte0[k] = (byte)(i >>> 8 * (j - 1 - k) & 0xFF);
        }
        return abyte0;
    }
    
    public static final byte intToByte(final int i) {
        final int j = (Integer.toHexString(i).length() + 1) / 2;
        final byte[] abyte0 = new byte[j];
        for (int k = 0; k < j; ++k) {
            abyte0[k] = (byte)(i >>> 8 * (j - 1 - k) & 0xFF);
        }
        return abyte0[0];
    }
    
    public static final int bytesToInt(final byte[] abyte0, final int i, final int j) {
        int k = 0;
        for (int l = 0; l < j; ++l) {
            k = (k << 8 | (abyte0[l + i] & 0xFF));
        }
        return k;
    }
    
    public static final byte[] toLengthOctets(final int i) {
        byte[] abyte0 = null;
        if (i < 128) {
            abyte0 = new byte[] { (byte)i };
        }
        else {
            final byte[] abyte2 = intToBytes(i);
            abyte0 = new byte[1 + abyte2.length];
            System.arraycopy(abyte2, 0, abyte0, 1, abyte2.length);
            abyte0[0] = (byte)(abyte2.length | 0x80);
        }
        return abyte0;
    }
    
    public static byte[] strToBytes(final String s) {
        if (s.length() % 2 != 0) {
            throw new IllegalArgumentException("String length % 2 != 0");
        }
        final ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        for (int i = 0; i < s.length(); i += 2) {
            byte byte0 = (byte)(Character.digit(s.charAt(i), 16) & 0xFF);
            byte0 <<= 4;
            byte0 |= (byte)Character.digit(s.charAt(i + 1), 16);
            bytearrayoutputstream.write(byte0);
        }
        return bytearrayoutputstream.toByteArray();
    }
    
    public static byte[] stoh(String s) {
        s = s.replaceAll(" ", "").toLowerCase();
        if (s == null) {
            return null;
        }
        if (s.length() % 2 != 0) {
            throw new RuntimeException("invalid length");
        }
        final byte[] result = new byte[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            final int i2 = ByteUtils.numbers.indexOf(s.charAt(i));
            if (i2 == -1) {
                throw new RuntimeException("invalid number");
            }
            final int i3 = ByteUtils.numbers.indexOf(s.charAt(i + 1));
            if (i3 == -1) {
                throw new RuntimeException("invalid number");
            }
            result[i / 2] = (byte)(i2 << 4 | i3);
        }
        return result;
    }
    
    public static String htos(final byte[] bytes) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; ++i) {
            String tmp;
            for (tmp = Integer.toHexString(bytes[i] & 0xFF); tmp.length() < 2; tmp = "0" + tmp) {}
            if (i != bytes.length - 1) {
                sb.append(tmp);
            }
            else {
                sb.append(tmp);
            }
        }
        return sb.toString().toUpperCase();
    }
}
