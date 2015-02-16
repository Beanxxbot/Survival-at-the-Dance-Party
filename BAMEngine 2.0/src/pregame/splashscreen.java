package pregame;

import main.GameManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/15/2015.
 */
public class splashscreen{
    private BufferedImage splash;
    public void initialize(){
        try{
            splash = ImageIO.read(getClass().getResourceAsStream("/BAMLogo.png"));
        }catch(Exception e){
            System.out.println("Splash Image Problem");
            e.printStackTrace();
        }
    }
    public void update(GameManager GM){

    }
    public void render(Graphics2D g){
        g.drawImage(splash,0,-10,1366,768,null);
    }
}
