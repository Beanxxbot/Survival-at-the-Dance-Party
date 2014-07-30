package com.bamgames.survivalatthedanceparty.gamestates;

import com.bamgames.survivalatthedanceparty.graphics.Player;

import java.awt.event.KeyEvent;
import java.awt.Graphics2D;
import java.security.Key;

public class GameState {
    Player p;
    Graphics2D g2;
    int locX;
    int locY;
    boolean isStill;
    boolean isHeld;

    public GameState(){
        p = new Player("/Player/tempplayer.png");
    }
    public void update(){

    }
    public void render(Graphics2D g){
        if(isStill == true) {
            locX = p.locationx;
            locY = p.locationy;
            p.render(g, locX, locY);
        }else{
            p.render(g, locX, locY);
        }
    }
    public void playerMove(){

    }
    public void keyPressed(int k, boolean l){
        if(k == KeyEvent.VK_W){
            isHeld = true;
            System.out.println("Heyna");
            while(isHeld) {
                System.out.println("Yo");
                isStill = false;
                locX = p.locationx;
                locY = p.locationy;
                locY -= 5;
            }
        }else if(k == KeyEvent.VK_A){

        }else if(k == KeyEvent.VK_S){

        }else if(k == KeyEvent.VK_D){

        }
    }
    public void keyReleased(int k) {
        if (k == KeyEvent.VK_W) {
            isStill = true;
            isHeld = false;
            System.out.println("No");
        } else if (k == KeyEvent.VK_A) {

        } else if (k == KeyEvent.VK_S){;

        }else if(k == KeyEvent.VK_D){

        }
    }
    public void mousePressed(int m){

    }
    public void mouseMoved(int x, int y){

    }
}
