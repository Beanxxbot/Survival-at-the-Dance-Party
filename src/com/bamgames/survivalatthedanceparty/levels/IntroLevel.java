package com.bamgames.survivalatthedanceparty.levels;

import com.bamgames.survivalatthedanceparty.gamestates.GameState;
import com.bamgames.survivalatthedanceparty.graphics.Player;

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
    String name;
    GameState gs;
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
    }
    public void keyReleased(int k){

    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_ENTER && shouldEnter == true && enddialog == true){
        gs.changeState(1);
        }
        if(k == KeyEvent.VK_ENTER){
            interact();
        }
        if(notDone == true) {
            switch(k){
                case 48:
                    name += "0";
                break;
                case 49:
                    name += "1";
                break;
                case 50:
                    name += "2";
                break;
                case 51:
                    name += "3";
                break;
                case 52:
                    name += "4";
                break;
                case 53:
                    name += "5";
                case 54:
                    name += "6";
                break;
                case 55:
                    name += "7";
                break;
                case 56:
                    name += "8";
                break;
                case 57:
                    name += "9";
                break;
                case 65:
                    name += "a";
                break;
                case 66:
                    name += "b";
                break;
                case 67:
                    name += "c";
                break;
                case 68:
                    name += "d";
                break;
                case 69:
                    name += "e";
                break;
                case 70:
                    name += "f";
                break;
                case 71:
                    name += "g";
                break;
                case 72:
                    name += "h";
                break;
                case 73:
                    name += "i";
                break;
                case 74:
                    name += "j";
                break;
                case 75:
                    name += "k";
                break;
                case 76:
                    name += "l";
                break;
                case 77:
                    name += "m";
                break;
                case 78:
                    name += "n";
                break;
                case 79:
                    name += "o";
                break;
                case 80:
                    name += "p";
                break;
                case 81:
                    name += "q";
                break;
                case 82:
                    name += "r";
                break;
                case 83:
                    name += "s";
                break;
                case 84:
                    name += "t";
                break;
                case 85:
                    name += "u";
                break;
                case 86:
                    name += "v";
                break;
                case 87:
                    name += "w";
                break;
                case 88:
                    name += "x";
                break;
                case 89:
                    name += "y";
                break;
                case 90:
                    name += "z";
                break;
            }
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
                g.setColor(Color.RED);
                g.fillRect(200,250,300,100);
                notDone = true;
                while(notDone == true){

                }
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
                dialog = true;
            break;
        }
    }
}
