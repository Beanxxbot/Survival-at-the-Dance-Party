package com.bamgames.survivalatthedanceparty.graphics;


import  com.bamgames.survivalatthedanceparty.main.GamePanel;

import  javax.imageio.ImageIO;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Timer;
import java.awt.event.ActionEvent;

public class Player{
    private BufferedImage[] player;
    public int locationx;
    public int locationy;
    private int count;
    public boolean isMove;
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
        count = 0;
        isMove = false;
    }
    public void setPosition(int locationx, int locationy){
        this.locationx += locationx;
        this.locationy += locationy;

        //Boundaries
        if(this.locationx >= 675){
            this.locationx = 675;
        }else if(this.locationx <= 0){
            this.locationx = 0;
        }
        if(this.locationy >= 375){
            this.locationy = 375;
        }else if(this.locationy <= 0){
            this.locationy = 0;
        }
    }
    public void render(Graphics2D g){
        if(isMove){
            count++;
        }else{
            count = 0;
        }
        g.drawImage(player[count],locationx,locationy,25,25,null);
        if(count >= 3){
            count = 0;
        }
    }
}
