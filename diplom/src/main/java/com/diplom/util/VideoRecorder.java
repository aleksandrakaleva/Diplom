package com.diplom.util;

import static org.monte.media.FormatKeys.*;
//import static org.monte.media.VideoFormatKeys.*;
 
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.VideoFormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
 
public class VideoRecorder {
 
    private final String RECORD_DIRECTORY = "C:/Tools/";
 
    private ScreenRecorder screenRecorder;
 
    public void startRecording(WebDriver driver) {
    	
        try {
            GraphicsConfiguration gc = GraphicsEnvironment
                .getLocalGraphicsEnvironment().getDefaultScreenDevice()
                .getDefaultConfiguration();
 
            File dir = new File(RECORD_DIRECTORY);
 
            // записываем только область окна драйвера
            // для уменьшения размера видео файла
            Point point = driver.manage().window().getPosition();
            Dimension dimension = driver.manage().window().getSize();
 
            Rectangle rectangle = new Rectangle(point.x, point.y,
                dimension.width, dimension.height);

            this.screenRecorder = new ScreenRecorder(gc, rectangle, 
                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, 
                    MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,
                	VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                	VideoFormatKeys.CompressorNameKey,
                	VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, VideoFormatKeys.DepthKey,
                    24, FrameRateKey, Rational.valueOf(15), VideoFormatKeys.QualityKey,
                    1.0f, KeyFrameIntervalKey, 15 * 60),
                new Format(
                    MediaTypeKey, MediaType.VIDEO, EncodingKey,
                    "black", FrameRateKey, Rational.valueOf(30)), null,
                dir);
 
            this.screenRecorder.start();
 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 
    public File stopRecording(String method) {
    	File newFileName = null;
        try {
            this.screenRecorder.stop();
            // переименовываем созданный .avi файл,
            if (method != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH.mm.ss");
                newFileName = new File(RECORD_DIRECTORY+method+" "+dateFormat.format(new Date())+".avi");
                this.screenRecorder.getCreatedMovieFiles().get(0).renameTo(newFileName);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return newFileName;
    }
 
}