package com.bamgames.survivalatthedanceparty.graphics;

import com.bamgames.survivalatthedanceparty.graphics.Player;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
public class MapBackground {
    Player p;
    BufferedImage image;
    private int drawx;
    private int drawy;
    public MapBackground(String s){
        drawx = 0;
        drawy = 0;
        try{
            image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void dynamicRender(Graphics2D g){
        if(p.blocx >= 675){
            drawx += 700;
        }
        g.drawImage(image,drawx,drawy,null);
    }
}
