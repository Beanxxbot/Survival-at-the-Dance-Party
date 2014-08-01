package com.bamgames.survivalatthedanceparty.gamestates;

import com.bamgames.survivalatthedanceparty.graphics.Background;
import com.bamgames.survivalatthedanceparty.main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AboutState{

    Background b;
    int back = 0;

    String[] about = {
    "Developers: Sirawesomeknight Beanxxbot","Graphics: Jacknob"
    };

    //References
    MenuState m;
    GamePanel GP;

    public AboutState(){
    b = new Background("/Backgrounds/tempbackground.jpg");
    }
    public void update(){

    }
    public void render(Graphics2D g){
        b.render(g);
        g.setColor(Color.red);
        g.drawString("About Version:DEV 0.0.2",200,50);
        for(int i = 0; i < about.length; i++){
            g.drawString(about[i],100,175 + i * 60);
        }
        if(back == 1) {
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
    public void keyReleased(int k){

    }
    public void mousePressed(int m){
        if(m == 1){
            selection();
        }
    }
    public void mouseReleased(int m){

    }
    public void mouseMoved(int x, int y){
        if(x <= 1418 && y >= 709 && x >= 1394 && y <= 742) {
            back = 1;
        }
    }
}
