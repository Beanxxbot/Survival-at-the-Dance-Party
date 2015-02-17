package main;

import audio.audiosystem;
import pregame.about;
import pregame.mainmenu;
import pregame.splashscreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/13/2015.
 */
public class GameManager extends JPanel implements Runnable {
    private boolean running;
    private int FPS = 40;
    public static Thread Primary;
    public static int GSM;
    private BufferedImage paintbrush;
    private Graphics2D g;
    splashscreen ss;
    audiosystem a;
    mainmenu mm;
    about ab;
    int count;
    mouse m;
    keyInput I;
    Thread audio;
    int GSMA;
    int GSMG;

    public GameManager(mouse M,keyInput Q){
        setFocusable(true);
        requestFocus();
        m = M;
        I = Q;
    }

    public void initialize() {
        running = true;
        GSM = 0;
        GSMG = 0;
        GSMA = 1;
        paintbrush = new BufferedImage(1366, 768, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) paintbrush.getGraphics();
        ss = new splashscreen();
        mm = new mainmenu();
        ab = new about();
        a = new audiosystem();
        audio = new Thread(a);
        audio.start();
    }

    public void run() {
        initialize();
        long start;
        long completed;
        long wait;
        while (running) {
            start = System.nanoTime();
            repaint();
            I.update(this);
            m.update(this);
            switch (GSM) {
                case 0:
                    audiomanager();
                    ss.update(this);
                    ss.render(g);
                    count++;
                    if (count >= 100) {
                        GSM = 1;
                        GSMG = 1;
                    }
                    break;
                case 1:
                    mm.update(this);
                    mm.render(g);
                    break;
                case 2:
                    //Settings Menu
                    break;
                case 3:
                    ab.update(this);
                    ab.render(g);
                    break;
                case 4:
                    //Intro Level
                    break;
                case 5:
                    audiomanager();
                    break;
                default:
                    System.out.println("GSM ERROR");
                    break;
            }
            drawToScreen();
            completed = System.nanoTime() - start;
            wait = (1000 / FPS) - (completed / 1000000);
            try {
                Primary.sleep(wait);
            } catch (Exception e) {
                wait = wait * -2;
                try {
                    Primary.sleep(wait);
                } catch (Exception q) {
                    q.printStackTrace();
                }
            }
        }
    }

    public void repaint(){
        if(GSMG != GSM){
            GSMG = GSM;
            super.paintComponent(g);
        }
    }
    public void audiomanager(){
            if (GSMA != GSM) {
                GSMA = GSM;
                switch (GSMA) {
                    case 0:
                        a.start("/audio/electricfeel.mp3");
                        break;
                    case 5:
                        a.stop();
                        a.start("/audio/greenhillzone.mp3");
                        break;
                }
            }
    }
    public void drawToScreen() {
        Graphics d = getGraphics();
        d.drawImage(paintbrush, 0, 0, 1366, 768, null);
        d.dispose();
    }
}