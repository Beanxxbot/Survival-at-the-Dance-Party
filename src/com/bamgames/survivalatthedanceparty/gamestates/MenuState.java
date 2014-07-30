package com.bamgames.survivalatthedanceparty.gamestates;

import  com.bamgames.survivalatthedanceparty.main.GamePanel;
import com.bamgames.survivalatthedanceparty.graphics.Background;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuState{
    private Thread thread;
    private int FPS = 60;
    private int targetTime = FPS / 1000;
    private long start;
    private long completed;
    private long waitTime;
    private int colorChooser;
    AboutState a;
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
    }
    private void fancyTitle(Graphics2D g){
        start = System.nanoTime();
        for(int i = 0; i < title.length; i++){
        changeColor(g);
        g.drawString(title[i], 200 + i * 15, 50);
        }
        completed = System.nanoTime() - start;
        waitTime = targetTime - waitTime / 1000000;
        try{
          thread.sleep(waitTime);
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
            //start
        }else if(currentChoice == 1){
            //settings
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
    public void mousePressed(int m){
        if(m == 1){
            selection();
        }
    }
    public void mouseReleased(int m){

    }
    public void mouseMoved(int x, int y){
        if(x >= 606 && y <= 359 && x <= 743 && y >= 320){
            currentChoice = 0;
        }else if(x >= 605 && y <= 418 && x <= 836 && y >= 387){
            currentChoice = 1;
        }else if(x >= 600 && y <= 481 && x <= 777 && y >= 443){
            currentChoice = 2;
        }else if(x >= 606 && y <= 537 && x <= 724 && y >= 506){
            currentChoice = 3;
        }
    }
}
