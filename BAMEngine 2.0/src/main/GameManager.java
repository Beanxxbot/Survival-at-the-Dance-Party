package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/13/2015.
 */
public class GameManager extends JPanel implements Runnable, KeyListener{
    private boolean running;
    private int FPS = 40;
    public static Thread Primary;
    public int GSM;
    private BufferedImage paintbrush;
    private Graphics2D g;

    public void initialize() {
        running = true;
        GSM = 0;
    }

    public void run() {
        initialize();
        long start;
        long completed;
        long wait;
        while (running) {
            start = System.nanoTime();
            switch(GSM){
                case 0:
                    //Splash Screen
                    break;
                case 1:
                    //Main Menu
                    break;
                case 2:
                    //Settings Menu
                    break;
                case 3:
                    //Credits Menu
                    break;
                case 4:
                    //Intro Level
                    break;
                case 5:
                    //1st Level
                    break;
                default:
                    System.out.println("GSM ERROR");
            }
            drawToScreen();
            completed = System.nanoTime() - start;
            wait = (1000 / FPS) - (completed / 1000000);
            try{
                Primary.sleep(wait);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void drawToScreen(){
        //global main paintbrush image
        //draws all graphics
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}