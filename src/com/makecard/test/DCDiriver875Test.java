package com.makecard.test;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;


import com.boc.externalprinter.*;

import net.coobird.thumbnailator.Thumbnails;
import sun.misc.ClassLoaderUtil;

/**
 * @author lys
 * 测试第三方驱动制卡
 */
public class DCDiriver875Test {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
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
		final File file = new File("D:\\pictures\\20190305165543.jpg");
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

		System.out.println("开始测试875驱动：com.boc.externalprinter.BOCDummyPrinter");
		try{
        File dependencyDirectory = new File("D:\\qis\\printjar\\");
	    File[] files = dependencyDirectory.listFiles();
	    ArrayList<URL> urls = new ArrayList<URL>();
	    for (int i = 0; files!=null&&i < files.length; i++)
	    {
	    	//System.out.println("----------------");
	        if (files[i].getName().endsWith(".jar"))
	        {
	        	urls.add(files[i].toURL());
	        	System.out.println(files[i].toURL());
	        }
	    }
	    //URLClassLoader urlClassLoader = new URLClassLoader (urls.toArray(new URL[urls.size()]), ICPerso.class.getClassLoader());
			URLClassLoader urlClassLoader = new URLClassLoader (urls.toArray(new URL[urls.size()]), IPrinter.class.getClassLoader());
	    //加载875驱动
	    Class<?> classToLoad = Class.forName ("com.boc.externalprinter.BOCDummyPrinter", true, urlClassLoader);
        System.out.println("Test bean finished.");

			Constructor c1=classToLoad.getDeclaredConstructor(new Class[]{String.class});
			c1.setAccessible(true);
			Object instance=(Object)c1.newInstance(new Object[]{"192.168.0.3"});
			Method getModelMethod = classToLoad.getDeclaredMethod("connect",String.class);
			//Method execute = classToLoad.getDeclaredMethod("execute",byte[].class,String.class);
			System.out.println("---------------------"+getModelMethod);
			Object result =getModelMethod.invoke(instance,"connect");
			System.out.println("连接设备结果-->"+result);

			getModelMethod = classToLoad.getDeclaredMethod("getModel");
			System.out.println("---------------------"+getModelMethod);
			result =getModelMethod.invoke(instance);
			System.out.println("设备型号-->"+result);

			getModelMethod = classToLoad.getDeclaredMethod("getPrinterState");
			System.out.println("---------------------");
			result =getModelMethod.invoke(instance);
			System.out.println("设备状态-->"+result);
			System.out.println("--进卡---");

			getModelMethod = classToLoad.getDeclaredMethod("feedCard",Integer.TYPE);
			System.out.println("---------------------");
			result =getModelMethod.invoke(instance,1);
			System.out.println("进卡结果-->"+result);
			System.out.println("result:"+result);
			arg0 = cardSideFront;
			arg2 = cardSideBack;
			getModelMethod = classToLoad.getDeclaredMethod("PrintCard",CardSide.class,CardSide.class);
			System.out.println("----------开始写平面--------------------------------------------");
			result =getModelMethod.invoke(instance,arg0,arg2);
			System.out.println("打平面结果-->"+result);
			System.out.println("result:"+result);
			if (!(boolean)result) {
				System.out.println("抛废卡");
				getModelMethod = classToLoad.getDeclaredMethod("MoveToReject");
				result =getModelMethod.invoke(instance);
			}
			//st = boc.EmbossOrIndentCard(arg0, arg2);
			System.out.println("-------------------------开始写凸字--------------------------------");
			getModelMethod = classToLoad.getDeclaredMethod("EmbossOrIndentCard",CardSide.class,CardSide.class);
			result =getModelMethod.invoke(instance,arg0,arg2);
			System.out.println("写凸字完成");
			if (!(boolean)result) {
				System.out.println("抛废卡");
				getModelMethod = classToLoad.getDeclaredMethod("MoveToReject");
				result =getModelMethod.invoke(instance);
				//boc.MoveToReject();
			}
			getModelMethod = classToLoad.getDeclaredMethod("MoveToOutput");
			result =getModelMethod.invoke(instance);
			//st = boc.MoveToOutput();
		if(urlClassLoader!=null){
			ClassLoaderUtil.releaseLoader(urlClassLoader);
		}

	}catch(Exception e)
	{
		e.printStackTrace();
	}finally {
//			if(urlClassLoader!=null){
//				ClassLoaderUtil.releaseLoader(urlClassLoader);
//			}
		}
		
			}
}
