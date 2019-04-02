package com.externalprinter;

import com.boc.externalprinter.*;
import org.apache.commons.io.*;
import net.coobird.thumbnailator.*;
import com.boc.util.*;
import java.awt.*;
import com.dpcl2.client.util.*;
import javax.xml.ws.*;
import javax.xml.namespace.*;
import java.io.*;
import java.util.*;
import java.util.List;

import com.dpcl2.ws.client.*;

public class BOCDummyPrinter extends IPrinter
{
    private String ip;
    private String uuid;
    private int lcode;
    private int istatus;
    private String strLocalPart;
    private String clientName;
    private static long JobID;
    private static long actionId;
    private static long dataId;
    static DPCL2 dpcl2;
    static DPCL2PortType port;
    boolean beject;
    boolean bisic;
    boolean bPE;
    PrintStatus printStatus;
    SubmitActionInput submitActionInput;
    SubmitActionOutput submitActionOutput;
    SubmitDataInput submitDataInput;
    SubmitDataOutput submitDataOutput;

    static {
        BOCDummyPrinter.JobID = 99992L;
        BOCDummyPrinter.actionId = 0L;
        BOCDummyPrinter.dataId = 0L;
        BOCDummyPrinter.dpcl2 = null;
        BOCDummyPrinter.port = null;
    }

