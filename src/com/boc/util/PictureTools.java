package com.boc.util;

import sun.font.*;
import java.awt.image.*;
import java.awt.*;
import java.io.*;
import com.sun.image.codec.jpeg.*;
import org.w3c.dom.*;
import javax.imageio.stream.*;
import java.util.*;
import javax.imageio.*;
import javax.imageio.metadata.*;

public class PictureTools
{
    private static final String pngType = "png";
    private static final int Margin = 2;
    private static final double INCH_2_CM = 2.54;
    
    public static boolean TextToPicture(final String text, final Font font, final Color fontColor, final Color backColor, final String imageType, final String outPath) throws IOException {
        final FontMetrics fontMetrics = FontDesignMetrics.getMetrics(font);
        final int fontWidth = fontMetrics.stringWidth(text);
        final int fontHeight = fontMetrics.getHeight();
        final int width = fontWidth + 2;
        final int height = fontHeight + 2;
        BufferedImage bufferedImage = new BufferedImage(width, height, 8);
        Graphics2D graphics2d = (Graphics2D)bufferedImage.getGraphics();
        if (imageType.equalsIgnoreCase("png")) {
            bufferedImage = graphics2d.getDeviceConfiguration().createCompatibleImage(width, height, 3);
            graphics2d.dispose();
            graphics2d = (Graphics2D)bufferedImage.getGraphics();
        }
        else {
            graphics2d.setBackground(backColor);
            graphics2d.clearRect(0, 0, width, height);
        }
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2d.setColor(fontColor);
        graphics2d.setFont(font);
        final int ascent = fontMetrics.getAscent();
        final int descent = fontMetrics.getDescent();
        final int y = (height - (ascent + descent)) / 2 + ascent;
        graphics2d.drawString(text, 1, y);
        graphics2d.dispose();
        ImageIO.write(bufferedImage, imageType, new File(outPath));
        bufferedImage.flush();
        if (imageType.equalsIgnoreCase("png")) {
            pngSetDpi(outPath, 600);
        }
        else {
            jpgSetDpi(outPath, 600, 600);
        }
        return true;
    }
    
    public static byte[] TextToPicture(final String text, final Font font, final Color fontColor, final Color backColor, final String imageType) throws IOException {
        final FontMetrics fontMetrics = FontDesignMetrics.getMetrics(font);
        final int fontWidth = fontMetrics.stringWidth(text);
        final int fontHeight = fontMetrics.getHeight();
        final int width = fontWidth + 2;
        final int height = fontHeight + 2;
        BufferedImage bufferedImage = new BufferedImage(width, height, 8);
        Graphics2D graphics2d = (Graphics2D)bufferedImage.getGraphics();
        if (imageType.equalsIgnoreCase("png")) {
            bufferedImage = graphics2d.getDeviceConfiguration().createCompatibleImage(width, height, 3);
            graphics2d.dispose();
            graphics2d = (Graphics2D)bufferedImage.getGraphics();
        }
        else {
            graphics2d.setBackground(backColor);
            graphics2d.clearRect(0, 0, width, height);
        }
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2d.setColor(fontColor);
        graphics2d.setFont(font);
        final int ascent = fontMetrics.getAscent();
        final int descent = fontMetrics.getDescent();
        final int y = (height - (ascent + descent)) / 2 + ascent;
        graphics2d.drawString(text, 1, y);
        graphics2d.dispose();
        if (imageType.equalsIgnoreCase("png")) {
            return pngSetDpi(bufferedImage, 600);
        }
        return jpgSetDpi(bufferedImage, 600, 600);
    }
    
    public static boolean TextToTif(final String text, final Font font, final String outPath) throws IOException {
        final Font font2 = new Font(font.getName(), font.getStyle(), font.getSize() * 600 / 75);
        final FontMetrics fontMetrics = FontDesignMetrics.getMetrics(font2);
        final int fontWidth = fontMetrics.stringWidth(text);
        final int fontHeight = fontMetrics.getHeight();
        final int width = fontWidth + 2;
        final int height = fontHeight + 2;
        final BufferedImage bufferedImage = new BufferedImage(width, height, 12);
        final Graphics2D graphics2d = (Graphics2D)bufferedImage.getGraphics();
        graphics2d.setBackground(Color.WHITE);
        graphics2d.clearRect(0, 0, width, height);
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2d.setColor(Color.BLACK);
        graphics2d.setFont(font2);
        final int ascent = fontMetrics.getAscent();
        final int descent = fontMetrics.getDescent();
        final int y = (height - (ascent + descent)) / 2 + ascent;
        graphics2d.drawString(text, 1, y);
        graphics2d.dispose();
        TIFConvert.convert(bufferedImage, outPath, 600, 5, 1.0f);
        bufferedImage.flush();
        return true;
    }
    
