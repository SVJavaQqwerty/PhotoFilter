import functions.MyImageFilter;
import utils.ImageUtils;
import utils.RgbMaster;

import java.awt.image.BufferedImage;


public class Task_1 {
    public static void main(String[] args) {
        BufferedImage bi = ImageUtils.getImage("images/5.jpg");
        RgbMaster rgbMaster0 = new RgbMaster(bi);
        RgbMaster rgbMaster1 = new RgbMaster(bi);
        RgbMaster rgbMaster2 = new RgbMaster(bi);
        RgbMaster rgbMaster3 = new RgbMaster(bi);
        RgbMaster rgbMaster4 = new RgbMaster(bi);


        rgbMaster0.changeImage(MyImageFilter::greyScale);
        ImageUtils.saveImage(rgbMaster0.getImage(), "images/1.jpg");

        rgbMaster1.changeImage(MyImageFilter::onlyRed);
        ImageUtils.saveImage(rgbMaster1.getImage(), "images/2.jpg");

        rgbMaster2.changeImage(MyImageFilter::onlyGreen);
        ImageUtils.saveImage(rgbMaster2.getImage(), "images/3.jpg");

        rgbMaster3.changeImage(MyImageFilter::onlyBlue);
        ImageUtils.saveImage(rgbMaster3.getImage(), "images/4.jpg");

        rgbMaster4.changeImage(MyImageFilter::sepia);
        ImageUtils.saveImage(rgbMaster4.getImage(), "images/6.jpg");

    }
}