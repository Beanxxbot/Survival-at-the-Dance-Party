package com.bamgames.survivalatthedanceparty.levels;

import com.bamgames.survivalatthedanceparty.gamestates.GameState;
import com.bamgames.survivalatthedanceparty.graphics.Player;
import com.bamgames.survivalatthedanceparty.reference.AlphabetLibrary;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class IntroLevel implements LevelBlueprint{
    BufferedImage doorHell;
    BufferedImage speechBubble;
    BufferedImage doorguard;
    boolean dialog;
    int dialogTime;
    boolean enddialog;
    boolean shouldEnter;
    int dbubbleY;
    int bubbleX;
    int bubbleY;
    int sizex;
    int sizey;
    boolean notDone;
    boolean isCap;
    boolean ovrCap;
    boolean isOn;
    String name;
    GameState gs;
    AlphabetLibrary al;
    String[] dialog1 = {
            "Hey!","Hey You!"
    };
    String[] dialog2 = {
            "Yeah yeah, over here!","By the door marked 'hell'!"
    };
    String[] dialog3 = {
            "Hello, my name is...", "well, call me Guard."
    };
    String[] dialog4 = {
            "Welcome to Hell!"
    };
    String[] dialog5 = {
            "For registration purposes","I need to ask your name."
    };
    public IntroLevel(String door,String doorg,String speechBPath){
        try{
            doorHell = ImageIO.read(getClass().getResourceAsStream(door));
            speechBubble = ImageIO.read(getClass().getResourceAsStream(speechBPath));
            doorguard = ImageIO.read(getClass().getResourceAsStream(doorg));
        }catch(Exception e){
            e.printStackTrace();
        }
        shouldEnter = false;
        dialog = false;
        enddialog = false;
        dialogTime = 0;
        notDone = false;
        isCap = false;
        ovrCap = false;
        al = new AlphabetLibrary();
        name = "";
    }
    public void keyReleased(int k){
        if(k == 16){
            isCap = false;
        }
    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_ENTER && shouldEnter == true && enddialog == true){
        gs.changeState(1);
        }
        if(k == KeyEvent.VK_ENTER){
            interact();
        }
        if(notDone == true) {
            isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
            name = (al.getName(k,name,isOn));
            System.out.println(k);
        }
        }

    public void getInventory(){

    }
    public void update(Player p){
    if(p.locationx >= 475 && p.locationx <= 575){
        shouldEnter = true;
    }else{
        shouldEnter = false;
    }
    if(p.locationx <= 0){
        p.locationx = 0;
    }else if(p.locationx >= 650){
        p.locationx = 650;
    }
     if(dialog == true) {
         bubbleX = p.locationx;
         bubbleY = p.locationy;
     }else{
         dbubbleY = 60;
     }
    }
    public void render(Graphics2D g){
        g.drawImage(doorHell,500,130,50,70,null);
        g.drawImage(doorguard,450,80,30,30,null);
        if(dialog == true){
            switch(dialogTime){
                case 5:

                break;
            }
            g.drawImage(speechBubble,bubbleX,bubbleY,sizex,sizey,null);
            switch(dialogTime){
                case 5:

                break;
            }
        }else if(enddialog == true){

        }else{
            switch(dialogTime){
                case 0:
                    g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 10));
                    g.setColor(Color.BLACK);
                    sizex = 70;
                    sizey = 70;
                break;
                case 1:
                    sizex = 170;
                    sizey = 70;
                break;
                case 2:
                    sizex = 160;
                    sizey = 70;
                break;
                case 3:
                    sizex = 120;
                    sizey = 50;
                break;
                case 4:
                    sizex = 170;
                    sizey = 50;
                    notDone = true;
                    gs.movement = 0;
                    g.setColor(Color.RED);
                    g.fillRect(200,250,300,100);
                    g.setColor(Color.BLACK);
                    g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 20));
                    g.drawString("Please Enter Name:",220,280);
                    g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 30));
                    g.drawString(name,220,310);
                    g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 10));
                break;
                case 5:

                break;
            }
            bubbleX = (450 - sizex);
            bubbleY = dbubbleY - (sizey - 30);
            g.drawImage(speechBubble,bubbleX,bubbleY,sizex,sizey,null);
            switch(dialogTime) {
                case 0:
                for (int i = 0; i < dialog1.length; i++) {
                    g.drawString(dialog1[i], bubbleX + 10, (bubbleY + 20) + i * 10);
                }
                break;
                case 1:
                    for (int i = 0; i < dialog2.length; i++) {
                        g.drawString(dialog2[i], bubbleX + 15, (bubbleY + 20) + i * 10);
                    }
                break;
                case 2:
                    for (int i = 0; i < dialog3.length; i++) {
                        g.drawString(dialog3[i], bubbleX + 15, (bubbleY + 20) + i * 10);
                    }
                 break;
                case 3:
                    for (int i = 0; i < dialog4.length; i++) {
                        g.drawString(dialog4[i], bubbleX + 10, (bubbleY + 20) + i * 10);
                    }
                break;
                case 4:
                    for (int i = 0; i < dialog5.length; i++) {
                        g.drawString(dialog5[i], bubbleX + 17, (bubbleY + 15) + i * 10);
                    }
                break;
            }
        }
        //Draw Jump Graphics
    }
    public void interact(){
        dialogTime++;
        switch(dialogTime){
            case 1:
               dialog = false;
            break;
            case 2:
                dialog = false;
            break;
            case 3:
                dialog = false;
             break;
            case 4:
                dialog = false;
             break;
            case 5:
                notDone = false;
            break;
            case 6:

            break;
        }
    }
}
