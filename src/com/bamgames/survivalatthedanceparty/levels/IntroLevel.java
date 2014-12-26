package com.bamgames.survivalatthedanceparty.levels;

import com.bamgames.survivalatthedanceparty.gamestates.GameState;
import com.bamgames.survivalatthedanceparty.graphics.Player;
import com.bamgames.survivalatthedanceparty.reference.AlphabetLibrary;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class IntroLevel implements LevelBlueprint {
    BufferedImage doorHell;
    BufferedImage speechBubble;
    BufferedImage doorguard;
    boolean wBox;
    boolean nBox;
    boolean shouldEnter;
    boolean isCap;
    boolean isOn;
    public String name;
    int dialogstate;
    String uname;
    GameState gs;
    AlphabetLibrary al;

    public IntroLevel(String door, String doorg, String speechBPath) {
        try {
            doorHell = ImageIO.read(getClass().getResourceAsStream(door));
            speechBubble = ImageIO.read(getClass().getResourceAsStream(speechBPath));
            doorguard = ImageIO.read(getClass().getResourceAsStream(doorg));
        } catch (Exception e) {
            e.printStackTrace();
        }
        shouldEnter = false;
        dialogstate = 0;
        al = new AlphabetLibrary();
        name = "";
        uname = "???";
        wBox = true;
        nBox = false;
    }

    public void keyReleased(int k) {
        if (k == 16) {
            isCap = false;
        }
    }

    public void keyPressed(int k) {
        if (k == KeyEvent.VK_ENTER && shouldEnter == true) {
            gs.changeState(1);
        }
        if (k == KeyEvent.VK_ENTER) {
            interact();
        }
        if (nBox == true) {
            isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
            name = al.getName(k, name, isOn, 10);
        }
    }

    public void getInventory() {

    }

    public void update(Player p) {
        if (p.locationx >= 475 && p.locationx <= 575) {
            shouldEnter = true;
        } else {
            shouldEnter = false;
        }
        if (p.locationx <= 0) {
            p.locationx = 0;
        } else if (p.locationx >= 650) {
            p.locationx = 650;
        }
    }

    public void playerdialog(Graphics2D g){
        if(nBox == true && wBox == false){
            if(dialogstate == 6){
                nBox = false;
            }
            gs.movement = 0;
            g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 25));
            g.setColor(Color.RED);
            g.fillRect(200,250,300,100);
            g.setColor(Color.BLACK);
            g.drawString("Please Enter Name:",215,280);
            g.drawString(name,215,320);
        }else if(wBox == false && nBox == false){
            g.setColor(Color.RED);
            g.drawRect(0, 300, 699, 99);
            g.setColor(Color.BLACK);
            g.fillRect(1, 301, 698, 98);
            g.setColor(Color.WHITE);
            g.fillRoundRect(10, 300, 30, 30, 100, 100);
            g.setColor(Color.RED);
            g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 20));
            g.drawString(name, 45, 322);
            switch(dialogstate){
                case 6:
                    g.drawString("What the heck happpend? Why did I end up in hell?",5,360);
                break;
                case 7:
                    wBox = true;
                break;
                case 8:
                    g.drawString("...",5,360);
                    wBox = true;
                break;
            }
        }
    }

    public void dguarddialog(Graphics2D g){
        if(wBox == true) {
            g.setColor(Color.RED);
            g.drawRect(0, 300, 699, 99);
            g.setColor(Color.BLACK);
            g.fillRect(1, 301, 698, 98);
            g.drawImage(doorguard, 10, 300, 30, 30, null);
            g.setColor(Color.RED);
            g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 20));
            g.drawString(uname, 45, 322);
            switch (dialogstate) {
                case 0:
                    g.drawString("Hey! Hey You!!!",5,360);
                    break;
                case 1:
                    g.drawString("Yeah Yeah, over here! By the door marked hell!",5,360);
                    break;
                case 2:
                    g.drawString("Hello my name is... well, call me guard.", 5, 360);
                    uname = "Door Guard";
                    break;
                case 3:
                    g.drawString("Anyways... Welcome to Hell!", 5, 360);
                break;
                case 4:
                    g.drawString("For registration purposes I must ask your name.",5,360);
                break;
                case 5:
                    wBox = false;
                    nBox = true;
                break;
                case 7:
                    g.drawString("No no no no no! You got it all wrong! It's not a bad thing to end up here.",5,360);
                break;
                case 8:
                    wBox = false;
                break;

                //Display WASD Keys
            }
        }
    }
    public void render(Graphics2D g) {
        g.drawImage(doorHell, 500, 130, 50, 70, null);
        g.drawImage(doorguard, 450, 80, 30, 30, null);
        playerdialog(g);
        dguarddialog(g);
    }
    public void interact(){
        dialogstate++;
    }
}