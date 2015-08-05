package com.endava;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by msaros on 8/4/2015.
 */
public class testPoza {

    @Test
    public void dimPoza()
    {
        try {
            URL url = new URL("https://www.google.com.pk/images/srpr/logo4w.png");
            BufferedImage img = ImageIO.read(url);
            int width = img.getWidth();
            int height = img.getHeight();
            System.out.println("Widht:" + width + " " + "Height:" + height);
            img = null;
        } catch (IOException e) {
        }
    }
}
