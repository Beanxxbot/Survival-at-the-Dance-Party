package com.bamgames.survivalatthedanceparty.graphics;


import com.bamgames.survivalatthedanceparty.main.GamePanel;

import  javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Timer;
import javax.swing.ImageIcon;

public class Player {
    private BufferedImage[] player;
    public int locationx;
    public int locationy;
    public Player(String s) {
        try {
            player = new BufferedImage[]{
                    ImageIO.read(getClass().getResourceAsStream(s+".png")),ImageIO.read(getClass().getResourceAsStream(s+"-2.png")),ImageIO.read(getClass().getResourceAsStream(s+"-3.png")),ImageIO.read(getClass().getResourceAsStream(s+"-4.png"))
            };
        }catch(Exception e){
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
        for(int i = 0; i < player.length; i++){
            g.drawImage(player[i],locationx,locationy,25,25,null);
            System.out.println(i);
        }
    }
}
