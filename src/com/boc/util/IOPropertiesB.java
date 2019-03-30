package com.boc.util;

import java.util.*;
import java.io.*;

public class IOPropertiesB
{
    public static String strPath;
    private Properties prop;
    
    static {
        IOPropertiesB.strPath = "";
    }
    
    public IOPropertiesB(final String _strPath) {
        this.prop = new Properties();
        IOPropertiesB.strPath = _strPath;
        System.out.println("Properties File Path = " + IOPropertiesB.strPath);
        try {
            final InputStream ips = new BufferedInputStream(new FileInputStream(IOPropertiesB.strPath));
            this.prop.load(ips);
            ips.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (SecurityException e2) {
            e2.printStackTrace();
        }
        catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        }
        catch (IOException e4) {
            e4.printStackTrace();
        }
    }
    
    public String GetValue(final String keyName) {
        return this.prop.getProperty(keyName);
    }
    
    public void SetValue(final String keyName, final String keyvalue) {
        this.prop.setProperty(keyName, keyvalue);
    }
    
    public String GetDefaultValue(final String keyName, final String strDefault) {
        final String strResp = this.prop.getProperty(keyName);
        if (strResp == null) {
            return strDefault;
        }
        return strResp;
    }
    
    public int GetIntDefaultValue(final String keyName, final int cInt) {
        final String strResp = this.prop.getProperty(keyName);
        if (strResp == null) {
            return cInt;
        }
        return Integer.parseInt(strResp);
    }
    
    public boolean GetBooleanDefaultValue(final String keyName, final boolean cbool) {
        final String strResp = this.prop.getProperty(keyName);
        if (strResp == null) {
            return cbool;
        }
        return Boolean.parseBoolean(strResp);
    }
}