    public BOCDummyPrinter(final String IP) {
        super(IP);
        this.uuid = "";
        this.istatus = 0;
        this.clientName = "BOCDummyPrinter";
        this.beject = false;
        this.bisic = false;
        this.bPE = false;
        this.printStatus = new PrintStatus();
        this.submitActionInput = new SubmitActionInput();
        this.submitActionOutput = new SubmitActionOutput();
        this.submitDataInput = new SubmitDataInput();
        this.submitDataOutput = new SubmitDataOutput();
        WLog.ipLog = IP;
        WLog.driveName = this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1);
        WLog.LoadFilePath();
        this.ip = IP;
    }

    public boolean EmbossOrIndentCard(final CardSide arg0, final CardSide arg1) {
        boolean bstatus = false;
        WLog.log.info((Object)"begin-EmbossOrIndentCard----");
        if (this.bisic) {
            this.SmartCardUnpark();
            this.bisic = false;
        }
        int listindex1 = 0;
        final int listindex2 = 0;
        try {
            ArrayList<EndentText> fendenttext = null;
            final ArrayList<EndentText> bendenttext = null;
            if (arg0 != null) {
                fendenttext = (ArrayList<EndentText>)arg0.getEmbossTxt();
                listindex1 = fendenttext.size();
            }
            if (listindex1 == 0) {
                return true;
            }
            if (fendenttext == null) {
                return true;
            }
            String strlinex = "";
            if (fendenttext != null) {
                for (listindex1 = 0; listindex1 < fendenttext.size(); ++listindex1) {
                    final EndentText endenttext1 = fendenttext.get(listindex1);
                    final String str1 = endenttext1.getStrText();
                    final int font1 = endenttext1.getFontNum();
                    final float fx = endenttext1.getX() * 1000.0f;
                    final float fy = endenttext1.getY() * 1000.0f;
                    final int tft = endenttext1.getToppingFoilType();
                    strlinex = String.valueOf(strlinex) + " <line number=\"" + String.valueOf(listindex1 + 1) + "\"><font>" + String.valueOf(font1) + "</font><horz>" + String.valueOf(fx) + "</horz><vert>" + String.valueOf(fy) + "</vert><stringData>" + str1 + "</stringData></line> ";
                }
            }
            this.beject = true;
            ++BOCDummyPrinter.actionId;
            this.submitActionInput.setClient(this.clientName);
            this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
            this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
            this.submitActionInput.setType("EmbCardData");
            final Parameter newParam = new Parameter();
            newParam.setName("EmbossDataSource");
            newParam.setValue("TopCard");
            this.submitActionInput.getParameter().clear();
            this.submitActionInput.getParameter().add(newParam);
            this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
            String embossdata = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><emboss xmlns:SOAP-ENV=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:SOAP-ENC=\"http://www.w3.org/2003/05/soap-encoding\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:DPCLEmboss=\"urn:dpcl:emboss:2010-01-19\" xsi:type=\"DPCLEmboss:Emboss\" SOAP-ENV:encodingStyle=\"http://www.w3.org/2003/05/soap-encoding\">";
            embossdata = String.valueOf(embossdata) + strlinex + "</emboss>";
            final Attachment attachment = new Attachment();
            final BufferedInputStream input = null;
            final InputStream in = new ByteArrayInputStream(embossdata.getBytes());
            byte[] imageData = new byte[0];
            int totalBytesRead = 0;
            final ObjectFactory factory = new ObjectFactory();
            imageData = IOUtils.toByteArray(in);
            totalBytesRead = imageData.length;
            // final JAXBElement<byte[]> attachmentElement = factory.createAttachmentBase64(imageData);
            attachment.setBase64(imageData);
            attachment.setContentType("application/vnd.dpcl.emboss+xml");
            ++BOCDummyPrinter.dataId;
            this.submitDataInput.setClient(this.clientName);
            this.submitDataInput.setJobId(BOCDummyPrinter.JobID);
            this.submitDataInput.setActionId(BOCDummyPrinter.actionId);
            this.submitDataInput.setDataId(BOCDummyPrinter.dataId);
            this.submitDataInput.setAttachment(attachment);
            this.submitDataInput.setMoreData(false);
            this.submitDataInput.getParameter().clear();
            this.submitDataOutput = BOCDummyPrinter.port.submitData(this.submitDataInput);
            Thread.sleep(500L);
            bstatus = this.doWaitForStatus2(false);
            if (!bstatus) {
                return bstatus;
            }
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }
        WLog.log.info((Object)"end-EmbossOrIndentCard----");
        return true;
    }

    private ExchangeMessageOutput exchangeMessage(final ExchangeMessageInput exchangeMessageInput) {
        ExchangeMessageOutput tmpExchangeMessageOutput = null;
        int i;
        for (i = 0, i = 0; i < 10; ++i) {
            try {
                tmpExchangeMessageOutput = BOCDummyPrinter.port.exchangeMessage(exchangeMessageInput);
                if (tmpExchangeMessageOutput != null && tmpExchangeMessageOutput.getParameter() != null && tmpExchangeMessageOutput.getParameter().size() > 0) {
                    return tmpExchangeMessageOutput;
                }
            }
            catch (Exception e) {
                WLog.log.error((Object)e, e.fillInStackTrace());
            }
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException ex) {}
        }
        if (i == 9) {
            WLog.log.error((Object)"exchangeMessage time out.");
        }
        return null;
    }

    public boolean MoveToOutput() {
        WLog.log.info((Object)"begin-MoveToOutput----");
        try {
            if (this.bisic) {
                this.SmartCardUnpark();
                this.bPE = false;
            }
            if (!this.beject) {
                ++BOCDummyPrinter.actionId;
                this.submitActionInput.setClient(this.clientName);
                this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
                this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
                this.submitActionInput.setType("Eject");
                this.submitActionInput.getParameter().clear();
                this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
                Thread.sleep(500L);
                this.doWaitForStatus2(false);
            }
            final EndJobInput endJobInput = new EndJobInput();
            EndJobOutput endJobOutput = new EndJobOutput();
            endJobInput.setClient(this.clientName);
            endJobInput.setJobId(BOCDummyPrinter.JobID);
            endJobOutput = BOCDummyPrinter.port.endJob(endJobInput);
            Thread.sleep(500L);
            this.doWaitForStatus2(false);
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }
        WLog.log.info((Object)"end-MoveToOutput----");
        return true;
    }

    public boolean MoveToReject() {
        WLog.log.info((Object)"begin-MoveToReject----");
        try {
            final CancelJobInput cji = new CancelJobInput();
            CancelJobOutput cjo = new CancelJobOutput();
            cji.setClient(this.clientName);
            cji.setJobId(BOCDummyPrinter.JobID);
            cjo = BOCDummyPrinter.port.cancelJob(cji);
            Thread.sleep(500L);
            this.doWaitForStatus2(false);
        }
        catch (Exception e) {
            System.out.println("这里出错了");
            e.printStackTrace();
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }
        WLog.log.info((Object)"end-MoveToReject----");
        return true;
    }

    public boolean PrintCard(final CardSide arg0, final CardSide arg1) {
        boolean bstatus = false;
        WLog.log.info((Object)"begin-PrintCard----");
        bstatus = this.SmartCardUnpark();
        this.bisic = false;
        this.bPE = true;
        final ArrayList<ImageRectangle> printTxtImgList = new ArrayList<ImageRectangle>();
        final ArrayList<ImageRectangle> printTxtImgListB = new ArrayList<ImageRectangle>();
        ArrayList<PrintTxt> fprinttxt = null;
        ArrayList<PrintTxt> bprinttxt = null;
        try {
            int listsi1 = 0;
            int listsi2 = 0;
            if (arg0 != null) {
                fprinttxt = (ArrayList<PrintTxt>)arg0.getPrintTxt();
                if (fprinttxt != null) {
                    listsi1 = fprinttxt.size();
                }
            }
            if (arg1 != null) {
                bprinttxt = (ArrayList<PrintTxt>)arg1.getPrintTxt();
                if (bprinttxt != null) {
                    listsi2 = bprinttxt.size();
                }
            }
            final byte[] fbI = arg0.getBackGroudImagedata();
            if (fbI != null && fbI.length > 100) {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                final ByteArrayInputStream bais = new ByteArrayInputStream(fbI);
                Thumbnails.of(new InputStream[] { bais }).outputFormat("jpg").forceSize(2100, 1344).outputQuality(1.0f).toOutputStream((OutputStream)out);
                final byte[] resultImageAsRawBytes = out.toByteArray();
                final ImageRectangle BI = new ImageRectangle();
                BI.setData(resultImageAsRawBytes);
                BI.setImagePath("jpeg");
                BI.setX(0.0);
                BI.setY(0.0);
                BI.setWidth(2100.0f);
                BI.setHeight(1344.0f);
                printTxtImgList.add(BI);
                ++listsi1;
                out.close();
                bais.close();
            }
            final ImageRectangle IR1 = arg0.getPhoto();
            if (IR1 != null) {
                final String strphotoformat = IR1.getImagePath();
                ++listsi1;
                if (strphotoformat.isEmpty()) {
                    IR1.setImagePath("jpeg");
                }
                final int idatalength = IR1.getData().length;
                if (idatalength > 100) {
                    printTxtImgList.add(IR1);
                    ++listsi1;
                }
            }
            int listindex = 0;
            if (fprinttxt != null) {
                WLog.log.info((Object)"fprinttxt start---");
                for (listindex = 0; listindex < fprinttxt.size(); ++listindex) {
                    final PrintTxt pTxt = fprinttxt.get(listindex);
                    final String strtext = pTxt.getTextString();
                    if (!strtext.isEmpty()) {
                        final Font font1 = pTxt.getFont();
                        final float fx = pTxt.getX();
                        final float fy = pTxt.getY();
                        final Color color1 = pTxt.getFontColor();
                        final ImageRectangle IR2 = new ImageRectangle();
                        IR2.setX((double)fx);
                        IR2.setY((double)fy);
                        byte[] imageData = new byte[0];
                        imageData = PictureTools.TextToTif(strtext, font1);
                        IR2.setData(imageData);
                        IR2.setImagePath("tiff");
                        printTxtImgList.add(IR2);
                    }
                }
            }
            final byte[] fbI2 = arg1.getBackGroudImagedata();
            if (fbI2 != null && fbI2.length > 100) {
                final ImageRectangle BI = new ImageRectangle();
                BI.setData(fbI2);
                BI.setImagePath("jpeg");
                BI.setX(0.0);
                BI.setY(0.0);
                BI.setWidth(2100.0f);
                BI.setHeight(1344.0f);
                printTxtImgListB.add(BI);
                ++listsi2;
            }
            final ImageRectangle IR1B = arg1.getPhoto();
            if (IR1B != null) {
                final String strphotoformat2 = IR1B.getImagePath();
                if (strphotoformat2.isEmpty()) {
                    IR1B.setImagePath("jpeg");
                }
                final int idatalength2 = IR1B.getData().length;
                if (idatalength2 > 100) {
                    printTxtImgListB.add(IR1B);
                    ++listsi2;
                }
            }
            if (bprinttxt != null) {
                WLog.log.info((Object)"bprinttxt start");
                for (listindex = 0; listindex < bprinttxt.size(); ++listindex) {
                    final PrintTxt pTxt2 = bprinttxt.get(listindex);
                    final String strtext2 = pTxt2.getTextString();
                    final Font font2 = pTxt2.getFont();
                    final float fx2 = pTxt2.getX();
                    final float fy2 = pTxt2.getY();
                    final Color color2 = pTxt2.getFontColor();
                    final ImageRectangle IR3 = new ImageRectangle();
                    IR3.setX((double)fx2);
                    IR3.setY((double)fy2);
                    byte[] imageData2 = new byte[0];
                    imageData2 = PictureTools.TextToTif(strtext2, font2);
                    IR3.setData(imageData2);
                    IR3.setImagePath("tiff");
                    printTxtImgListB.add(IR3);
                }
            }
            final int sumlistb = printTxtImgListB.size();
            final int sumlist = printTxtImgList.size();
            if (sumlist == 0 && sumlistb == 0) {
                return true;
            }
            ++BOCDummyPrinter.actionId;
            this.submitActionInput.setClient(this.clientName);
            this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
            this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
            this.submitActionInput.setType("CMYK");
            this.submitActionInput.getParameter().clear();
            this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
            if (sumlist > 0) {
                WLog.log.info((Object)"start print first page");
                for (int ilist = 0; ilist < sumlist; ++ilist) {
                    WLog.log.info((Object)("printTxtImgList start " + ilist));
                    final Attachment attachment = new Attachment();
                    byte[] imageData3 = new byte[0];
                    int totalBytesRead = 0;
                    final ObjectFactory factory = new ObjectFactory();
                    final ImageRectangle IRD = printTxtImgList.get(ilist);
                    imageData3 = IRD.getData();
                    totalBytesRead = imageData3.length;
                    // final JAXBElement<byte[]> attachmentElement = factory.createAttachmentBase64(imageData3);
                    attachment.setBase64(imageData3);
                    final String strcontentype = "image/" + IRD.getImagePath();
                    attachment.setContentType(strcontentype);
                    ++BOCDummyPrinter.dataId;
                    this.submitDataInput.setClient(this.clientName);
                    this.submitDataInput.setJobId(BOCDummyPrinter.JobID);
                    this.submitDataInput.setActionId(BOCDummyPrinter.actionId);
                    this.submitDataInput.setDataId(BOCDummyPrinter.dataId);
                    this.submitDataInput.setAttachment(attachment);
                    if (ilist + 1 == printTxtImgList.size()) {
                        this.submitDataInput.setMoreData(false);
                    }
                    else {
                        this.submitDataInput.setMoreData(true);
                    }
                    final Parameter newParam = new Parameter();
                    final Parameter newParam2 = new Parameter();
                    double dy = IRD.getY();
                    if (dy < 0.9) {
                        dy += (0.9 - dy) * 0.02;
                    }
                    else if (dy > 1.2) {
                        dy *= 0.97;
                    }
                    newParam.setName("YOrigin");
                    final String stry = String.valueOf(dy);
                    newParam.setValue(stry);
                    this.submitDataInput.getParameter().clear();
                    this.submitDataInput.getParameter().add(newParam);
                    newParam2.setName("XOrigin");
                    double dx = IRD.getX();
                    if (dx < 2.0) {
                        dx += (2.0 - dx) * 0.02;
                    }
                    else if (dx > 2.8) {
                        dx *= 0.98;
                    }
                    final String strx = String.valueOf(dx);
                    newParam2.setValue(strx);
                    this.submitDataInput.getParameter().add(newParam2);
                    this.submitDataOutput = BOCDummyPrinter.port.submitData(this.submitDataInput);
                }
                ++BOCDummyPrinter.actionId;
                this.submitActionInput.setClient(this.clientName);
                this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
                this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
                this.submitActionInput.setType("Primer");
                final Parameter newParam3 = new Parameter();
                this.submitActionInput.getParameter().clear();
                newParam3.setName("PrimerDataSource");
                newParam3.setValue("TestPatternFullOn");
                this.submitActionInput.getParameter().clear();
                this.submitActionInput.getParameter().add(newParam3);
                this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
                ++BOCDummyPrinter.actionId;
                this.submitActionInput.setClient(this.clientName);
                this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
                this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
                this.submitActionInput.setType("Retransfer");
                this.submitActionInput.getParameter().clear();
                this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
                WLog.log.info((Object)"end print first page");
                Thread.sleep(500L);
                bstatus = this.doWaitForStatus2(false);
                if (!bstatus) {
                    return bstatus;
                }
            }
            if (sumlistb > 0) {
                WLog.log.info((Object)"start print second page");
                for (int ilist = 0; ilist < sumlistb; ++ilist) {
                    WLog.log.info((Object)("printTxtImgListB start back " + ilist));
                    final Attachment attachment = new Attachment();
                    byte[] imageData3 = new byte[0];
                    int totalBytesRead = 0;
                    final ObjectFactory factory = new ObjectFactory();
                    final ImageRectangle IRD = printTxtImgListB.get(ilist);
                    imageData3 = IRD.getData();
                    totalBytesRead = imageData3.length;
                    //final JAXBElement<byte[]> attachmentElement = factory.createAttachmentBase64(imageData3);
                    attachment.setBase64(imageData3);
                    final String strcontentype = "image/" + IRD.getImagePath();
                    attachment.setContentType(strcontentype);
                    ++BOCDummyPrinter.dataId;
                    this.submitDataInput.setClient(this.clientName);
                    this.submitDataInput.setJobId(BOCDummyPrinter.JobID);
                    this.submitDataInput.setActionId(BOCDummyPrinter.actionId);
                    this.submitDataInput.setDataId(BOCDummyPrinter.dataId);
                    this.submitDataInput.setAttachment(attachment);
                    if (ilist + 1 == printTxtImgListB.size()) {
                        this.submitDataInput.setMoreData(false);
                    }
                    else {
                        this.submitDataInput.setMoreData(true);
                    }
                    final Parameter newParam = new Parameter();
                    final Parameter newParam2 = new Parameter();
                    double dy = IRD.getY();
                    if (dy < 0.9) {
                        dy += (0.9 - dy) * 0.02;
                    }
                    else if (dy > 1.2) {
                        dy *= 0.97;
                    }
                    newParam.setName("YOrigin");
                    final String stry = String.valueOf(dy);
                    newParam.setValue(stry);
                    this.submitDataInput.getParameter().clear();
                    this.submitDataInput.getParameter().add(newParam);
                    newParam2.setName("XOrigin");
                    double dx = IRD.getX();
                    if (dx < 2.0) {
                        dx += (2.0 - dx) * 0.02;
                    }
                    else if (dx > 2.8) {
                        dx *= 0.98;
                    }
                    final String strx = String.valueOf(dx);
                    newParam2.setValue(strx);
                    this.submitDataInput.getParameter().add(newParam2);
                    this.submitDataOutput = BOCDummyPrinter.port.submitData(this.submitDataInput);
                }
                ++BOCDummyPrinter.actionId;
                this.submitActionInput.setClient(this.clientName);
                this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
                this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
                this.submitActionInput.setType("Primer");
                final Parameter newParam3 = new Parameter();
                this.submitActionInput.getParameter().clear();
                newParam3.setName("PrimerDataSource");
                newParam3.setValue("TestPatternFullOn");
                this.submitActionInput.getParameter().clear();
                this.submitActionInput.getParameter().add(newParam3);
                this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
                ++BOCDummyPrinter.actionId;
                this.submitActionInput.setClient(this.clientName);
                this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
                this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
                this.submitActionInput.setType("Retransfer");
                this.submitActionInput.getParameter().clear();
                final Parameter newParamb = new Parameter();
                newParamb.setName("PageNumber");
                newParamb.setValue("2");
                this.submitActionInput.getParameter().add(newParamb);
                this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
                WLog.log.info((Object)"end print second page");
                Thread.sleep(500L);
                bstatus = this.doWaitForStatus2(false);
                if (bstatus) {
                    return bstatus;
                }
            }
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }
        WLog.log.info((Object)"end-PrintCard----");
        return this.submitActionOutput.isSuccess() && bstatus;
    }

    public boolean connect(final String arg0) {
        WLog.log.info((Object)("begin-connect = " + arg0));
        try {
            this.uuid = arg0;
            try {
                this.printStatus.setPrintState(0);
                this.printStatus.setError(0);
                this.printStatus.setErrorDetails("");
                this.printStatus.setErrorMessage("");
                final Date date = new Date();
                this.printStatus.setLastStatusUpdate(date);
                this.printStatus.setReceived(date);
                this.printStatus.setUuid(this.uuid);
            }
            catch (Exception e) {
                WLog.log.error((Object)e, e.fillInStackTrace());
                return false;
            }
            final String printerIP = this.ip;
            final IPAddress address = new IPAddress();
            this.beject = false;
            if (!address.validate(printerIP)) {
                WLog.log.fatal((Object)("Invalid IP Address: " + printerIP));
                return false;
            }
            if (BOCDummyPrinter.dpcl2 == null && BOCDummyPrinter.port == null) {
                BOCDummyPrinter.dpcl2 = new DPCL2();
                BOCDummyPrinter.port = BOCDummyPrinter.dpcl2.getDPCL2Port();
                final String printerURL = "http://" + printerIP + ":9100";
                WLog.log.info((Object)("Connecting to " + printerIP));
                final BindingProvider bp = (BindingProvider)BOCDummyPrinter.port;
                bp.getRequestContext().put("javax.xml.ws.service.endpoint.address", printerURL);
            }
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }
        WLog.log.info((Object)("end-connect = " + arg0));
        return true;
    }

    public boolean disconnect(final String arg0) {
        WLog.log.info((Object)("begin-disconnect = " + arg0));
        WLog.log.info((Object)("end-disconnect = " + arg0));
        return true;
    }

    public boolean feedCard(final int arg0) {
        boolean bstatus = false;
        WLog.log.info((Object)("begin-feedCard = " + arg0));
        try {
            final boolean isactivat = this.ISprinterActivated();
            System.out.println("设备激活状态:"+isactivat);
            if (!isactivat) {
                System.out.println("未激活打印机");
                WLog.log.fatal((Object)"not Activeated");
                // return false;
            }
            final StartJob4Input startJob4Input = new StartJob4Input();
            StartJob3Output startJob3Output = new StartJob3Output();
            final boolean exceptionJob = false;
            startJob4Input.setClient(this.clientName);
            final long len = System.currentTimeMillis();
            String str = String.valueOf(len);
            str = str.substring(str.length() - 9);
            System.out.println("BOCDummyPrinter.JobID====="+Long.parseLong(str));
            startJob4Input.setJobId(BOCDummyPrinter.JobID = Long.parseLong(str));
            startJob4Input.setSettingsGroup("");
            startJob4Input.setExceptionJob(exceptionJob);
            final QName qNameHopper = new QName(String.valueOf(arg0));
            startJob4Input.setInputHopper(qNameHopper);
            startJob3Output = BOCDummyPrinter.port.startJob4(startJob4Input);
            System.out.println("-----------startJob4Input-----------"+startJob4Input.getJobId());
            BOCDummyPrinter.actionId = 0L;
            ++BOCDummyPrinter.actionId;
            BOCDummyPrinter.dataId = 0L;
            this.submitActionInput.setClient(this.clientName);
            this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
            this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
            this.submitActionInput.setType("Pick");
            this.submitActionInput.getParameter().clear();
            this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
            Thread.sleep(500L);
            bstatus = this.doWaitForStatus2(false);
            if (!bstatus) {
                return bstatus;
            }
            System.out.println("--------------------写IC----------------------");
            //开始个人化
            bstatus = this.SmartCardPark();
            this.bisic = true;
        }
        catch (Exception e) {
            e.printStackTrace();
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }

        WLog.log.info((Object)("end-feedCard = " + arg0));
        return this.submitActionOutput.isSuccess() && bstatus;
    }

    public String getModel() {
        WLog.log.info((Object)"begin-getModel----");
        String strmodel = "";
        try {
            final DiscoverPrinter2Input dpInput = new DiscoverPrinter2Input();
            dpInput.setIncludeActions(false);
            DiscoverPrinter2Output dpOutput = new DiscoverPrinter2Output();
            dpOutput = BOCDummyPrinter.port.discoverPrinter2(dpInput);
            strmodel = dpOutput.getModel();
        }
        catch (Exception e) {
            WLog.log.error(e, e.fillInStackTrace());
            return strmodel;
        }
        WLog.log.info((Object)"end-getModel----");
        return strmodel;
    }

    public PrintStatus getPrintStatus() {
        WLog.log.info((Object)"begin-getPrintStatus----");
        try {
            this.printStatus.setPrintState(this.istatus);
            this.printStatus.setError(this.lcode);
            this.printStatus.setErrorDetails(this.strLocalPart);
            this.printStatus.setErrorMessage(this.strLocalPart);
            final Date date = new Date();
            this.printStatus.setLastStatusUpdate(date);
            this.printStatus.setReceived(date);
            this.printStatus.setUuid(this.uuid);
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return null;
        }
        WLog.log.info((Object)"end-getPrintStatus----");
        return this.printStatus;
    }

    public String getPrinterState() {
        WLog.log.info((Object)"begin-getPrinterState----");
        String strtsatus = "shutdown";
        try {
            WaitForStatus2Output WFS2Output = new WaitForStatus2Output();
            final WaitForStatus2Input WFS2Input = new WaitForStatus2Input();
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
            WFS2Output = BOCDummyPrinter.port.waitForStatus2(WFS2Input);
            strtsatus = WFS2Output.getStatus().getState().value();
            WLog.log.info((Object)("status = " + strtsatus));
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return strtsatus;
        }
        WLog.log.info((Object)"end-getPrinterState----");
        return strtsatus;
    }

    public SmartCardInterface getSmartCardInferface() {
        WLog.log.info((Object)"begin-getSmartCardInferface----");
        this.bisic = true;
        final PcscPrinter_new printer = new PcscPrinter_new();
        try {
            printer.setPort(BOCDummyPrinter.port);
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return null;
        }
        WLog.log.info((Object)"end-getSmartCardInferface----");
        return (SmartCardInterface)printer;
    }

    public boolean writeMagneticStripe(final String[] arg0) {
        System.out.println("开始写磁条");
        WLog.log.info((Object)"begin-writeMagneticStripe");
        this.SmartCardUnpark();
        this.bisic = false;
        final int n = 1;
        boolean bstatus = false;
        try {
            final String strtrack1 = arg0[0];
            final String strtrack2 = arg0[1];
            final String strtrack3 = arg0[2];
            String embossdata = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><magstripe xmlns:SOAP-ENV=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:SOAP-ENC=\"http://www.w3.org/2003/05/soap-encoding\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:DPCLMagStripe=\"urn:dpcl:magstripe:2010-01-19\" xsi:type=\"DPCLMagStripe:MagStripe\" SOAP-ENV:encodingStyle=\"http://www.w3.org/2003/05/soap-encoding\"><track number=\"1\"><stringData></stringData></track><track number=\"2\"><stringData></stringData></track><track number=\"3\"><stringData></stringData></track></magstripe>";
            StringBuffer strbuf = new StringBuffer(embossdata);
            strbuf = strbuf.insert(embossdata.indexOf("</stringData></track><track number=\"2\"><stringData>"), strtrack1);
            embossdata = strbuf.toString();
            strbuf = strbuf.insert(embossdata.indexOf("</stringData></track><track number=\"3\"><stringData>"), strtrack2);
            embossdata = strbuf.toString();
            strbuf = strbuf.insert(embossdata.indexOf("</stringData></track></magstripe>"), strtrack3);
            embossdata = strbuf.toString();
            ++BOCDummyPrinter.actionId;
            this.submitActionInput.setClient(this.clientName);
            this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
            this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
            this.submitActionInput.setType("MagStripeEncode");
            final Parameter newParam = new Parameter();
            newParam.setName("PageNumber");
            newParam.setValue("2");
            this.submitActionInput.getParameter().clear();
            this.submitActionInput.getParameter().add(newParam);
            this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
            final Attachment attachment = new Attachment();
            final String imageName = "write.xml";
            final String filename = "image/" + imageName;
            final BufferedInputStream input = null;
            final InputStream in = new ByteArrayInputStream(embossdata.getBytes());
            final File file = new File(filename);
            byte[] imageData = new byte[0];
            int totalBytesRead = 0;
            final ObjectFactory factory = new ObjectFactory();
            imageData = IOUtils.toByteArray(in);
            totalBytesRead = imageData.length;
            //final JAXBElement<byte[]> attachmentElement = factory.createAttachmentBase64(imageData);
            attachment.setBase64(imageData);
            attachment.setContentType("application/vnd.dpcl.magstripe+xml");
            ++BOCDummyPrinter.dataId;
            this.submitDataInput.setClient(this.clientName);
            this.submitDataInput.setJobId(BOCDummyPrinter.JobID);
            this.submitDataInput.setActionId(BOCDummyPrinter.actionId);
            this.submitDataInput.setDataId(BOCDummyPrinter.dataId);
            this.submitDataInput.setAttachment(attachment);
            this.submitDataInput.setMoreData(false);
            this.submitDataInput.getParameter().clear();
            this.submitDataOutput = BOCDummyPrinter.port.submitData(this.submitDataInput);
            Thread.sleep(500L);
            bstatus = this.doWaitForStatus2(false);
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }
        WLog.log.info((Object)"end-writeMagneticStripe");
        if (!bstatus) {
            return bstatus;
        }
        bstatus = this.SmartCardPark();
        this.bisic = true;
        return this.submitDataOutput.isSuccess() && bstatus;
    }

    public boolean doWaitForStatus2(final boolean initializing) {
        WaitForStatus2Output WFS2Output = new WaitForStatus2Output();
        final WaitForStatus2Input WFS2Input = new WaitForStatus2Input();
        boolean bst = false;
        final long itimes = 0L;
        Label_0771: {
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
                break Label_0771;
            }
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
            WFS2Input.setMinSettingMarker(0L);
            WFS2Input.setMinSensorMarker(0L);
            WFS2Input.setMinSupplyMarker(0L);
            WFS2Input.setMatchConditionClient("");
            WFS2Input.setMatchConditionJobId(0L);
            WFS2Input.setMinConditionSeverity(ConditionSeverity.fromValue("Notice"));
            try {
                while (!bst) {
                    WFS2Output = BOCDummyPrinter.port.waitForStatus2(WFS2Input);
                    Label_0465:
                    for (final Condition2 con2 : WFS2Output.getStatus().getCondition()) {
                        final long jbjobid = con2.getJobId();
                        final long jbactionid = con2.getActionId();
                        if (jbjobid == BOCDummyPrinter.JobID && jbactionid == BOCDummyPrinter.actionId) {
                            this.lcode = (int)con2.getCode();
                            WLog.log.info((Object)("lcode = " + this.lcode));
                            switch (this.lcode) {
                                case 0: {
                                    return true;
                                }
                                case 1: {
                                    return false;
                                }
                                case 2: {
                                    return false;
                                }
                                case 3: {
                                    return false;
                                }
                                case 4: {
                                    return true;
                                }
                                case 5: {
                                    return true;
                                }
                                case 6: {
                                    return true;
                                }
                                case 7: {
                                    return true;
                                }
                                case 8: {
                                    return true;
                                }
                                case 9: {
                                    return false;
                                }
                                case 10: {
                                    return true;
                                }
                                case 227: {
                                    return true;
                                }
                                default: {
                                    if (this.lcode >= 100) {
                                        return false;
                                    }
                                    break Label_0465;
                                }
                            }
                        }
                    }
                    String strtsatus = "";
                    strtsatus = WFS2Output.getStatus().getState().value();
                    final List<JobStatus2> jbStatus = WFS2Output.getStatus().getJob();
                    final int ijbstatus = jbStatus.size() - 1;
                    final JobStatus2 js = jbStatus.get(ijbstatus);
                    final List<ActionStatus2> ats = js.getAction();
                    final int iats = ats.size() - 1;
                    final ActionStatus2 atx = ats.get(iats);
                    final List<DataStatus> lds = atx.getRequestData();
                    final String strActionTpye = atx.getType();
                    final QName myQName = atx.getState();
                    this.strLocalPart = myQName.getLocalPart();
                    final String strNamespaceURI = myQName.getNamespaceURI();
                    final String strPrefix = myQName.getPrefix();
                    WLog.log.info((Object)("ActionStatu = " + this.strLocalPart));
                    Thread.sleep(1000L);
                    if (this.strLocalPart.equals("Completed")) {
                        bst = true;
                    }
                    else if (this.strLocalPart.equals("Terminated")) {
                        bst = true;
                    }
                    else if (this.strLocalPart.equals("ActivePaused")) {
                        bst = true;
                    }
                    else if (this.strLocalPart.equals("Aborted")) {
                        bst = true;
                    }
                    else if (this.strLocalPart.equals("Ready")) {
                        bst = true;
                    }
                    else if (this.strLocalPart.equals("Dying")) {
                        this.istatus = 10;
                        bst = true;
                    }
                    else if (this.strLocalPart.equals("PrepRequestStaged")) {
                        this.istatus = 10;
                        bst = true;
                    }
                    else {
                        bst = false;
                    }
                }
            }
            catch (Exception ex) {
                WLog.log.error((Object)ex, ex.fillInStackTrace());
                this.istatus = 12;
                return false;
            }
        }
        return bst;
    }

    private boolean ISprinterActivated() {
//        try {
//            final DiscoverPrinter2Input dpInput = new DiscoverPrinter2Input();
//            dpInput.setIncludeActions(false);
//            DiscoverPrinter2Output dpOutput = new DiscoverPrinter2Output();
//            dpOutput = BOCDummyPrinter.port.discoverPrinter2(dpInput);
//            final List<Option> discoverPrinterOptionList = dpOutput.getOption();
//            final List<Version> discoverPrinterVersionList = dpOutput.getVersion();
//            final List<Serialization> dps = dpOutput.getSerialization();
//            int i = 0;
//            while (i < dps.size()) {
//                final String strname = dps.get(i).getName();
//                System.out.println("strname="+strname);
//                if (strname.equals("SerialNumber")) {
//                    final String sern = dps.get(i).getValue();
//                    System.out.println("SerialNumber: " + sern);
//                    WLog.log.info((Object)("SerialNumber: " + sern));
//                    final int strleng = sern.length();
//                    if (strleng < 20) {
//                        if (sern.equals("NM11020")) {
//                            return true;
//                        }
//                        WLog.log.fatal((Object)"sern < 20");
//                        return false;
//                    }
//                    else {
//                        final String[] strsn = sern.split(",");
//                        String strsn2 = "";
//                        String strsn3 = "";
//                        String strsn4 = "";
//                        if (strsn.length != 3) {
//                            WLog.log.fatal((Object)"strsn not 3 count ");
//                            return false;
//                        }
//                        strsn2 = strsn[0];
//                        strsn3 = strsn[1];
//                        strsn4 = strsn[2];
//                        if (strsn2.length() > 6) {
//                            strsn2 = strsn2.substring(0, 6);
//                        }
//                        final WCOBPrinterActivate wcobPrinterActivate = new WCOBPrinterActivate();
//                        final int st = wcobPrinterActivate.printerActivate(strsn4, strsn2);
//                        if (st != 0) {
//                            WLog.log.fatal((Object)("WCOBPrinterActivate return = " + st));
//                            return false;
//                        }
//                        break;
//                    }
//                }
//                else {
//                    ++i;
//                }
//            }
//        }
//        catch (Exception ex) {
//            WLog.log.error((Object)ex, ex.fillInStackTrace());
//            return false;
//        }
        return true;
    }

    private boolean SmartCardPark() {
        System.out.println("1111111111111111111111111111111");
        boolean bstatus = false;
        WLog.log.info((Object)"IC park star");
        ++BOCDummyPrinter.actionId;
        this.submitActionInput.setClient(this.clientName);
        this.submitActionInput.setJobId(BOCDummyPrinter.JobID);
        this.submitActionInput.setActionId(BOCDummyPrinter.actionId);
        this.submitActionInput.setType("Park");
        final Parameter newParam = new Parameter();
        newParam.setName("ParkPosition");
        newParam.setValue("SmartCard");
        this.submitActionInput.getParameter().clear();
        this.submitActionInput.getParameter().add(newParam);
        this.submitActionOutput = BOCDummyPrinter.port.submitAction(this.submitActionInput);
        bstatus = this.doWaitForStatus2(false);
        WLog.log.info((Object)"IC park end");
        if (this.submitActionOutput.isSuccess()) {
            return bstatus;
        }
        return this.submitActionOutput.isSuccess();
    }

    private boolean SmartCardUnpark() {
        boolean bstatus = false;
        System.out.println("this.clientName="+this.clientName);
        System.out.println("jobid="+BOCDummyPrinter.JobID);
        WLog.log.info((Object)"IC unpark star");
        final ResumeJobInput resumeJobInput = new ResumeJobInput();
        ResumeJobOutput resumeJobOutput = new ResumeJobOutput();

        resumeJobInput.setClient(this.clientName);
        resumeJobInput.setJobId(BOCDummyPrinter.JobID);
        try {
            resumeJobOutput = BOCDummyPrinter.port.resumeJob(resumeJobInput);
        }catch(Exception e){
            System.out.println("错误1111:"+e.getLocalizedMessage());
        }
        bstatus = this.doWaitForStatus2(false);
        WLog.log.info((Object)"IC unpark end");
        if (this.submitActionOutput.isSuccess()) {
            return bstatus;
        }
        return this.submitActionOutput.isSuccess();
    }
}
