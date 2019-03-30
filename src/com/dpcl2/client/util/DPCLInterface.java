package com.dpcl2.client.util;

import javax.xml.namespace.*;
import java.util.*;
import org.apache.commons.io.*;
import javax.xml.transform.stream.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.bind.*;
import com.dpcl2.ws.client.*;


public class DPCLInterface
{
    private static DPCL2PortType port;
    private static List<Option> discoverPrinterOptionList;
    private static List<Version> discoverPrinterVersionList;
    private static boolean connected;
    private static long minConditionMarker;
    private static long minSettingMarker;
    private static long minSensorMarker;
    private static long minSupplyMarker;
    private static DPCLEnvironment dpclEnvironment;
    private static String clientName;
    private static long actionId;
    private static long dataId;
    private static HashMap<String, String> extensionToContentMap;
    private static Settings retrievedSettings;
    private static QName currentJobQueueState;
    private static QName currentLockedState;
    
    static {
        DPCLInterface.connected = false;
        DPCLInterface.minConditionMarker = 0L;
        DPCLInterface.minSettingMarker = 0L;
        DPCLInterface.minSensorMarker = 0L;
        DPCLInterface.minSupplyMarker = 0L;
        DPCLInterface.clientName = "Java GUI Client";
        DPCLInterface.actionId = 0L;
        DPCLInterface.dataId = 0L;
        DPCLInterface.extensionToContentMap = new HashMap<String, String>();
    }
    
