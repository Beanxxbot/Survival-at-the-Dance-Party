package com.bamgames.survivalatthedanceparty.gamestates;

import   com.bamgames.survivalatthedanceparty.graphics.Player;
import com.bamgames.survivalatthedanceparty.main.GamePanel;
import com.bamgames.survivalatthedanceparty.graphics.MapBackground;

import javax.swing.text.Keymap;
import java.awt.event.KeyEvent;
import java.awt.Graphics2D;
import java.security.Key;

public class GameState{
    Player p;
    Paused p2;
    GamePanel GP;
    MapBackground m;
    int movement;
    boolean isW;
    boolean isA;
    boolean isS;
    boolean isD;
    public boolean isPaused;

    public GameState(){
        p = new Player("/textures/player/player.png");
        m = new MapBackground("/maps/SADP Map Draft.png");
        movement = 0;
        isW = false;
        isA = false;
        isS = false;
        isD = false;
        isPaused = false;
    }
    public void update(){

    }
    public void render(Graphics2D g){
        if(isPaused == true){
            isPaused = false;
            GP.shouldRepaint = true;
            p2 = new Paused();
            GP.GSM = 5;
        }
        m.dynamicRender(g);
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
            p.isMove = true;
        }else if(k == KeyEvent.VK_A){
            movement = 2;
            isA = true;
            p.isMove = true;
        }else if(k == KeyEvent.VK_S){
            movement = 3;
            isS = true;
            p.isMove = true;
        }else if(k == KeyEvent.VK_D){
            movement = 4;
            isD = true;
            p.isMove = true;
        }
        //PAUSE STATE VERSION 1.0
        if(k == KeyEvent.VK_ESCAPE){
            isPaused = true;
            p.isMove = false;
        }

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
                   p.isMove = false;
               }
        }
    }
    public void mousePressed(int m){

    }
    public void mouseMoved(int x, int y){

    }
}
