package com.bamgames.survivalatthedanceparty.gamestates;

import  com.bamgames.survivalatthedanceparty.graphics.Player;
import com.bamgames.survivalatthedanceparty.main.GamePanel;

import javax.swing.text.Keymap;
import java.awt.event.KeyEvent;
import java.awt.Graphics2D;
import java.security.Key;

public class GameState{
    Player p;
    int movement;

    public GameState(){
        p = new Player("/Player/tempplayer.png");
        movement = 0;
    }
    public void update(){

    }
    public void render(Graphics2D g){
            if (movement == 0) {
                p.setPosition(0, 0);
                p.render(g);
            } else if (movement == 1) {
                p.setPosition(0, -5);
                p.render(g);
            } else if (movement == 2) {
                p.setPosition(-5, 0);
                p.render(g);
            } else if (movement == 3) {
                p.setPosition(0, 5);
                p.render(g);
            } else if (movement == 4) {
                p.setPosition(5, 0);
                p.render(g);
            }
    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_W){
            movement = 1;
        }else if(k == KeyEvent.VK_A){
            movement = 2;
        }else if(k == KeyEvent.VK_S){
            movement = 3;
        }else if(k == KeyEvent.VK_D){
            movement = 4;
        }
        //Add double movement will fix movement stopping glitch
        //Add paused
    }
    public void keyReleased(int k) {
        if (k == KeyEvent.VK_W) {
            movement = 0;
        } else if (k == KeyEvent.VK_A) {
            movement = 0;
        } else if (k == KeyEvent.VK_S){;
            movement = 0;
        }else if(k == KeyEvent.VK_D){
            movement = 0;
        }
    }
    public void mousePressed(int m){

    }
    public void mouseMoved(int x, int y){

    }
}
