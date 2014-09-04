package com.bamgames.survivalatthedanceparty.graphics;

import  com.bamgames.survivalatthedanceparty.graphics.Player;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
public class MapBackground {
    Player p;
    BufferedImage image;
    private int drawx;
    private int drawy;
    public int area;
    public static int parea;
    public static int change;
    public MapBackground(String s){
        drawx = 0;
        drawy = 0;
        area = 0;
        try{
            image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void dynamicRender(Graphics2D g){
        if(area == 0){
            if(p.blocx > 675){
                drawx -= 300;
                area = 1;
                change = 1;
            }else if(p.blocy > 375){
                drawy -= 600;
                area = 2;
                change = 3;
            }
        }else if(area == 1){
            if(p.blocx < 0){
                drawx += 300;
                area = 0;
                change = 2;
            }else if(p.blocy > 375){
                drawy -= 600;
                area = 3;
                change = 3;
            }
        }else if(area == 2){
            if(p.blocx > 675){
                drawx -= 300;
                area = 3;
                change = 1;
            }else if(p.blocy < 0){
                drawy += 600;
                area = 0;
                change = 4;
            }
        }else if(area == 3){
            if(p.blocx < 0){
                drawx += 300;
                area = 2;
                change = 2;
            }else if(p.blocy < 0){
                drawy += 600;
                area = 1;
                change = 4;
            }
        }
        parea = area;
        g.drawImage(image,drawx,drawy,null);
    }
}
