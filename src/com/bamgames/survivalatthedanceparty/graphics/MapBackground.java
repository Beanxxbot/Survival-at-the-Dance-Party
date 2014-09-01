package com.bamgames.survivalatthedanceparty.graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
public class MapBackground {
    BufferedImage image;
    public MapBackground(String s){
        try{
            image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void render(Graphics2D g){
        g.drawImage(image,0,0,null);
    }
}
