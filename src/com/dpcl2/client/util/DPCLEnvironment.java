package com.dpcl2.client.util;

import java.io.*;

public class DPCLEnvironment
{
    private String filename;
    private long jobId;
    
    public DPCLEnvironment() {
        this.filename = "dpclEnv.txt";
        this.jobId = 0L;
        this.loadEnvironment();
    }
    
    public void setJobId(final long _jobId) {
        this.jobId = _jobId;
    }
    
    public long getJobId() {
        return this.jobId;
    }
    
    public long getNextJobId() {
        ++this.jobId;
        this.saveEnvironment();
        return this.jobId;
    }
    
    private void saveEnvironment() {
        try {
            final FileWriter fileWriter = new FileWriter(this.filename);
            final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(Long.toString(this.jobId));
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Saved job id " + this.jobId);
        }
        catch (IOException ex) {
            System.out.println("Error writing file " + this.filename);
        }
    }
    
    private void loadEnvironment() {
        String line = null;
        try {
            final FileReader fileReader = new FileReader(this.filename);
            final BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            if (line != null) {
                this.jobId = Long.valueOf(line);
                System.out.println("Loaded job id " + this.jobId);
            }
            bufferedReader.close();
        }
        catch (IOException ex) {
            System.out.println("Error reading file " + this.filename);
        }
    }
}
