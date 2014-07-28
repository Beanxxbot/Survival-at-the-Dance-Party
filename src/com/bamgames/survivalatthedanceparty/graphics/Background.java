package com.bamgames.survivalatthedanceparty.graphics;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    private BufferedImage image;
    public Background(String s){
        try{
          // image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void render(Graphics2D g){
        g.drawImage(image, 0, -250, null);
    }
}
