package com.boc.externalprinter;

import com.boc.util.*;
import javax.smartcardio.*;
import com.dpcl2.client.util.*;
import com.dpcl2.ws.client.*;
import javax.xml.bind.*;

public class PcscPrinter_new implements SmartCardInterface
{
    private String protocol;
    private DPCL2PortType port;
    
    public PcscPrinter_new() {
        this.port = null;
    }
    
    public void setPort(final DPCL2PortType port) {
        this.port = port;
    }
    
    public String getProtocol() {
        WLog.log.info((Object)"begin-getProtocol----");
        WLog.log.info((Object)("protocol = " + this.protocol));
        WLog.log.info((Object)"end-getProtocol----");
        return this.protocol;
    }
    
    private ExchangeMessageOutput exchangeMessage(final ExchangeMessageInput exchangeMessageInput) {
        ExchangeMessageOutput tmpExchangeMessageOutput = null;
        int i;
        for (i = 0, i = 0; i < 10; ++i) {
            try {
                tmpExchangeMessageOutput = this.port.exchangeMessage(exchangeMessageInput);
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
    
    public boolean sCardConnect(final String protocol) throws CardException {
        WLog.log.info((Object)("begin-sCardConnect = " + protocol));
        this.protocol = protocol;
        try {
            Thread.sleep(5L);
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return false;
        }
        WLog.log.info((Object)("end-sCardConnect = " + protocol));
        return true;
    }
    
    public boolean sCardDisconnect(final String arg0) throws CardException {
        WLog.log.info((Object)("begin-sCardDisconnect = " + arg0));
        WLog.log.info((Object)("end-sCardDisconnect = " + arg0));
        return true;
    }
    
    public byte[] sCardStatus() throws CardException {
        WLog.log.info((Object)"SCardConnect----");
        byte[] btr = null;
        ExchangeMessageInput exchangeMessageInput = new ExchangeMessageInput();
        exchangeMessageInput.setTunnel("SmartCard");
        exchangeMessageInput.setType("SCardConnect");
        exchangeMessageInput.setMaxSeconds(120L);
        final Parameter parameter = new Parameter();
        parameter.setName("SCardProtocol");
        parameter.setValue("SCARD_PROTOCOL_T0_OR_T1");
        exchangeMessageInput.getParameter().add(parameter);
        ExchangeMessageOutput exchangeMessageOutput = this.exchangeMessage(exchangeMessageInput);
        if (exchangeMessageOutput == null) {
            WLog.log.fatal((Object)"exchangeMessageOutput is null,Connect card failed");
            return btr;
        }
        exchangeMessageInput = new ExchangeMessageInput();
        exchangeMessageInput.setTunnel("SmartCard");
        exchangeMessageInput.setType("SCardStatus");
        exchangeMessageInput.setMaxSeconds(120L);
        WLog.log.info((Object)"begin-sCardStatus----");
        exchangeMessageOutput = null;
        try {
            for (int i = 0; i < 3; ++i) {
                exchangeMessageOutput = this.exchangeMessage(exchangeMessageInput);
                if (exchangeMessageOutput == null) {
                    WLog.log.fatal((Object)"exchangeMessageOutput is null,reset card fail");
                    return btr;
                }
                WLog.log.info((Object)("connect to card:" + exchangeMessageOutput.getResult()));
                if (exchangeMessageOutput.getParameter() != null && exchangeMessageOutput.getParameter().size() > 0) {
                    WLog.log.info((Object)("---- " + exchangeMessageOutput.getParameter().size()));
                    WLog.log.info((Object)("---- " + exchangeMessageOutput.getParameter().get(0).getName() + " " + exchangeMessageOutput.getParameter().get(0).getValue()));
                    WLog.log.info((Object)("---- " + exchangeMessageOutput.getParameter().get(1).getName() + " " + exchangeMessageOutput.getParameter().get(1).getValue()));
                    WLog.log.info((Object)("---- " + exchangeMessageOutput.getParameter().get(2).getName() + " " + exchangeMessageOutput.getParameter().get(2).getValue()));
                    final String cardStatus = exchangeMessageOutput.getParameter().get(2).getValue();
                    WLog.log.info((Object)("cardStatus is " + cardStatus));
                    if (cardStatus.compareToIgnoreCase("SCARD_S_SUCCESS") != 0) {
                        Thread.sleep(1000L);
                    }
                    else if (exchangeMessageOutput.getData() != null && exchangeMessageOutput.getData() != null) {
                        btr = exchangeMessageOutput.getData().getHexBinary();
                        final String atr = ByteUtils.htos(btr);
                        WLog.log.info((Object)("SCardStatus. ATR=" + atr));
                        break;
                    }
                }
            }
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return btr;
        }
        WLog.log.info((Object)"end-sCardStatus----");
        return btr;
    }
    
    public byte[] sCardTransmit(final byte[] apdu) throws CardException {
        WLog.log.info((Object)"begin-sCardTransmit----");
        byte[] btr = null;
        final ExchangeMessageInput exchangeMessageInput = new ExchangeMessageInput();
        exchangeMessageInput.setTunnel("SmartCard");
        exchangeMessageInput.setType("SCardTransmit");
        exchangeMessageInput.setMaxSeconds(120L);
        final MessageData data = new MessageData();
        data.setContentType("application/vnd.dpcl.smartcard_buffer");
        final ObjectFactory factory = new ObjectFactory();
        try {
            WLog.log.info((Object)("send : " + ByteUtils.htos(apdu)));
           // final JAXBElement<byte[]> attachmentElement = factory.createMessageDataBase64(apdu);
            data.setBase64(apdu);
           // WLog.log.info((Object)("begin---SCardTransmit Base64 : " + attachmentElement.toString()));
           // WLog.log.info((Object)("begin---SCardTransmit Base64 value: " + attachmentElement.getValue().toString()));
            exchangeMessageInput.setData(data);
            WLog.log.info((Object)("+++exchangeMessageInput.Tunnel: " + exchangeMessageInput.getTunnel()));
            WLog.log.info((Object)("+++exchangeMessageInput.type: " + exchangeMessageInput.getType()));
            WLog.log.info((Object)("+++exchangeMessageInput.getData: " + exchangeMessageInput.getData().toString()));
            ExchangeMessageOutput exchangeMessageOutput = null;
            for (int i = 0; i < 3; ++i) {
                exchangeMessageOutput = this.exchangeMessage(exchangeMessageInput);
                if (exchangeMessageOutput == null) {
                    WLog.log.fatal((Object)"exchangeMessageOutput is null,Transmit card fail");
                    return btr;
                }
                WLog.log.info((Object)("connect to card:" + exchangeMessageOutput.getResult()));
                if (exchangeMessageOutput.getParameter() != null && exchangeMessageOutput.getParameter().size() > 0) {
                    WLog.log.info((Object)("---- " + exchangeMessageOutput.getParameter().size()));
                    WLog.log.info((Object)("---- " + exchangeMessageOutput.getParameter().get(0).getName() + " " + exchangeMessageOutput.getParameter().get(0).getValue()));
                    final String cardStatus = exchangeMessageOutput.getParameter().get(0).getValue();
                    WLog.log.info((Object)("cardStatus is " + cardStatus));
                    if (cardStatus.compareToIgnoreCase("SCARD_S_SUCCESS") != 0) {
                        Thread.sleep(2000L);
                    }
                    else if (exchangeMessageOutput.getData() != null && exchangeMessageOutput.getData()!= null) {
                        btr = exchangeMessageOutput.getData().getHexBinary();
                        final String response = ByteUtils.htos(btr);
                        WLog.log.info((Object)("apdu response:" + response));
                        break;
                    }
                }
            }
        }
        catch (Exception e) {
            WLog.log.error((Object)e, e.fillInStackTrace());
            return btr;
        }
        WLog.log.info((Object)"end-sCardTransmit----");
        return btr;
    }
}
