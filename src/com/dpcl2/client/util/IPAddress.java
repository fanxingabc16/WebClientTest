package com.dpcl2.client.util;

import java.util.regex.*;

public class IPAddress
{
    private Pattern pattern;
    private Matcher matcher;
    private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    public IPAddress() {
        this.pattern = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        System.out.println(pattern);
    }
    
    public boolean validate(final String ip) {
        this.matcher = this.pattern.matcher(ip);
        return this.matcher.matches();
    }

    public static void main(String[] args) {
        IPAddress ip=new IPAddress();
        System.out.println();
    }
}
