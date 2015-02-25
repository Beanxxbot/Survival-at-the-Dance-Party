package database;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/21/2015.
 */
public class MImageData {
    BufferedImage[] images = new BufferedImage[2];
    public MImageData(){
        try {
            images[0] = ImageIO.read(getClass().getResourceAsStream("/textures/objects/HellDoor.png"));
            images[1] = ImageIO.read(getClass().getResourceAsStream("/textures/doorguard/DoorGuard.png"));
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
