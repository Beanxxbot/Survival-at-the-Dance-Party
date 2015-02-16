package main;

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
    mainmenu mm;
    int count;
    mouse m;
    keyInput I;

    public GameManager(mouse M,keyInput Q){
        setFocusable(true);
        requestFocus();
        m = M;
        I = Q;
    }

    public void initialize() {
        running = true;
        GSM = 0;
        paintbrush = new BufferedImage(1366, 768, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) paintbrush.getGraphics();
        ss = new splashscreen();
        mm = new mainmenu();
        ss.initialize();
        mm.initialize();
    }

    public void run() {
        initialize();
        long start;
        long completed;
        long wait;
        while (running) {
            start = System.nanoTime();
            I.update(this);
            m.update(this);
            switch (GSM) {
                case 0:
                    ss.update(this);
                    ss.render(g);
                    count++;
                    if (count >= 100) {
                        GSM = 1;
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

    public void drawToScreen() {
        Graphics d = getGraphics();
        d.drawImage(paintbrush, 0, 0, 1366, 768, null);
        d.dispose();
    }
}