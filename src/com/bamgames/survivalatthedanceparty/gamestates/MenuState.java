package com.bamgames.survivalatthedanceparty.gamestates;

import com.bamgames.survivalatthedanceparty.main.GamePanel;
import com.bamgames.survivalatthedanceparty.manager.GameStateManager;
import com.bamgames.survivalatthedanceparty.manager.GameState;
import com.bamgames.survivalatthedanceparty.graphics.Background;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MenuState extends GameState{
    private int colorChooser;
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
    public MenuState(GameStateManager gsm){
        this.gsm = gsm;
        b = new Background("/Backgrounds/tempmenu.jpg");
    }
    private void fancyTitle(Graphics2D g){
        for(int i = 0; i < title.length; i++){
        changeColor(g);
        g.drawString(title[i], 200 + i * 15, 50);
        }
    }
    public void changeColor(Graphics2D g){
            colorChooser = 1;
            g.setColor(colors[colorChooser]);
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
            //about
        }else if(currentChoice == 3){
            System.exit(0);
        }
    }
    public void initialize(){

    }
    public void update(){

    }
    public void render(Graphics2D g){
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
        if(k == KeyEvent.VK_UP){
            currentChoice--;
            if(currentChoice <= -1){
                currentChoice = 0;
            }
        }else if(k == KeyEvent.VK_DOWN){
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

    }
    public void mouseReleased(int m){

    }
}
