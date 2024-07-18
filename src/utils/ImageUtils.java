package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {

    public static BufferedImage getImage(String path) {

        try {
            return ImageIO.read(new File(path));
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveImage(BufferedImage image, String path){
        try {
            ImageIO.write(image, "jpg", new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static float[] rgbIntToArray(int pixel) {
        Color color = new Color(pixel);
        return color.getRGBColorComponents(null);
    }


    public static int arrayRgbToInt(float[] pixel) throws IOException {

        if(pixel.length == 3) {
            return new Color(pixel[0], pixel[1], pixel[2]).getRGB();
        } else if(pixel.length == 4) {
            return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getRGB();
        } else {
            throw new IOException("Ошибка создания пикселя!!!!");
        }


    }
}
