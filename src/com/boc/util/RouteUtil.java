package com.boc.util;

import java.io.*;
import java.net.*;

public class RouteUtil
{
    public static final String BOCPATH;
    public static final String DPCL2WSDLPATH;
    public static final String strSCPath;
    
    static {
        BOCPATH = getProjectPath();
        DPCL2WSDLPATH = "file:" + getProjectPath() + File.separator + "DPCL2.wsdl";
        strSCPath = String.valueOf(getProjectPath()) + File.separator + "JobID.properties";
    }
    
    private static String getProjectPath() {
        final URL url = RouteUtil.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = null;
        try {
            filePath = URLDecoder.decode(url.getPath(), "utf-8");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        if (filePath.endsWith(".jar")) {
            filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
        }
        final File file = new File(filePath);
        filePath = file.getAbsolutePath();
        return filePath;
    }
}
