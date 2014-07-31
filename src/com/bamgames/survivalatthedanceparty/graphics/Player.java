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
    public void setPosition(int locationx, int locationy){
        this.locationx += locationx;
        this.locationy += locationy;

        //Boundaries
        if(this.locationx >= 680){
            this.locationx = 680;
        }else if(this.locationx <= 0){
            this.locationx = 0;
        }
        if(this.locationy >= 380){
            this.locationy = 380;
        }else if(this.locationy <= 0){
            this.locationy = 0;
        }
    }
    public void render(Graphics2D g){
            g.drawImage(player, locationx, locationy, 20, 20,null);
    }
}
