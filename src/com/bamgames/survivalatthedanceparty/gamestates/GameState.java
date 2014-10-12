package com.bamgames.survivalatthedanceparty.gamestates;

import    com.bamgames.survivalatthedanceparty.graphics.Player;
import com.bamgames.survivalatthedanceparty.levels.IntroLevel;
import com.bamgames.survivalatthedanceparty.levels.LevelBlueprint;
import com.bamgames.survivalatthedanceparty.main.GamePanel;
import com.bamgames.survivalatthedanceparty.graphics.MapBackground;

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
    int gamestates = 0;
    public int speedx;
    public int speedy;
    public static boolean mapmode;
    IntroLevel IL;
    boolean shouldStart;
    boolean isJumping;
    public static int RkeySharing;
    public static int PkeySharing;

    public GameState(){
        p = new Player("/textures/player/player.png");
        m = new MapBackground("/maps/SADP Map Draft.png");
        IL = new IntroLevel("/objects/HellDoor.png");
        movement = 0;
        isW = false;
        isA = false;
        isS = false;
        isD = false;
        isPaused = false;
        shouldStart = false;
        mapmode = false;
        speedx = 0;
        speedy = 0;
        isJumping = false;
    }
    public void update(){

    }
    public void jump(int x,int y,Graphics2D g){
        //Doing later
    }
    public void render(Graphics2D g) {
        if (isPaused == true) {
            isPaused = false;
            GP.shouldRepaint = true;
            p2 = new Paused();
            GP.GSM = 5;
        }
        switch (gamestates) {
            case 0:
                IL.update(p);
                IL.render(g);
                if (shouldStart == false) {
                    movement = 5;
                    mapmode = false;
                    p.locationx = 20;
                    p.locationy = 150;
                    p.sizex = 50;
                    p.sizey = 50;
                    p.setPosition(0,0);
                    p.render(g);
                }
                break;
            default:
                System.out.println("Game States Error");
                break;
        }
        if (shouldStart == true && mapmode == true) {
            m.dynamicRender(g);
            if (movement == 0) {
                speedx = 0;
                speedy = 0;
            } else if (movement == 1) {
                speedx = 0;
                speedy = -4;
            } else if (movement == 2) {
                speedx = -4;
                speedy = 0;
            } else if (movement == 3) {
                speedx = 0;
                speedy = 4;
            } else if (movement == 4) {
                speedx = 4;
                speedy = 0;
            }
            p.setPosition(speedx,speedy);
            p.render(g);
        }
        if(shouldStart == true && mapmode == false){
            if(movement == 0){
                speedx = 0;
                speedy = 0;
            }else if(movement == 1){
                int x = p.locationx;
                int y = p.locationy;
                p.isJump = true;
                jump(x,y,g);
            }else if(movement == 2){
                speedx = -6;
                speedy = 0;
            }else if(movement == 4){
                speedx = 6;
                speedy = 0;
            }else if(movement == 3){
                p.isMove = false;
            }
            p.setPosition(speedx,speedy);
            p.render(g);
        }
    }
    public void keyPressed(int k){
        PkeySharing = k;
        if(k == KeyEvent.VK_W){
            movement = 1;
            isW = true;
            p.isMove = true;
            shouldStart = true;
        }else if(k == KeyEvent.VK_A){
            movement = 2;
            isA = true;
            p.isMove = true;
            shouldStart = true;
        }else if(k == KeyEvent.VK_S){
            movement = 3;
            isS = true;
            p.isMove = true;
            shouldStart = true;
        }else if(k == KeyEvent.VK_D){
            movement = 4;
            isD = true;
            p.isMove = true;
            shouldStart = true;
        }else if(k == KeyEvent.VK_X){
            //TEMPORARY
            mapmode = true;
        }
        //PAUSE STATE VERSION 1.0
        if(k == KeyEvent.VK_ESCAPE){
            isPaused = true;
            p.isMove = false;
        }
    }
    public void keyReleased(int k) {
        RkeySharing = k;
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
}
