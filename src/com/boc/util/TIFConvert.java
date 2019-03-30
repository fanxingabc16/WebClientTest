package com.boc.util;

import com.sun.media.imageio.stream.*;
import java.io.*;
import javax.imageio.stream.*;
import javax.imageio.spi.*;
import java.awt.image.*;
import com.sun.media.imageioimpl.plugins.tiff.*;
import javax.imageio.*;
import java.util.*;
import com.sun.media.imageio.plugins.tiff.*;
import javax.imageio.metadata.*;

public class TIFConvert
{
    public static final int CLR_RGB = 1;
    public static final int CLR_GRAY_SCALE = 10;
    public static final int CLR_BLACK_WHITE = 12;
    public static final int COMPRESSION_NONE = 1;
    public static final int COMPRESSION_CCITT_RLE = 2;
    public static final int COMPRESSION_CCITT_T_4 = 3;
    public static final int COMPRESSION_CCITT_T_6 = 4;
    public static final int COMPRESSION_LZW = 5;
    public static final int COMPRESSION_JPEG = 7;
    public static final int COMPRESSION_ZLIB = 8;
    public static final int COMPRESSION_PACKBITS = 32773;
    public static final int COMPRESSION_DEFLATE = 32946;
    protected static final int DEFAULT_DPI = 300;
    protected static final int DEFAULT_COLOR = 12;
    protected static final int DEFAULT_COMPRESSION = 4;
    protected static final float DEFAULT_COMPRESSION_QUALITY = 1.0f;
    
    protected static void convert(final BufferedImage[] image, final String tif, final int dpi, final int compression, final float quality) throws IOException {
        final File file = new File(tif);
        if (file.exists()) {
            file.delete();
        }
        final RandomAccessFile raf = new RandomAccessFile(file, "rw");
        final FileChannelImageOutputStream fios = new FileChannelImageOutputStream(raf.getChannel());
        convert(image, fios, dpi, compression, quality);
        fios.flush();
        fios.close();
        raf.close();
    }
    
    protected static void convert(final BufferedImage[] image, final File file, final int dpi, final int compression, final float quality) throws IOException {
        if (file.exists()) {
            file.delete();
        }
        final RandomAccessFile raf = new RandomAccessFile(file, "rw");
        final FileChannelImageOutputStream fios = new FileChannelImageOutputStream(raf.getChannel());
        convert(image, fios, dpi, compression, quality);
        fios.flush();
        fios.close();
        raf.close();
    }
    
    protected static byte[] convert(final BufferedImage[] image, final int dpi, final int compression, final float quality) throws Exception {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
        convert(image, ios, dpi, compression, quality);
        ios.flush();
        ios.close();
        return baos.toByteArray();
    }
    
