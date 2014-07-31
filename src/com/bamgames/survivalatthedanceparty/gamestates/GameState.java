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
    boolean isW;
    boolean isA;
    boolean isS;
    boolean isD;

    public GameState(){
        p = new Player("/Player/tempplayer.png");
        movement = 0;
        isW = false;
        isA = false;
        isS = false;
        isD = false;
    }
    public void update(){

    }
    public void render(Graphics2D g){
            if (movement == 0) {
                p.setPosition(0, 0);
                p.render(g);
            } else if (movement == 1) {
                p.setPosition(0, -4);
                p.render(g);
            } else if (movement == 2) {
                p.setPosition(-4, 0);
                p.render(g);
            } else if (movement == 3) {
                p.setPosition(0, 4);
                p.render(g);
            } else if (movement == 4) {
                p.setPosition(4, 0);
                p.render(g);
            }
    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_W){
            movement = 1;
            isW = true;
        }else if(k == KeyEvent.VK_A){
            movement = 2;
            isA = true;
        }else if(k == KeyEvent.VK_S){
            movement = 3;
            isS = true;
        }else if(k == KeyEvent.VK_D){
            movement = 4;
            isD = true;
        }
        //Add double movement will fix movement stopping glitch
        //Add paused
    }
    public void keyReleased(int k) {
        if(k == KeyEvent.VK_W){
            isW = false;
        }else if(k == KeyEvent.VK_A){
            isA = false;
        }else if(k == KeyEvent.VK_S){
            isS = false;
        }else if(k == KeyEvent.VK_D){
            isD = false;
        }
        if(k == KeyEvent.VK_W || k == KeyEvent.VK_S || k == KeyEvent.VK_A || k == KeyEvent.VK_D){
               if(isW == false && isA == false && isS == false && isD == false){
                   movement = 0;
               }
        }
    }
    public void mousePressed(int m){

    }
    public void mouseMoved(int x, int y){

    }
}
