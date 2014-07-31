package com.bamgames.survivalatthedanceparty.graphics;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;

public class SplashScreen {
    BufferedImage image;
    public SplashScreen(String s){
        try{
            image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void render(Graphics2D g){
        g.drawImage(image,0,0,700,400,null);
    }
}
