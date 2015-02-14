package com.bamgames.survivalatthedanceparty.graphics;


import  com.bamgames.survivalatthedanceparty.graphics.MapBackground;
import com.bamgames.survivalatthedanceparty.gamestates.GameState;

import  javax.imageio.ImageIO;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Timer;
import java.awt.event.ActionEvent;

public class Player{
    MapBackground m;
    GameState gs;
    private BufferedImage player;
    public int locationx;
    public int locationy;
    public static int blocx;
    public static int blocy;
    public boolean isMove;
    private int spritex = 0;
    private int spritey = 0;
    public int sizex = 25;
    public int sizey = 25;
    public boolean isJump = false;
    int timesRan;
    boolean goDown;
    public Player(String s) {
        try {
            player = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
        locationx = 0;
        locationy = 0;
        isMove = false;
    }
    public void jump(){
        if (isJump == true) {
            if (timesRan >= 20) {
                goDown = true;
            } else if (timesRan <= 0) {
                goDown = false;
                timesRan = 0;
                isJump = false;
            }
            if (goDown == true) {
                setPosition(0, 6);
                timesRan -= 1;
            } else {
                setPosition(0, -6);
                timesRan += 1;
            }
        } else {
            if (timesRan <= 0) {
                timesRan = 0;
            }else {
                setPosition(0, 6);
                timesRan -= 1;
            }
        }
    }
    public void setPosition(int locationx, int locationy){
        this.locationx += locationx;
        this.locationy += locationy;
        if(gs.mapmode == true){
        if(m.change == 1){
            this.locationx = 1;
            m.change = 0;
        }else if(m.change == 2){
            this.locationx = 674;
            m.change = 0;
        }else if(m.change == 3){
            this.locationy = 1;
            m.change = 0;
        }else if(m.change == 4){
            this.locationy = 374;
            m.change = 0;
        }
            if (m.parea == 0) {
                if (this.locationx < 0) {
                    this.locationx = 0;
                }
                if (this.locationy < 0) {
                    this.locationy = 0;
                }
            } else if (m.parea == 1) {
                if (this.locationx > 675) {
                    this.locationx = 675;
                }
                if (this.locationy < 0) {
                    this.locationy = 0;
                }
            } else if (m.parea == 2) {
                if (this.locationx < 0) {
                    this.locationx = 0;
                }
                if (this.locationy > 375) {
                    this.locationy = 0;
                }
            } else if (m.parea == 3) {
                if (this.locationx > 675) {
                    this.locationx = 675;
                }
                if (this.locationy > 375) {
                    this.locationy = 375;
                }
            }
        }
        blocx = this.locationx;
        blocy = this.locationy;
    }
    public void render(Graphics2D g){
        if(spritey == 768){
            spritey = 0;
        }
        if(isMove){
            spritey += 256;
        }else{
            spritey = 0;
        }
        if(isJump){

        }else{

        }
            g.drawImage(player.getSubimage(spritex, spritey, 256, 256), locationx, locationy, sizex, sizey, null);
    }
    public void update(){}
}
