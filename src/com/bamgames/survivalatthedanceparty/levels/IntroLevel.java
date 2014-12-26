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
    boolean shouldEnter;
    boolean notDone;
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
        al = new AlphabetLibrary();
        name = "";
        uname = "???";
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
        if (notDone == true) {
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

    }

    public void dguarddialog(Graphics2D g){
        g.setColor(Color.RED);
        g.drawRect(0,300,699,99);
        g.setColor(Color.BLACK);
        g.fillRect(1,301,698,98);
        g.setColor(Color.WHITE);
        g.fillRoundRect(10,300,30,30,100,100);
        g.setColor(Color.RED);
        g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 20));
        g.drawString(uname,45,322);
        if(dialogstate == 0){
            g.drawString("Hey! Hey You!!!",5,360);
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