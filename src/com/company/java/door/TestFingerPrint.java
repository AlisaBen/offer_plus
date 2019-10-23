package com.company.java.door;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import org.junit.Test;
//import net.gdface.image.FingerPrint;
//import net.gdface.image.NotImage;
//import net.gdface.image.UnsupportedFormat;

public class TestFingerPrint {

    public static void main(String[] args) throws IOException{
        FingerPrint fp1 = new FingerPrint(ImageIO.read(new File("C:\\Users\\Arya\\Pictures\\暴风截图2019814-1388699500.jpg")));
        FingerPrint fp2 =new FingerPrint(ImageIO.read(new File("C:\\Users\\Arya\\Pictures\\暴风截图2019814-1388700390.jpg")));
        System.out.println(fp1.toString(true));
        System.out.printf("sim=%f",fp1.compare(fp2));
    }
}
