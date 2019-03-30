package com.makecard.test;

import java.util.*;
import java.awt.*;
import net.coobird.thumbnailator.*;
import com.boc.externalprinter.*;
import java.io.*;

public class MakeCardMain
{
    public static void main(final String[] args) throws Exception {
        CardSide arg0 = new CardSide();
        CardSide arg2 = new CardSide();
        final CardSide TestcardSideFront = new CardSide();
        final CardSide cardSideFront = new CardSide();
        final CardSide cardSideBack = new CardSide();
        final ArrayList<PrintTxt> printTxtListFront = new ArrayList<PrintTxt>();
        final ArrayList<PrintTxt> printTxtListBack = new ArrayList<PrintTxt>();
        final ArrayList<EndentText> endentTextListFront = new ArrayList<EndentText>();
        final ArrayList<EndentText> endentTextListBack = new ArrayList<EndentText>();
        final Font font = new Font("\u5b8b\u4f53", 1, 10);
        final PrintTxt printTxtFront1 = new PrintTxt("\u56fd\u6b63\u6b63\u7530\u7530\u7530\u7530\u7530\u75301234567800", 0.0f, 0.0f, font, Color.BLACK);
        printTxtListFront.add(printTxtFront1);
        final PrintTxt printTxtFront2 = new PrintTxt("\u59d3\u540d\uff1a\u6d4b\u8bd501", 0.1f, 2.05f, font, Color.BLACK);
        printTxtListFront.add(printTxtFront2);
        final EndentText endentTextFront1 = new EndentText("6213 1234 3456 8888", 2, 0.305f, 0.8f);
        endentTextListFront.add(endentTextFront1);
        final EndentText endentTextFront2 = new EndentText("05/23", 1, 1.413f, 0.497f);
        endentTextListFront.add(endentTextFront2);
        final EndentText endentTextFront3 = new EndentText("CARDHOLDER NAME", 1, 0.4f, 0.343f);
        endentTextListFront.add(endentTextFront3);
        final EndentText endentTextFront4 = new EndentText("6213 123", 4, 1.615f, 1.265f);
        endentTextListFront.add(endentTextFront4);
        final ImageRectangle iro = new ImageRectangle();
        iro.setX(0.0);
        iro.setY(0.0);
        final File file = new File("C:\\Users\\lys98\\Desktop\\ÖÐÐÐÖÆ¿¨\\1.jpg");
        final FileInputStream inputStream = new FileInputStream(file);
        byte[] resultImageAsRawBytes = null;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        Thumbnails.of(new InputStream[] { inputStream }).outputFormat("jpg").forceSize(1010, 638).outputQuality(1.0f).toOutputStream((OutputStream)out);
        resultImageAsRawBytes = out.toByteArray();
        out.close();
        inputStream.close();
        iro.setData(resultImageAsRawBytes);
        iro.setImagePath("jpeg");
        cardSideFront.setAngel(0);
        cardSideFront.setBackGroudImagedata((byte[])null);
        cardSideFront.setBackGroudImagePath((String)null);
        cardSideFront.setIcBlock((IcBlock)null);
        cardSideFront.setLogo((Logo)null);
        cardSideFront.setBackGroudImagedata(resultImageAsRawBytes);
        cardSideFront.setSign((ImageRectangle)null);
        cardSideFront.setPrintTxt((ArrayList)null);
        cardSideFront.setPrintTxt((ArrayList)printTxtListFront);
        cardSideFront.setEmbossTxt((ArrayList)endentTextListFront);
        final PrintTxt printTxtBack1 = new PrintTxt("Back123456789", 1.0f, 0.45f, font, Color.BLACK);
        printTxtListBack.add(printTxtBack1);
        final PrintTxt printTxtBack2 = new PrintTxt("\u59d3\u540d\uff1a\u6d4b\u8bd5Back", 1.0f, 0.85f, font, Color.BLACK);
        printTxtListBack.add(printTxtBack2);
        cardSideBack.setAngel(0);
        cardSideBack.setBackGroudImagedata((byte[])null);
        cardSideBack.setBackGroudImagePath((String)null);
        cardSideBack.setIcBlock((IcBlock)null);
        cardSideBack.setLogo((Logo)null);
        cardSideBack.setPhoto((ImageRectangle)null);
        cardSideBack.setSign((ImageRectangle)null);
        cardSideBack.setPrintTxt((ArrayList)null);
        cardSideBack.setEmbossTxt((ArrayList)null);
        TestcardSideFront.setAngel(0);
        TestcardSideFront.setBackGroudImagedata((byte[])null);
        TestcardSideFront.setBackGroudImagePath((String)null);
        TestcardSideFront.setIcBlock((IcBlock)null);
        TestcardSideFront.setLogo((Logo)null);
        TestcardSideFront.setPhoto((ImageRectangle)null);
        TestcardSideFront.setSign((ImageRectangle)null);
        TestcardSideFront.setPrintTxt((ArrayList)null);
        TestcardSideFront.setEmbossTxt((ArrayList)null);
        final String[] trackargs = { "11111111111111", "2222222222222", "3333333333333333" };
        final BOCDummyPrinter boc = new BOCDummyPrinter("192.168.100.5");
        boc.connect("connect");
        final String strps = boc.getPrinterState();
        boolean st = boc.feedCard(1);
        arg0 = cardSideFront;
        arg2 = cardSideBack;
        st = boc.PrintCard(arg0, arg2);
        if (!st) {
            boc.MoveToReject();
        }
        st = boc.EmbossOrIndentCard(arg0, arg2);
        if (!st) {
            boc.MoveToReject();
        }
        st = boc.MoveToOutput();
    }
    
    public static byte[] toByteArray(final String filename) throws IOException {
        final File f = new File(filename);
        if (!f.exists()) {
            throw new FileNotFoundException(filename);
        }
        final ByteArrayOutputStream bos = new ByteArrayOutputStream((int)f.length());
        BufferedInputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(f));
            final int buf_size = 1024;
            final byte[] buffer = new byte[buf_size];
            int len = 0;
            while (-1 != (len = in.read(buffer, 0, buf_size))) {
                bos.write(buffer, 0, len);
            }
            return bos.toByteArray();
        }
        catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        finally {
            try {
                in.close();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
            bos.close();
        }
    }
}
