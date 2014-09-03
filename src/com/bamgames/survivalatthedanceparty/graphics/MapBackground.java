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
    private boolean area[];
    public MapBackground(String s){
        drawx = 0;
        drawy = 0;
        area[0] = false;
        try{
            image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void dynamicRender(Graphics2D g){
        if(area[0] == false){
            if(p.blocx >= 675){
                drawx -= 300;
                area[0] = true;
            }
        }
        g.drawImage(image,drawx,drawy,null);
    }
}
