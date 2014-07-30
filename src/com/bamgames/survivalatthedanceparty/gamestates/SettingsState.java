package com.bamgames.survivalatthedanceparty.gamestates;


import com.bamgames.survivalatthedanceparty.graphics.Background;
import com.bamgames.survivalatthedanceparty.gamestates.MenuState;
import com.bamgames.survivalatthedanceparty.main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SettingsState {
    Background b;
    int back;
    MenuState m;
    GamePanel GP;

    public SettingsState(){
        b = new Background("/Backgrounds/tempbackground.jpg");
        back = 0;
    }
    public void update(){

    }
    public void render(Graphics2D g){
        b.render(g);
        g.setColor(Color.RED);
        g.drawString("Settings",300,50);
        if(back == 1){
            g.setColor(Color.GRAY);
            g.drawString("Back", 525, 350);
        }else{
            g.setColor(Color.RED);
            g.drawString("Back", 525, 350);
        }
    }
    private void selection(){
        if(back == 1){
            GP.shouldRepaint = true;
            m = new MenuState();
            GP.GSM = 0;
        }
    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_W || k == KeyEvent.VK_S){
            back = 1;
        }
        if(k == KeyEvent.VK_ENTER){
            selection();
        }
    }
    public void mousePressed(int m){
        if(m == 1){
            System.out.println("Hello");
            selection();
        }
    }
    public void mouseMoved(int x, int y){
        if(x >= 1236 && y >= 701 && x <= 1380 && y <= 746){
            back = 1;
        }
    }
}
