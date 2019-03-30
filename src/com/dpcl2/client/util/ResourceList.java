package com.dpcl2.client.util;

import java.util.regex.*;
import java.io.*;
import java.util.zip.*;
import java.util.*;

public class ResourceList
{
    public static Collection<String> getResources(final Pattern pattern) {
        final ArrayList retval = new ArrayList();
        final String classPath = System.getProperty("java.class.path", ".");
        final String[] classPathElements = classPath.split(System.getProperty("path.separator"));
        String[] array;
        for (int length = (array = classPathElements).length, i = 0; i < length; ++i) {
            final String element = array[i];
            retval.addAll(getResources(element, pattern));
        }
        return (Collection<String>)retval;
    }
    
    private static Collection<String> getResources(final String element, final Pattern pattern) {
        final ArrayList retval = new ArrayList();
        final File file = new File(element);
        if (file.isDirectory()) {
            retval.addAll(getResourcesFromDirectory(file, pattern));
        }
        else {
            retval.addAll(getResourcesFromJarFile(file, pattern));
        }
        return (Collection<String>)retval;
    }
    
    private static Collection<String> getResourcesFromJarFile(final File file, final Pattern pattern) {
        final ArrayList retval = new ArrayList();
        ZipFile zf;
        try {
            zf = new ZipFile(file);
        }
        catch (ZipException e) {
            throw new Error(e);
        }
        catch (IOException e2) {
            throw new Error(e2);
        }
        final Enumeration e3 = zf.entries();
        while (e3.hasMoreElements()) {
            final ZipEntry ze = (ZipEntry) e3.nextElement();
            final String fileName = ze.getName();
            final boolean accept = pattern.matcher(fileName).matches();
            if (accept) {
                retval.add(fileName);
            }
        }
        try {
            zf.close();
        }
        catch (IOException e4) {
            throw new Error(e4);
        }
        return (Collection<String>)retval;
    }
    
    private static Collection<String> getResourcesFromDirectory(final File directory, final Pattern pattern) {
        final ArrayList retval = new ArrayList();
        final File[] fileList = directory.listFiles();
        File[] array;
        for (int length = (array = fileList).length, i = 0; i < length; ++i) {
            final File file = array[i];
            if (file.isDirectory()) {
                retval.addAll(getResourcesFromDirectory(file, pattern));
            }
            else {
                try {
                    final String fileName = file.getCanonicalPath();
                    final boolean accept = pattern.matcher(fileName).matches();
                    if (accept) {
                        retval.add(fileName);
                    }
                }
                catch (IOException e) {
                    throw new Error(e);
                }
            }
        }
        return (Collection<String>)retval;
    }
}
