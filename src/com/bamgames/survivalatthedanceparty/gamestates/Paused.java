package com.bamgames.survivalatthedanceparty.gamestates;

/*
THIS IS VERSION 1 OF THE PAUSED STATE WILL BE REFINED IN LATER VERSIONS
WILL BE BASED OFF OF IMAGES AND WILL NOT TAKE YOU TO ANOTHER SCREEN
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import com.bamgames.survivalatthedanceparty.main.GamePanel;

public class Paused {
    int currentChoice;
    GamePanel GP;
    String[] paused = {
        "Continue","Main Menu","Quit"
    };
    public Paused(){
    currentChoice = 0;
    }
    public void render(Graphics2D g){
        g.setColor(Color.RED);
        g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 30));
        g.drawString("PAUSED",50,50);
        for(int i = 0; i < paused.length; i++){
            if(i == currentChoice) {
                g.setColor(Color.GRAY);
                g.drawString(paused[i], 75, 75 + i * 30);
            }else{
                g.setColor(Color.RED);
                g.drawString(paused[i], 75, 75 + i * 30);
            }
        }
    }
    public void selection(){
        if(currentChoice == 0){
            GP.shouldRepaint = true;
            GP.GSM = 3;
        }else if(currentChoice == 1){
            GP.shouldRepaint = true;
            GP.GSM = 0;
        }else if(currentChoice == 2){
            System.exit(0);
        }else{
            System.out.println("Error");
        }
    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_W){
            currentChoice--;
            if(currentChoice <= 0){
                currentChoice = 0;
            }
        }else if(k == KeyEvent.VK_S){
            currentChoice++;
            if(currentChoice >= 2){
                currentChoice = 2;
            }
        }
        if(k == KeyEvent.VK_ENTER){
            selection();
        }
    }
}
