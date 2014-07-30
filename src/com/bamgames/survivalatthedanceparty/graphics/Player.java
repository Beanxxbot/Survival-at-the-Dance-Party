package com.bamgames.survivalatthedanceparty.graphics;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class Player {
    private BufferedImage player;
    public int locationx;
    public int locationy;
    public Player(String s){
        try{
            player = ImageIO.read(getClass().getResourceAsStream(s));
        }catch (Exception e){
            e.printStackTrace();
        }
        locationx = 0;
        locationy = 0;
    }
    public void render(Graphics2D g, int x, int y){
        g.drawImage(player,x,y,null);
        locationx = x;
        locationy = y;
    }
}