    public static byte[] TextToTif(final String text, final Font font) throws IOException {
        final Font font2 = new Font(font.getName(), font.getStyle(), font.getSize() * 600 / 75);
        final FontMetrics fontMetrics = FontDesignMetrics.getMetrics(font2);
        final int fontWidth = fontMetrics.stringWidth(text);
        final int fontHeight = fontMetrics.getHeight();
        final int width = fontWidth + 2;
        final int height = fontHeight + 2;
        final BufferedImage bufferedImage = new BufferedImage(width, height, 12);
        final Graphics2D graphics2d = (Graphics2D)bufferedImage.getGraphics();
        graphics2d.setBackground(Color.WHITE);
        graphics2d.clearRect(0, 0, width, height);
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2d.setColor(Color.BLACK);
        graphics2d.setFont(font2);
        final int ascent = fontMetrics.getAscent();
        final int descent = fontMetrics.getDescent();
        final int y = (height - (ascent + descent)) / 2 + ascent;
        graphics2d.drawString(text, 1, y);
        graphics2d.dispose();
        final byte[] byteImageData = TIFConvert.convert(bufferedImage, 600, 5, 1.0f);
        bufferedImage.flush();
        return byteImageData;
    }
    
    public static boolean TextToBmp(final String text, final Font font, final String outPath) throws IOException {
        final FontMetrics fontMetrics = FontDesignMetrics.getMetrics(font);
        final int fontWidth = fontMetrics.stringWidth(text);
        final int fontHeight = fontMetrics.getHeight();
        final int width = fontWidth + 2;
        final int height = fontHeight + 2;
        final BufferedImage bufferedImage = new BufferedImage(width, height, 12);
        final Graphics2D graphics2d = (Graphics2D)bufferedImage.getGraphics();
        graphics2d.setBackground(Color.WHITE);
        graphics2d.clearRect(0, 0, width, height);
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2d.setColor(Color.BLACK);
        graphics2d.setFont(font);
        final int ascent = fontMetrics.getAscent();
        final int descent = fontMetrics.getDescent();
        final int y = (height - (ascent + descent)) / 2 + ascent;
        graphics2d.drawString(text, 1, y);
        graphics2d.dispose();
        ImageIO.write(bufferedImage, "bmp", new File(outPath));
        bufferedImage.flush();
        return true;
    }
    
