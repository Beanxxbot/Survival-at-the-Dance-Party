package com.bamgames.survivalatthedanceparty.gamestates;


import com.bamgames.survivalatthedanceparty.audio.MainMenu;
import com.bamgames.survivalatthedanceparty.graphics.Background;
import com.bamgames.survivalatthedanceparty.main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SettingsState{
    Background b;
    int back;
    MenuState m;
    GamePanel GP;
    int volume;

    public SettingsState(){
        b = new Background("/Backgrounds/tempbackground.jpg");
        back = 0;
        //650 = 100% volume
        //50 = Mute
        volume = 650;
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
        g.setColor(Color.RED);
        g.fillRect(50, 100, 600, 30);
        g.setColor(Color.GRAY);
        g.fillRect(volume,90,30,50);
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

    public void mouseMoved(int x, int y, boolean mouseState) {
        if(mouseState == true){
            if(x >= 50 && x <= 650 && y >= 90 && y <= 140){
                volume = x;
                if(x == 50){
                    GP.shouldMute();
                }
            }
        }else{

        }
    }
}
