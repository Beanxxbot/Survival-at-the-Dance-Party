package com.bamgames.survivalatthedanceparty.gamestates;

import  com.bamgames.survivalatthedanceparty.audio.MainMenu;
import com.bamgames.survivalatthedanceparty.audio.PauseAudio;
import   com.bamgames.survivalatthedanceparty.main.GamePanel;
import com.bamgames.survivalatthedanceparty.graphics.Background;
import com.bamgames.survivalatthedanceparty.gamestates.SettingsState;
import com.bamgames.survivalatthedanceparty.gamestates.GameState;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;

public class MenuState{
    private Thread thread;
    private int colorChooser;
    AboutState a;
    SettingsState s;
    GameState gs;
    Thread thread2;
    public static Thread pausethread;
    private String[] title = {
       "S","u","r","v","i","v","a","l","a","t","t","h","e","D","a","n","c","e","P","a","r","t","y"
    };
    private Color[] colors = {
            new Color(0, 0, 255), new Color(255, 0, 0), new Color(255, 255, 255), new Color(255,255,0), new Color(0,128,0), new Color(199,21,133)
    };
    private String[] menu = {
            "Start", "Settings", "About", "Quit"
    };
    int currentChoice = 0;
    Background b;
    GamePanel GP;

    public MenuState(){
        b = new Background("/Backgrounds/tempbackground.jpg");
        thread2 = new Thread(new MainMenu());
        thread2.start();
        pausethread = new Thread(new PauseAudio());
        PauseAudio.pause(false);
        pausethread.start();
    }
    private void fancyTitle(Graphics2D g){
        for(int i = 0; i < title.length; i++){
        changeColor(g);
        g.drawString(title[i], 200 + i * 15, 50);
        }
        try{
          thread.sleep(40);
        }catch(Exception e){
          e.printStackTrace();
        }
    }
    public void changeColor(Graphics2D g){
            g.setColor(colors[colorChooser]);
            colorChooser++;
            if(colorChooser >= colors.length){
                colorChooser = 0;
            }
    }
    private void selection(){
        if(currentChoice == 0){
            GP.shouldRepaint = true;
            gs = new GameState();
            GP.GSM = 3;
        }else if(currentChoice == 1){
            GP.shouldRepaint = true;
            s = new SettingsState();
            GP.GSM = 2;
        }else if(currentChoice == 2){
            GP.shouldRepaint = true;
            a = new AboutState();
            GP.GSM = 1;
        }else if(currentChoice == 3){
            System.exit(0);
        }
    }
    public void update(){

    }
    public void playMusic(){

    }
    public void render(Graphics2D g){
        thread = new Thread();
        thread.start();
        b.render(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Gill Sans", Font.ITALIC + Font.BOLD, 30));
        fancyTitle(g);
        for(int i = 0; i < menu.length; i++){
            if(i == currentChoice){
                g.setColor(Color.GRAY);
                g.drawString(menu[i],GamePanel.width / 2 - 50, (GamePanel.height / 2 - 30) + i * 30);
            }else{
                g.setColor(Color.RED);
                g.drawString(menu[i],GamePanel.width / 2 - 50,(GamePanel.height / 2 - 30) + i * 30);
            }
        }
    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_W){
            currentChoice--;
            if(currentChoice <= -1){
                currentChoice = 0;
            }
        }else if(k == KeyEvent.VK_S){
            currentChoice++;
            if(currentChoice >= 4){
                currentChoice = 3;
            }
        }else if(k == KeyEvent.VK_ENTER){
            selection();
        }
    }
    public void keyReleased(int k){

    }
}
