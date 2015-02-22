package database;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/21/2015.
 */
public class MImageData {
    BufferedImage[] images;
    public MImageData(){
        try {

        }catch(Exception e){
            System.out.println("Get Image Failure");
            e.printStackTrace();
        }
    }

    public BufferedImage getImage(int picid){
        BufferedImage image;
        image = images[picid];
        return image;
    }
}
