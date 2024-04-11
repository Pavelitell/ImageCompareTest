package helpers;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import core.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ImageManager extends BaseTest {

    public int actual = (int)(Math.random()*10);
    public int expected = (int)(Math.random()*10);

    public static void downloadExpectedImage(Object image, int generatedNameNumber){
        /* мой путь  с генерированным названием*/
        String downloadPath =  "C:\\Users\\kras8\\OneDrive\\Рабочий стол\\AQA\\ImageManager\\Downloads" +(generatedNameNumber)+".png";
        try {
            URL url = new URL((String)  image);
            InputStream input = url.openStream();
            OutputStream output = new FileOutputStream(downloadPath);

            byte[] b = new byte[2048];
            int length;

            while ((length = input.read(b)) != -1) {
                output.write(b, 0, length);
            }
            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void downloadActualImage(Object image, int generatedNameNumber) {


        /* мой путь  с генерированным названием*/
        String downloadPath = "C:\\Users\\kras8\\OneDrive\\Рабочий стол\\AQA\\ImageManager\\Downloads" + (generatedNameNumber) + ".png";
        try {
            URL url = new URL((String) image);
            InputStream input = url.openStream();
            OutputStream output = new FileOutputStream(downloadPath);

            byte[] b = new byte[2048];
            int length;

            while ((length = input.read(b)) != -1) {
                output.write(b, 0, length);
            }
            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        public static void screenShoting(int generatedNameNumber) throws InterruptedException {
        Thread.sleep(150);
            TakesScreenshot screenshot = (TakesScreenshot) driver ;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            /* мой путь  с генерированным названием*/
            File targetFile = new File ("C:\\Users\\kras8\\OneDrive\\Рабочий стол\\AQA\\ImageManager\\Screenshots\\screenshot" +(generatedNameNumber)+".png");
            try {
                FileUtils.copyFile(srcFile, targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
public static void compareImage(int actualInt, int expectedInt,String packageName,String fileName ){
    BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("C:\\Users\\kras8\\OneDrive\\Рабочий стол\\AQA\\ImageManager\\"+ packageName+"\\" +(fileName)+(actualInt)+".png");
    BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("C:\\Users\\kras8\\OneDrive\\Рабочий стол\\AQA\\ImageManager\\"+ packageName +"\\"+ (fileName)+(expectedInt)+".png");

    File resultDestination = new File( "C:\\Users\\kras8\\OneDrive\\Рабочий стол\\AQA\\ImageManager\\Results\\result"+(actualInt)+(expectedInt)+".png" );
    ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage).compareImages();
    assertNotEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
    ImageComparisonUtil.saveImage(resultDestination, imageComparisonResult.getResult());
}
}