    public DPCLInterface(final DPCL2PortType _port) {
        DPCLInterface.port = _port;
        DPCLInterface.discoverPrinterOptionList = new ArrayList<Option>();
        DPCLInterface.discoverPrinterVersionList = new ArrayList<Version>();
        DPCLInterface.dpclEnvironment = new DPCLEnvironment();
        DPCLInterface.extensionToContentMap.put("tiff_cmyk", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tiff_cmy", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tiff_monochrome", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tiff_primer", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tiff_inhibit", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tiff_fluorescent", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tiff_spotcolor", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tiff_loadcachedimage", "application/Cache");
        DPCLInterface.extensionToContentMap.put("tif_cmyk", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tif_cmy", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tif_monochrome", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tif_primer", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tif_inhibit", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tif_fluorescent", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tif_spotcolor", "image/tiff");
        DPCLInterface.extensionToContentMap.put("tif_loadcachedimage", "application/Cache");
        DPCLInterface.extensionToContentMap.put("bmp_cmyk", "image/bmp");
        DPCLInterface.extensionToContentMap.put("bmp_cmy", "image/bmp");
        DPCLInterface.extensionToContentMap.put("bmp_monochrome", "image/bmp");
        DPCLInterface.extensionToContentMap.put("bmp_primer", "image/bmp");
        DPCLInterface.extensionToContentMap.put("bmp_inhibit", "image/bmp");
        DPCLInterface.extensionToContentMap.put("bmp_fluorescent", "image/bmp");
        DPCLInterface.extensionToContentMap.put("bmp_spotcolor", "image/bmp");
        DPCLInterface.extensionToContentMap.put("bmp_loadcachedimage", "application/Cache");
        DPCLInterface.extensionToContentMap.put("jpg_cmyk", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpg_cmy", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpg_monochrome", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpg_primer", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpg_inhibit", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpg_fluorescent", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpg_spotcolor", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpg_loadcachedimage", "application/Cache");
        DPCLInterface.extensionToContentMap.put("jpeg_cmyk", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpeg_cmy", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpeg_monochrome", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpeg_primer", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpeg_inhibit", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpeg_fluorescent", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpeg_spotcolor", "image/jpeg");
        DPCLInterface.extensionToContentMap.put("jpeg_loadcachedimage", "application/Cache");
        DPCLInterface.extensionToContentMap.put("png_cmyk", "image/png");
        DPCLInterface.extensionToContentMap.put("png_cmy", "image/png");
        DPCLInterface.extensionToContentMap.put("png_monochrome", "image/png");
        DPCLInterface.extensionToContentMap.put("png_primer", "image/png");
        DPCLInterface.extensionToContentMap.put("png_inhibit", "image/png");
        DPCLInterface.extensionToContentMap.put("png_fluorescent", "image/png");
        DPCLInterface.extensionToContentMap.put("png_spotcolor", "image/png");
        DPCLInterface.extensionToContentMap.put("png_loadcachedimage", "application/Cache");
        DPCLInterface.extensionToContentMap.put("vrf_cmyk", "image/dithered");
        DPCLInterface.extensionToContentMap.put("vrf_cmy", "image/dithered");
        DPCLInterface.extensionToContentMap.put("vrf_monochrome", "image/dithered");
        DPCLInterface.extensionToContentMap.put("vrf_primer", "image/dithered");
        DPCLInterface.extensionToContentMap.put("vrf_inhibit", "image/dithered");
        DPCLInterface.extensionToContentMap.put("vrf_fluorescent", "image/dithered");
        DPCLInterface.extensionToContentMap.put("vrf_spotcolor", "image/dithered");
        DPCLInterface.extensionToContentMap.put("icc_loadiccprofile", "application/ICC");
        DPCLInterface.extensionToContentMap.put("dot_loaddotgaintable", "application/DotGain");
        DPCLInterface.extensionToContentMap.put("xml_magstripeencode", "application/vnd.dpcl.magstripe+xml");
        DPCLInterface.extensionToContentMap.put("xml_embcarddata", "application/vnd.dpcl.emboss+xml");
        DPCLInterface.currentJobQueueState = new QName("urn:dpcl:wsdl:2011-09-02", "Offline");
    }
    
    public static boolean isConnected() {
        return DPCLInterface.connected;
    }
    
    public static void setConnected(final boolean _connected) {
        DPCLInterface.connected = _connected;
    }
    
    public static QName getJobQueueState() {
        return DPCLInterface.currentJobQueueState;
    }
    
    public static void setJobQueueState(final QName _state) {
        DPCLInterface.currentJobQueueState = _state;
        System.out.println("Job queue state is " + DPCLInterface.currentJobQueueState.getLocalPart());
    }
    
    public static QName getLockedState() {
        return DPCLInterface.currentLockedState;
    }
    
    public static void setLockedState(final QName _state) {
        DPCLInterface.currentLockedState = _state;
        System.out.println("Locked state is " + DPCLInterface.currentLockedState.getLocalPart());
    }
    
    public static boolean doDiscoverPrinter2() {
        boolean isSuccessful = false;
        try {
            final DiscoverPrinter2Input dpInput = new DiscoverPrinter2Input();
            dpInput.setIncludeActions(false);
            DiscoverPrinter2Output dpOutput = new DiscoverPrinter2Output();
            dpOutput = DPCLInterface.port.discoverPrinter2(dpInput);
            DPCLInterface.discoverPrinterOptionList = dpOutput.getOption();
            DPCLInterface.discoverPrinterVersionList = dpOutput.getVersion();
            isSuccessful = true;
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        return isSuccessful;
    }
    
    public static List<Option> getDiscoverPrinter2OptionList() {
        return DPCLInterface.discoverPrinterOptionList;
    }
    
    public static List<Version> getDiscoverPrinter2VersionList() {
        return DPCLInterface.discoverPrinterVersionList;
    }
    
    public static WaitForStatus2Output doWaitForStatus2(final boolean initializing) {
        WaitForStatus2Output WFS2Output = new WaitForStatus2Output();
        final WaitForStatus2Input WFS2Input = new WaitForStatus2Input();
        if (initializing) {
            WFS2Input.setIncludeSettings(true);
            WFS2Input.setIncludeConditions(false);
            WFS2Input.setIncludeCounters(false);
            WFS2Input.setIncludeJobQueue(false);
            WFS2Input.setIncludeNetworkAdapters(false);
            WFS2Input.setIncludeSensors(false);
            WFS2Input.setIncludeSupplies(false);
            WFS2Input.setIncludeTunnels(false);
            WFS2Input.setMaxSeconds(0);
            WFS2Input.setMinConditionMarker(0L);
            WFS2Input.setMinSettingMarker(0L);
            WFS2Input.setMinSensorMarker(0L);
            WFS2Input.setMinSupplyMarker(0L);
            WFS2Input.setMatchConditionClient("");
            WFS2Input.setMatchConditionJobId(0L);
            WFS2Input.setMinConditionSeverity(ConditionSeverity.fromValue("Critical"));
        }
        else {
            WFS2Input.setIncludeSettings(false);
            WFS2Input.setIncludeConditions(true);
            WFS2Input.setIncludeCounters(false);
            WFS2Input.setIncludeJobQueue(true);
            WFS2Input.setIncludeNetworkAdapters(false);
            WFS2Input.setIncludeSensors(false);
            WFS2Input.setIncludeSupplies(true);
            WFS2Input.setIncludeTunnels(false);
            WFS2Input.setMaxSeconds(5);
            WFS2Input.setMinConditionMarker(0L);
            WFS2Input.setMinSettingMarker(DPCLInterface.minSettingMarker);
            WFS2Input.setMinSensorMarker(DPCLInterface.minSensorMarker);
            WFS2Input.setMinSupplyMarker(DPCLInterface.minSupplyMarker);
            WFS2Input.setMatchConditionClient("");
            WFS2Input.setMatchConditionJobId(0L);
            WFS2Input.setMinConditionSeverity(ConditionSeverity.fromValue("Notice"));
        }
        try {
            WFS2Output = DPCLInterface.port.waitForStatus2(WFS2Input);
            DPCLInterface.minConditionMarker = WFS2Output.getNextConditionMarker();
            DPCLInterface.minSettingMarker = WFS2Output.getNextSettingMarker();
            DPCLInterface.minSensorMarker = WFS2Output.getNextSensorMarker();
            DPCLInterface.minSupplyMarker = WFS2Output.getNextSupplyMarker();
        }
        catch (Exception ex) {}
        return WFS2Output;
    }
    
    public static String doRetrieveInfoServiceCode(final String client, final long jobId, final long code) {
        final RetrieveInfoInput retrieveInput = new RetrieveInfoInput();
        retrieveInput.setClient(client);
        retrieveInput.setJobId(jobId);
        retrieveInput.setCode(code);
        retrieveInput.setInfoType("ServiceCode");
        try {
            final RetrieveInfoOutput retrieveOutput = DPCLInterface.port.retrieveInfo(retrieveInput);
            if (retrieveOutput.isSuccess()) {
                return retrieveOutput.getInfo();
            }
            return "";
        }
        catch (Exception e) {
            System.out.println("retrieveInfo exception " + e);
            return "";
        }
    }
    
    public static String doRetrieveLog() {
        final RetrieveLogInput RLInput = new RetrieveLogInput();
        RLInput.setResetLog(false);
        try {
            final RetrieveLogOutput RLOutput = DPCLInterface.port.retrieveLog(RLInput);
            return RLOutput.getLog();
        }
        catch (Exception e) {
            System.out.println("retrieveLog exception " + e);
            return "No log retrieved";
        }
    }
    
    public static boolean doStartJob(final List<ActionParameter> parameters) {
        final StartJobInput startJobInput = new StartJobInput();
        StartJobOutput startJobOutput = new StartJobOutput();
        boolean exceptionJob = false;
        for (final ActionParameter param : parameters) {
            if (param.getName().toLowerCase().equals("exception")) {
                if (!param.getValue().toLowerCase().equals("true")) {
                    continue;
                }
                exceptionJob = true;
                break;
            }
        }
        startJobInput.setClient(DPCLInterface.clientName);
        startJobInput.setJobId(DPCLInterface.dpclEnvironment.getNextJobId());
        startJobInput.setSettingsGroup("");
        startJobInput.setExceptionJob(exceptionJob);
        try {
            startJobOutput = DPCLInterface.port.startJob(startJobInput);
        }
        catch (Exception e) {
            System.out.println("startJob exception " + e);
        }
        DPCLInterface.actionId = 0L;
        return startJobOutput.isSuccess();
    }
    
    public static boolean doStartJob4(final List<ActionParameter> parameters) {
        final StartJob4Input startJob4Input = new StartJob4Input();
        StartJob3Output startJob3Output = new StartJob3Output();
        boolean exceptionJob = false;
        for (final ActionParameter param : parameters) {
            if (param.getName().toLowerCase().equals("exception")) {
                if (!param.getValue().toLowerCase().equals("true")) {
                    continue;
                }
                exceptionJob = true;
                break;
            }
        }
        startJob4Input.setClient(DPCLInterface.clientName);
        startJob4Input.setJobId(DPCLInterface.dpclEnvironment.getNextJobId());
        startJob4Input.setSettingsGroup("");
        startJob4Input.setExceptionJob(exceptionJob);
        final QName qNameHopper = new QName("1");
        startJob4Input.setInputHopper(qNameHopper);
        try {
            startJob3Output = DPCLInterface.port.startJob4(startJob4Input);
        }
        catch (Exception e) {
            System.out.println("startJob4 exception " + e);
        }
        DPCLInterface.actionId = 0L;
        return startJob3Output.isSuccess();
    }
    
    private static ExchangeMessageOutput exchangeMessage(final ExchangeMessageInput exchangeMessageInput) {
        ExchangeMessageOutput tmpExchangeMessageOutput = new ExchangeMessageOutput();
        for (int i = 0; i < 5; ++i) {
            try {
                tmpExchangeMessageOutput = DPCLInterface.port.exchangeMessage(exchangeMessageInput);
            }
            catch (Exception e) {
                e.printStackTrace();
                if (i == 4) {
                    return null;
                }
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException ex) {}
            }
        }
        return tmpExchangeMessageOutput;
    }
    
    public static boolean doExchangeMessage(final String action, final String param1, final String param2) {
        try {
            Thread.sleep(3000L);
        }
        catch (InterruptedException ex) {}
        final ExchangeMessageInput exchangeMessageInput = new ExchangeMessageInput();
        exchangeMessageInput.setTunnel("SmartCard");
        exchangeMessageInput.setType(action);
        exchangeMessageInput.setMaxSeconds(120L);
        if (action != null && action.equals("SCardConnect")) {
            System.out.println("begin----SCard connect");
            final Parameter[] parameter = { new Parameter() };
            parameter[0].setName("SCardProtocol");
            parameter[0].setValue(param1);
            System.out.println("SCardProtocol " + param1);
            exchangeMessageInput.getParameter().add(parameter[0]);
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException ex2) {}
        }
        if (action != null && action.equals("SCardStatus")) {
            System.out.println("begin---SCardStatus");
        }
        if (action != null && action.equals("SCardTransmit")) {
            System.out.println("begin---SCardTransmit : " + param1);
            final MessageData data = new MessageData();
            data.setContentType("application/vnd.dpcl.smartcard_buffer");
            final ObjectFactory factory = new ObjectFactory();
            //final JAXBElement attachmentElement = factory.createMessageDataBase64(ByteUtils.stoh(param1));
            data.setBase64(ByteUtils.stoh(param1));
            //System.out.println("begin---SCardTransmit Base64 : " + attachmentElement.toString());
            //System.out.println("begin---SCardTransmit Base64 value: " + attachmentElement.getValue().toString());
            exchangeMessageInput.setData(data);
            //System.out.println("+++exchangeMessageInput.Tunnel: " + exchangeMessageInput.getTunnel());
            //System.out.println("+++exchangeMessageInput.type: " + exchangeMessageInput.getType());
            //System.out.println("+++exchangeMessageInput.getData: " + exchangeMessageInput.getData().getValue().toString());
        }
        if (action != null && action.equals("SCardDisconnect")) {
            System.out.println("begin----SCard disconnect111");
            final Parameter[] parameter = { new Parameter() };
            parameter[0].setName("SCardDisposition");
            parameter[0].setValue(SCardDisposition.SCARD_UNPOWER_CARD.toString());
            System.out.println("SCard disconnect ::: " + SCardDisposition.SCARD_UNPOWER_CARD.toString());
            exchangeMessageInput.getParameter().add(parameter[0]);
        }
        ExchangeMessageOutput exchangeMessageOutput = new ExchangeMessageOutput();
        for (int i = 0; i < 3; ++i) {
            exchangeMessageOutput = exchangeMessage(exchangeMessageInput);
            if (exchangeMessageOutput == null) {
                return false;
            }
            System.out.println("connect to card:" + exchangeMessageOutput.getResult());
            if (exchangeMessageOutput.getParameter() != null) {
                if (exchangeMessageOutput.getParameter().size() > 0) {
                    if (action != null && action.equals("SCardConnect")) {
                        System.out.println("---- " + exchangeMessageOutput.getParameter().size());
                        System.out.println("---- " + exchangeMessageOutput.getParameter().get(0).getName() + " " + exchangeMessageOutput.getParameter().get(0).getValue());
                        System.out.println("---- " + exchangeMessageOutput.getParameter().get(1).getName() + " " + exchangeMessageOutput.getParameter().get(1).getValue());
                        final String cardStatus = exchangeMessageOutput.getParameter().get(1).getValue();
                        if (cardStatus.compareToIgnoreCase("SCARD_S_SUCCESS") != 0) {
                            System.out.println("cardStatus is " + cardStatus);
                            try {
                                Thread.sleep(2000L);
                            }
                            catch (InterruptedException ex3) {}
                            if (i != 2) {
                                continue;
                            }
                            return false;
                        }
                        else {
                            System.out.println("end---SCardConnect");
                        }
                    }
                    if (action != null && action.equals("SCardStatus")) {
                        System.out.println("---- " + exchangeMessageOutput.getParameter().size());
                        System.out.println("---- " + exchangeMessageOutput.getParameter().get(0).getName() + " " + exchangeMessageOutput.getParameter().get(0).getValue());
                        System.out.println("---- " + exchangeMessageOutput.getParameter().get(1).getName() + " " + exchangeMessageOutput.getParameter().get(1).getValue());
                        System.out.println("---- " + exchangeMessageOutput.getParameter().get(2).getName() + " " + exchangeMessageOutput.getParameter().get(2).getValue());
                        final String cardStatus = exchangeMessageOutput.getParameter().get(2).getValue();
                        if (cardStatus.compareToIgnoreCase("SCARD_S_SUCCESS") != 0) {
                            System.out.println("cardStatus is " + cardStatus);
                            try {
                                Thread.sleep(2000L);
                            }
                            catch (InterruptedException ex4) {}
                            continue;
                        }
                        if (exchangeMessageOutput.getData() != null && exchangeMessageOutput.getData() != null) {
                            final String atr = ByteUtils.htos(exchangeMessageOutput.getData().getHexBinary());
                            System.out.println("end---SCardStatus. ATR=" + atr);
                        }
                        System.out.println("end---SCardStatus");
                    }
                    if (action != null && action.equals("SCardTransmit")) {
                        System.out.println("---- " + exchangeMessageOutput.getParameter().size());
                        System.out.println("---- " + exchangeMessageOutput.getParameter().get(0).getName() + " " + exchangeMessageOutput.getParameter().get(0).getValue());
                        final String cardStatus = exchangeMessageOutput.getParameter().get(0).getValue();
                        if (cardStatus.compareToIgnoreCase("SCARD_S_SUCCESS") != 0) {
                            System.out.println("cardStatus is " + cardStatus);
                            try {
                                Thread.sleep(2000L);
                            }
                            catch (InterruptedException ex5) {}
                            continue;
                        }
                        if (exchangeMessageOutput.getData() != null && exchangeMessageOutput.getData() != null) {
                            final String response = ByteUtils.htos(exchangeMessageOutput.getData().getHexBinary());
                            System.out.println("apdu response:" + response);
                            System.out.println("end---SCardTransmit");
                        }
                    }
                    if (action != null && action.equals("SCardDisconnect")) {
                        System.out.println("---- " + exchangeMessageOutput.getParameter().size());
                        System.out.println("---- " + exchangeMessageOutput.getParameter().get(0).getName() + " " + exchangeMessageOutput.getParameter().get(0).getValue());
                        final String cardStatus = exchangeMessageOutput.getParameter().get(0).getValue();
                        if (cardStatus.compareToIgnoreCase("SCARD_S_SUCCESS") != 0) {
                            System.out.println("cardStatus is " + cardStatus);
                            return false;
                        }
                        System.out.println("end---SCardDisconnect");
                        doResume();
                    }
                    return true;
                }
            }
        }
        return true;
    }
    
    public static boolean doSubmitAction(final String action, final List<ActionParameter> actionParameters) {
        final SubmitActionInput submitActionInput = new SubmitActionInput();
        SubmitActionOutput submitActionOutput = new SubmitActionOutput();
        for (final ActionParameter actionParam : actionParameters) {
            final Parameter newParam = new Parameter();
            newParam.setName(actionParam.getName());
            newParam.setValue(actionParam.getValue());
            submitActionInput.getParameter().add(newParam);
            System.out.println("+++actionParameters Name=     " + actionParam.getName());
            System.out.println("+++actionParameters getValue= " + actionParam.getValue());
        }
        ++DPCLInterface.actionId;
        DPCLInterface.dataId = 0L;
        submitActionInput.setClient(DPCLInterface.clientName);
        submitActionInput.setJobId(DPCLInterface.dpclEnvironment.getJobId());
        submitActionInput.setActionId(DPCLInterface.actionId);
        submitActionInput.setType(action);
        System.out.println("+++submitActionInput clientName=" + DPCLInterface.clientName);
        System.out.println("+++submitActionInput type=" + action);
        try {
            submitActionOutput = DPCLInterface.port.submitAction(submitActionInput);
        }
        catch (Exception e) {
            System.out.println("submitAction exception " + e);
        }
        return submitActionOutput.isSuccess();
    }
    
    public static boolean doSetJobQueueState(final String state) {
        final SetJobQueueStateInput setJobQueueStateInput = new SetJobQueueStateInput();
        SetJobQueueStateOutput setJobQueueStateOutput = new SetJobQueueStateOutput();
        final QName qNameState = new QName("urn:dpcl:wsdl:2011-09-02", state);
        setJobQueueStateInput.setState(qNameState);
        setJobQueueStateOutput = DPCLInterface.port.setJobQueueState(setJobQueueStateInput);
        return setJobQueueStateOutput.isSuccess();
    }
    
    public static boolean doSetLockedState(final String state) {
        final SetLockStateInput setLockStateInput = new SetLockStateInput();
        SetLockStateOutput setLockStateOutput = new SetLockStateOutput();
        final QName qNameState = new QName("urn:dpcl:wsdl:2011-09-02", state);
        setLockStateInput.setState(qNameState);
        setLockStateOutput = DPCLInterface.port.setLockState(setLockStateInput);
        return true;
    }
    
    public static String getFileExtension(final String filename) {
        final int lastDot = filename.lastIndexOf(".");
        if (lastDot != -1 && lastDot != 0) {
            return filename.substring(lastDot + 1);
        }
        return "";
    }
    
    public static boolean doSubmitData(final String imageName, final List<ActionParameter> dataParameters, final boolean moreData, final String currentAction) {
        final SubmitDataInput submitDataInput = new SubmitDataInput();
        SubmitDataOutput submitDataOutput = new SubmitDataOutput();
        final Attachment attachment = new Attachment();
        final String filename = "image/" + imageName;
        final BufferedInputStream input = null;
        final InputStream in = DPCLInterface.class.getResourceAsStream("/" + filename);
        final File file = new File(filename);
        byte[] imageData = new byte[0];
        int totalBytesRead = 0;
        final ObjectFactory factory = new ObjectFactory();
        final String extension = String.valueOf(getFileExtension(filename)) + "_" + currentAction.toLowerCase();
        System.out.println("filename " + filename + ", search string is " + extension);
        try {
            try {
                try {
                    imageData = IOUtils.toByteArray(in);
                    totalBytesRead = imageData.length;
                }
                finally {
                    System.out.println("Read " + totalBytesRead + " bytes\n");
                }
                System.out.println("Read " + totalBytesRead + " bytes\n");
            }
            catch (FileNotFoundException ex) {
                System.out.println("Unable to find file " + filename);
                return false;
            }
        }
        catch (IOException ex2) {
            System.out.println("IO problem with " + filename);
            return false;
        }
        System.out.println("+++imageData+++=== " + imageData.toString());
        for (final ActionParameter dataParam : dataParameters) {
            System.out.println("+++dataParameters ");
            final Parameter newParam = new Parameter();
            newParam.setName(dataParam.getName());
            newParam.setValue(dataParam.getValue());
            submitDataInput.getParameter().add(newParam);
            System.out.println("+++dataParameters " + dataParam.getName());
            System.out.println("+++dataParameters " + dataParam.getValue());
        }
       // final JAXBElement attachmentElement = factory.createAttachmentBase64(imageData);
       // System.out.println("+++attachmentElement+++=== " + attachmentElement.getValue().toString());
        attachment.setBase64(imageData);
        if (DPCLInterface.extensionToContentMap.containsKey(extension.toLowerCase())) {
            attachment.setContentType(DPCLInterface.extensionToContentMap.get(extension.toLowerCase()));
            System.out.println("+++attachment.ContentType+++=== " + attachment.getContentType());
            ++DPCLInterface.dataId;
            submitDataInput.setClient(DPCLInterface.clientName);
            submitDataInput.setJobId(DPCLInterface.dpclEnvironment.getJobId());
            submitDataInput.setActionId(DPCLInterface.actionId);
            submitDataInput.setDataId(DPCLInterface.dataId);
            submitDataInput.setAttachment(attachment);
            submitDataInput.setMoreData(moreData);
            System.out.println("+++attachment.ContentType+++=== " + attachment.getContentType());
            System.out.println("+++attachment.getBase64.getValue+++=== " + attachment.getBase64());
            System.out.println("+++attachment.getBase64 +++=== " + attachment.getBase64().toString());
            try {
                submitDataOutput = DPCLInterface.port.submitData(submitDataInput);
            }
            catch (Exception e) {
                System.out.println("submitData exception " + e);
            }
            return submitDataOutput.isSuccess();
        }
        System.out.println("Unknown attachment " + imageName);
        return false;
    }
    
    private static boolean sendSettings(final String xmlData) {
        final SubmitDataInput submitDataInput = new SubmitDataInput();
        SubmitDataOutput submitDataOutput = new SubmitDataOutput();
        final Attachment attachment = new Attachment();
        final ObjectFactory factory = new ObjectFactory();
        //final JAXBElement attachmentElement = factory.createAttachmentBase64(xmlData.getBytes());
        attachment.setBase64(xmlData.getBytes());
        attachment.setContentType("application/vnd.dpcl.settings+xml");
        ++DPCLInterface.dataId;
        submitDataInput.setClient(DPCLInterface.clientName);
        submitDataInput.setJobId(DPCLInterface.dpclEnvironment.getJobId());
        submitDataInput.setActionId(DPCLInterface.actionId);
        submitDataInput.setDataId(DPCLInterface.dataId);
        submitDataInput.setAttachment(attachment);
        try {
            submitDataOutput = DPCLInterface.port.submitData(submitDataInput);
        }
        catch (Exception e) {
            System.out.println("submitData exception " + e);
        }
        return submitDataOutput.isSuccess();
    }
    
    public static boolean doImportDataSettings(final String xmlData) {
        final List actionParameters = new ArrayList();
        actionParameters.add(new ActionParameter("Exception", "true"));
        boolean success = doStartJob(actionParameters);
        if (success) {
            actionParameters.clear();
            success = doSubmitAction("SubmitSettings", actionParameters);
        }
        if (success) {
            success = sendSettings(xmlData);
        }
        actionParameters.clear();
        doEndJob(actionParameters);
        return success;
    }
    
    public static boolean doSubmitDataSettings(final Settings settings) {
        String xmlData = new String();
        try {
            final StringWriter stringWriter = new StringWriter();
            final JAXBContext jc = JAXBContext.newInstance(Settings.class);
            final Marshaller jaxbMarshaller = jc.createMarshaller();
            jaxbMarshaller.setProperty("jaxb.formatted.output", true);
            final QName qName = new QName("urn:dpcl:settings:2010-01-19", "Settings");
            final JAXBElement root = new JAXBElement(qName, Settings.class, settings);
            jaxbMarshaller.marshal(root, stringWriter);
            xmlData = stringWriter.toString();
        }
        catch (JAXBException e) {
            System.out.println("JAXB exception " + e);
        }
        final boolean success = sendSettings(xmlData);
        return success;
    }
    
    public static boolean doRetrieveData() {
        final RetrieveDataInput retrieveDataInput = new RetrieveDataInput();
        RetrieveDataOutput retrieveDataOutput = new RetrieveDataOutput();
        Attachment attachment = new Attachment();
        retrieveDataInput.setJobId(DPCLInterface.dpclEnvironment.getJobId());
        retrieveDataInput.setClient(DPCLInterface.clientName);
        retrieveDataInput.setActionId(DPCLInterface.actionId);
        try {
            retrieveDataOutput = DPCLInterface.port.retrieveData(retrieveDataInput);
        }
        catch (Exception e) {
            System.out.println("retrieveData exception " + e);
        }
        if (retrieveDataOutput.isSuccess()) {
            attachment = retrieveDataOutput.getAttachment();
            //final JAXBElement attachmentElement = attachment.getBase64();
            final byte[] dataRetrieved = attachment.getBase64();
            final String data = new String(dataRetrieved);
            try {
                final JAXBContext jc = JAXBContext.newInstance(Settings.class);
                final Unmarshaller unmarshaller = jc.createUnmarshaller();
                final JAXBElement root = unmarshaller.unmarshal(new StreamSource(new StringReader(data)), Settings.class);
                DPCLInterface.retrievedSettings = (Settings) root.getValue();
            }
            catch (JAXBException e2) {
                System.out.println("JAXB exception " + e2);
            }
            return true;
        }
        return false;
    }
    
    public static Settings doRetrieveDataSettings() {
        return DPCLInterface.retrievedSettings;
    }
    
    public static String getClientName() {
        return DPCLInterface.clientName;
    }
    
    public static boolean doEndJob(final List<ActionParameter> actionParameters) {
        final EndJobInput endJobInput = new EndJobInput();
        EndJobOutput endJobOutput = new EndJobOutput();
        endJobInput.setClient(DPCLInterface.clientName);
        endJobInput.setJobId(DPCLInterface.dpclEnvironment.getJobId());
        try {
            endJobOutput = DPCLInterface.port.endJob(endJobInput);
        }
        catch (Exception e) {
            System.out.println("EndJob exception " + e);
        }
        return endJobOutput.isSuccess();
    }
    
    public static boolean doCancel(final long jobId, final String client) {
        final CancelJobInput cancelJobInput = new CancelJobInput();
        CancelJobOutput cancelJobOutput = new CancelJobOutput();
        cancelJobInput.setClient(client);
        cancelJobInput.setJobId(jobId);
        System.out.println("Canceling job <" + client + "," + jobId + ">");
        try {
            cancelJobOutput = DPCLInterface.port.cancelJob(cancelJobInput);
        }
        catch (Exception e) {
            System.out.println("cancelJob exception " + e);
        }
        return cancelJobOutput.isSuccess();
    }
    
    public static boolean doRestart(final long jobId, final String client) {
        final RestartJobInput restartJobInput = new RestartJobInput();
        RestartJobOutput restartJobOutput = new RestartJobOutput();
        restartJobInput.setClient(client);
        restartJobInput.setJobId(jobId);
        System.out.println("Restarting job <" + client + "," + jobId + ">");
        try {
            restartJobOutput = DPCLInterface.port.restartJob(restartJobInput);
        }
        catch (Exception e) {
            System.out.println("restartJob exception " + e);
        }
        return restartJobOutput.isSuccess();
    }
    
    public static boolean doResume(final long jobId, final String client) {
        final ResumeJobInput resumeJobInput = new ResumeJobInput();
        ResumeJobOutput resumeJobOutput = new ResumeJobOutput();
        resumeJobInput.setClient(client);
        resumeJobInput.setJobId(jobId);
        System.out.println("Resuming job <" + client + "," + jobId + ">");
        try {
            resumeJobOutput = DPCLInterface.port.resumeJob(resumeJobInput);
        }
        catch (Exception e) {
            System.out.println("resumeJob exception " + e);
        }
        return resumeJobOutput.isSuccess();
    }
    
    public static boolean doResume() {
        final ResumeJobInput resumeJobInput = new ResumeJobInput();
        ResumeJobOutput resumeJobOutput = new ResumeJobOutput();
        resumeJobInput.setClient(DPCLInterface.clientName);
        resumeJobInput.setJobId(DPCLInterface.dpclEnvironment.getJobId());
        System.out.println("Resuming job <" + DPCLInterface.clientName + "," + DPCLInterface.dpclEnvironment.getJobId() + ">");
        try {
            resumeJobOutput = DPCLInterface.port.resumeJob(resumeJobInput);
        }
        catch (Exception e) {
            System.out.println("resumeJob exception " + e);
        }
        return resumeJobOutput.isSuccess();
    }
    
    public static boolean doRetrieveSettings(final String subsystem, final boolean includeAttributes) {
        final List actionParameters = new ArrayList();
        actionParameters.add(new ActionParameter("Exception", "true"));
        boolean success = doStartJob(actionParameters);
        if (success) {
            actionParameters.clear();
            if (subsystem != null) {
                actionParameters.add(new ActionParameter("SettingSubsystem", subsystem));
            }
            if (includeAttributes) {
                actionParameters.add(new ActionParameter("IncludeSettingAttributes", "True"));
            }
            success = doSubmitAction("RetrieveSettings", actionParameters);
        }
        if (success) {
            success = doRetrieveData();
        }
        actionParameters.clear();
        doEndJob(actionParameters);
        return success;
    }
    
    public static boolean doSaveSettings(final String subsystem, final Settings settings) {
        final List actionParameters = new ArrayList();
        actionParameters.add(new ActionParameter("Exception", "true"));
        boolean success = doStartJob(actionParameters);
        if (success) {
            actionParameters.clear();
            success = doSubmitAction("SubmitSettings", actionParameters);
        }
        if (success) {
            success = doSubmitDataSettings(settings);
        }
        actionParameters.clear();
        doEndJob(actionParameters);
        return success;
    }
}