    protected static byte[] convert(final BufferedImage image, final int dpi, final int compression, final float quality) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
        convert(image, ios, dpi, compression, quality);
        ios.flush();
        ios.close();
        return baos.toByteArray();
    }
    
    protected static void convert(final BufferedImage[] image, final Object os, final int dpi, final int compression, float quality) throws IOException {
        final TIFFImageWriter writer = new TIFFImageWriter((ImageWriterSpi)new TIFFImageWriterSpi());
        final TIFFImageWriteParam iwp = new TIFFImageWriteParam(writer.getLocale());
        writer.setOutput(os);
        writer.prepareWriteSequence((IIOMetadata)null);
        iwp.setCompressionMode(2);
        iwp.setCompressionType(getCompression(compression));
        if (!isCompressionLossless(compression)) {
            if (quality < 0.0f || quality > 1.0f) {
                quality = 1.0f;
            }
            iwp.setCompressionQuality(quality);
        }
        for (int i = 0; i < image.length; ++i) {
            final ImageTypeSpecifier imageType = ImageTypeSpecifier.createFromRenderedImage(image[i]);
            TIFFImageMetadata imageMetadata = (TIFFImageMetadata)writer.getDefaultImageMetadata(imageType, (ImageWriteParam)iwp);
            imageMetadata = createImageMetadata(imageMetadata, image[i].getHeight(), image[i].getWidth(), dpi, compression, image[i].getType());
            writer.writeToSequence(new IIOImage(image[i], null, (IIOMetadata)imageMetadata), (ImageWriteParam)iwp);
        }
        writer.endWriteSequence();
        writer.dispose();
    }
    
    protected static void convert(final BufferedImage image, final String outPath, final int dpi, final int compression, final float quality) throws IOException {
        final RandomAccessFile raf = new RandomAccessFile(new File(outPath), "rw");
        final FileChannelImageOutputStream fios = new FileChannelImageOutputStream(raf.getChannel());
        convert(image, fios, dpi, compression, quality);
        fios.flush();
        fios.close();
        raf.close();
    }
    
    protected static void convert(final BufferedImage image, final Object os, final int dpi, final int compression, float quality) throws IOException {
        final TIFFImageWriter writer = new TIFFImageWriter((ImageWriterSpi)new TIFFImageWriterSpi());
        final TIFFImageWriteParam iwp = new TIFFImageWriteParam(writer.getLocale());
        writer.setOutput(os);
        writer.prepareWriteSequence((IIOMetadata)null);
        iwp.setCompressionMode(2);
        iwp.setCompressionType(getCompression(compression));
        if (!isCompressionLossless(compression)) {
            if (quality < 0.0f || quality > 1.0f) {
                quality = 1.0f;
            }
            iwp.setCompressionQuality(quality);
        }
        final ImageTypeSpecifier imageType = ImageTypeSpecifier.createFromRenderedImage(image);
        TIFFImageMetadata imageMetadata = (TIFFImageMetadata)writer.getDefaultImageMetadata(imageType, (ImageWriteParam)iwp);
        imageMetadata = createImageMetadata(imageMetadata, image.getHeight(), image.getWidth(), dpi, compression, image.getType());
        writer.writeToSequence(new IIOImage(image, null, (IIOMetadata)imageMetadata), (ImageWriteParam)iwp);
        writer.endWriteSequence();
        writer.dispose();
    }
    
    protected static BufferedImage getBufferedImage(final int color, final int compression, final int width, final int height) {
        BufferedImage image;
        if (compression == 2 || compression == 3 || compression == 4 || color == 12) {
            image = new BufferedImage(width, height, 12);
        }
        else if (color == 10) {
            image = new BufferedImage(width, height, 10);
        }
        else {
            image = new BufferedImage(width, height, 1);
        }
        return image;
    }
    
    protected static String getCompression(final int compression) {
        String c = null;
        for (int i = 0; i < TIFFImageWriter.compressionTypes.length; ++i) {
            if (compression == TIFFImageWriter.compressionNumbers[i]) {
                c = TIFFImageWriter.compressionTypes[i];
            }
        }
        return c;
    }
    
    protected static boolean isCompressionLossless(final int compression) {
        boolean lossless = true;
        for (int i = 0; i < TIFFImageWriter.compressionTypes.length; ++i) {
            if (compression == TIFFImageWriter.compressionNumbers[i]) {
                lossless = TIFFImageWriter.isCompressionLossless[i];
            }
        }
        return lossless;
    }
    
    protected static TIFFImageMetadata createImageMetadata(final TIFFImageMetadata imageMetadata, final int height, final int width, final int dpi, final int compression, final int type) throws IIOInvalidTreeException {
        final char[] cImageWidth = { (char)width };
        final char[] cImageLength = { (char)height };
        final char[] cResolutionUnit = { '\u0002' };
        final long[][] cDpiResolutionX = { { dpi, 1L }, new long[2] };
        final long[][] cDpiResolutionY = { { dpi, 1L }, new long[2] };
        final char[] cRowsPerStrip = { (char)height };
        final char[] cStripOffsets = { '\u0001' };
        final char[] cStripByteCounts = { '\u0001' };
        final long[] cSubFileType = { 0L };
        final TIFFDirectory ifd = (TIFFDirectory)imageMetadata.getRootIFD();
        final BaselineTIFFTagSet base = BaselineTIFFTagSet.getInstance();
        final TIFFTag tagImageLength = base.getTag(257);
        final TIFFTag tagImageWidth = base.getTag(256);
        final TIFFField fieldImageLength = new TIFFField(tagImageLength, 3, 1, (Object)cImageLength);
        final TIFFField fieldImageWidth = new TIFFField(tagImageWidth, 3, 1, (Object)cImageWidth);
        ifd.addTIFFField(fieldImageLength);
        ifd.addTIFFField(fieldImageWidth);
        final TIFFTag tagResUnit = base.getTag(296);
        final TIFFTag tagXRes = base.getTag(282);
        final TIFFTag tagYRes = base.getTag(283);
        final TIFFField fieldResUnit = new TIFFField(tagResUnit, 3, 1, (Object)cResolutionUnit);
        final TIFFField fieldXRes = new TIFFField(tagXRes, 5, 1, (Object)cDpiResolutionX);
        final TIFFField fieldYRes = new TIFFField(tagYRes, 5, 1, (Object)cDpiResolutionY);
        ifd.addTIFFField(fieldResUnit);
        ifd.addTIFFField(fieldXRes);
        ifd.addTIFFField(fieldYRes);
        final TIFFTag tagRowsPerStrip = base.getTag(278);
        final TIFFTag tagStripOffSets = base.getTag(273);
        final TIFFTag tagStripByteCounts = base.getTag(279);
        final TIFFField fieldRowsPerStrip = new TIFFField(tagRowsPerStrip, 3, 1, (Object)cRowsPerStrip);
        final TIFFField fieldStripOffsets = new TIFFField(tagStripOffSets, 3, 1, (Object)cStripOffsets);
        final TIFFField fieldStripByteCounts = new TIFFField(tagStripByteCounts, 3, 1, (Object)cStripByteCounts);
        ifd.addTIFFField(fieldRowsPerStrip);
        ifd.addTIFFField(fieldStripOffsets);
        ifd.addTIFFField(fieldStripByteCounts);
        final TIFFTag tagSubFileType = base.getTag(254);
        final TIFFTag tagBitsPerSample = base.getTag(258);
        final TIFFField fieldSubFileType = new TIFFField(tagSubFileType, 4, 1, (Object)cSubFileType);
        final TIFFField fieldBitsPerSample = new TIFFField(tagBitsPerSample, 1);
        ifd.addTIFFField(fieldSubFileType);
        ifd.addTIFFField(fieldBitsPerSample);
        return imageMetadata;
    }
}
