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
    private boolean spritex;
    private boolean spritey;
    public Player(String s) {
        try {
            
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
        }else {
            count = 0;
        }
        switch(count);
        g.drawImage(player[count].getSubimage(0,0,256,256),locationx,locationy,25,25,null);
        if(count >= 3){
            count = 0;
        }
    }
}