    public static byte[] TextToBmp(final String text, final Font font) throws IOException {
        final FontMetrics fontMetrics = FontDesignMetrics.getMetrics(font);
        final int fontWidth = fontMetrics.stringWidth(text);
        final int fontHeight = fontMetrics.getHeight();
        final int width = fontWidth + 2;
        final int height = fontHeight + 2;
        final BufferedImage bufferedImage = new BufferedImage(width, height, 12);
        final Graphics2D graphics2d = (Graphics2D)bufferedImage.getGraphics();
        graphics2d.setBackground(Color.WHITE);
        graphics2d.clearRect(0, 0, width, height);
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2d.setColor(Color.BLACK);
        graphics2d.setFont(font);
        final int ascent = fontMetrics.getAscent();
        final int descent = fontMetrics.getDescent();
        final int y = (height - (ascent + descent)) / 2 + ascent;
        graphics2d.drawString(text, 1, y);
        graphics2d.dispose();
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "bmp", byteArrayOutputStream);
        bufferedImage.flush();
        final byte[] byteImageData = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        return byteImageData;
    }
    
    public static void jpgSetDpi(final String filePath, final int xDensity, final int yDensity) throws IOException {
        final File file = new File(filePath);
        final BufferedImage image = ImageIO.read(file);
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        final JPEGImageEncoder jpegEncoder = JPEGCodec.createJPEGEncoder(fileOutputStream);
        final JPEGEncodeParam jpegEncodeParam = jpegEncoder.getDefaultJPEGEncodeParam(image);
        jpegEncodeParam.setDensityUnit(1);
        jpegEncoder.setJPEGEncodeParam(jpegEncodeParam);
        jpegEncodeParam.setQuality(1.0f, false);
        jpegEncodeParam.setXDensity(xDensity);
        jpegEncodeParam.setYDensity(yDensity);
        jpegEncoder.encode(image, jpegEncodeParam);
        image.flush();
        fileOutputStream.close();
    }
    
    private static byte[] jpgSetDpi(final BufferedImage image, final int xDensity, final int yDensity) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final JPEGImageEncoder jpegEncoder = JPEGCodec.createJPEGEncoder(baos);
        final JPEGEncodeParam jpegEncodeParam = jpegEncoder.getDefaultJPEGEncodeParam(image);
        jpegEncodeParam.setDensityUnit(1);
        jpegEncoder.setJPEGEncodeParam(jpegEncodeParam);
        jpegEncodeParam.setQuality(1.0f, false);
        jpegEncodeParam.setXDensity(xDensity);
        jpegEncodeParam.setYDensity(yDensity);
        jpegEncoder.encode(image, jpegEncodeParam);
        final byte[] bImage = baos.toByteArray();
        baos.flush();
        baos.close();
        return bImage;
    }
    
    private static byte[] pngSetDpi(final BufferedImage gridImage, final int dpi) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
        final Iterator<ImageWriter> iw = ImageIO.getImageWritersByFormatName("png");
        while (iw.hasNext()) {
            final ImageWriter writer = iw.next();
            final ImageWriteParam writeParam = writer.getDefaultWriteParam();
            final ImageTypeSpecifier typeSpecifier = ImageTypeSpecifier.createFromBufferedImageType(8);
            final IIOMetadata metadata = writer.getDefaultImageMetadata(typeSpecifier, writeParam);
            if (!metadata.isReadOnly()) {
                if (!metadata.isStandardMetadataFormatSupported()) {
                    continue;
                }
                final double dotsPerMilli = 1.0 * dpi / 10.0 / 2.54;
                final IIOMetadataNode horiz = new IIOMetadataNode("HorizontalPixelSize");
                horiz.setAttribute("value", Double.toString(dotsPerMilli));
                final IIOMetadataNode vert = new IIOMetadataNode("VerticalPixelSize");
                vert.setAttribute("value", Double.toString(dotsPerMilli));
                final IIOMetadataNode dim = new IIOMetadataNode("Dimension");
                dim.appendChild(horiz);
                dim.appendChild(vert);
                final IIOMetadataNode root = new IIOMetadataNode("javax_imageio_1.0");
                root.appendChild(dim);
                metadata.mergeTree("javax_imageio_1.0", root);
                writer.setOutput(ios);
                writer.write(metadata, new IIOImage(gridImage, null, metadata), writeParam);
                gridImage.flush();
                break;
            }
        }
        final byte[] bImage = baos.toByteArray();
        ios.flush();
        baos.flush();
        ios.close();
        baos.close();
        return bImage;
    }
    
    private static void pngSetDpi(final String filePath, final int dpi) throws IOException {
        final Iterator<ImageWriter> iw = ImageIO.getImageWritersByFormatName("png");
        while (iw.hasNext()) {
            final File file = new File(filePath);
            final BufferedImage gridImage = ImageIO.read(file);
            final ImageWriter writer = iw.next();
            final ImageWriteParam writeParam = writer.getDefaultWriteParam();
            final ImageTypeSpecifier typeSpecifier = ImageTypeSpecifier.createFromBufferedImageType(8);
            final IIOMetadata metadata = writer.getDefaultImageMetadata(typeSpecifier, writeParam);
            if (!metadata.isReadOnly()) {
                if (!metadata.isStandardMetadataFormatSupported()) {
                    continue;
                }
                final double dotsPerMilli = 1.0 * dpi / 10.0 / 2.54;
                final IIOMetadataNode horiz = new IIOMetadataNode("HorizontalPixelSize");
                horiz.setAttribute("value", Double.toString(dotsPerMilli));
                final IIOMetadataNode vert = new IIOMetadataNode("VerticalPixelSize");
                vert.setAttribute("value", Double.toString(dotsPerMilli));
                final IIOMetadataNode dim = new IIOMetadataNode("Dimension");
                dim.appendChild(horiz);
                dim.appendChild(vert);
                final IIOMetadataNode root = new IIOMetadataNode("javax_imageio_1.0");
                root.appendChild(dim);
                metadata.mergeTree("javax_imageio_1.0", root);
                final ImageOutputStream stream = ImageIO.createImageOutputStream(file);
                writer.setOutput(stream);
                writer.write(metadata, new IIOImage(gridImage, null, metadata), writeParam);
                stream.close();
                gridImage.flush();
                break;
            }
        }
    }
}
