package com.boc.util;

import java.text.*;
import java.util.*;
import java.io.*;
import org.apache.log4j.*;

public class WLog
{
    private static String strFP;
    public static Logger log;
    public static String ipLog;
    public static String driveName;
    
    static {
        WLog.strFP = "/qis/Printer3Log";
        WLog.log = Logger.getLogger((Class)WLog.class);
        WLog.ipLog = "";
        WLog.driveName = "";
    }
    
    public static void LoadFilePath() {
        WLog.log.removeAllAppenders();
        WLog.log.addAppender((Appender)getFileAppender());
    }
    
    private static FileAppender getFileAppender() {
        try {
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            final String yyyyMMdd = sdf.format(new Date());
            final String fullPath = String.valueOf(WLog.strFP) + File.separator + yyyyMMdd + File.separator + WLog.driveName + File.separator;
            final File file = new File(fullPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            final String filePath = String.valueOf(fullPath) + WLog.ipLog + ".log";
            final PatternLayout layout = new PatternLayout("%d{[yyyy-MM-dd HH:mm:ss,SSS]} %m - [%t] [%p] [%C.%M(%L)]%n");
            final FileAppender afa = new FileAppender((Layout)layout, filePath, true);
            afa.setThreshold(Priority.DEBUG);
            return afa;
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        }
    }
}
