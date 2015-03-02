package dialog;

import database.MImageData;
import main.GameManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/25/2015.
 */
public class Dialog {
    BufferedImage profile;
    public int dState;
    public int numChar;
    public String[] speakers = new String[numChar];
    public Dialog(){
        try {
            profile = ImageIO.read(getClass().getResourceAsStream("/textures/profile/defaultprof.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(GameManager GM) {

    }

    public void render(Graphics2D g, MImageData m) {
        g.setColor(Color.BLACK);
        g.fillRect(2, 602, 1374, 126);
        g.setColor(Color.GRAY);
        g.drawRect(1, 601, 1355, 110);
        g.drawImage(profile,20,620,30,30,null);
    }

    public void updateProf(String path){
        try{
            profile = ImageIO.read(getClass().getResourceAsStream(path));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void changeDialog(){
        dState++;
    }
}
