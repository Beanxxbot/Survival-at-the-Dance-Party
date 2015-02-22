package database;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/21/2015.
 */
public class PGImageData {
    BufferedImage[] images = new BufferedImage[5];

    public PGImageData(){
        try {
            images[0] = ImageIO.read(getClass().getResourceAsStream("/menutextures/settings.png"));
            images[1] = ImageIO.read(getClass().getResourceAsStream("/menutextures/volume.png"));
            images[2] = ImageIO.read(getClass().getResourceAsStream("/menutextures/rez.png"));
            images[3] = ImageIO.read(getClass().getResourceAsStream("/menutextures/back.png"));
            images[4] = ImageIO.read(getClass().getResourceAsStream("/menutextures/about.png"));
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
