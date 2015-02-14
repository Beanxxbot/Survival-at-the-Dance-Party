package main;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by James on 2/13/2015.
 */
public class GameManager extends JPanel implements Runnable, KeyListener {
    private boolean running;
    private int FPS = 40;
    public static Thread Primary;
    public int GSM;

    public void initialize() {
        running = true;
    }

    public void run() {
        initialize();
        long start;
        long completed;
        long wait;
        while (running) {
            start = System.nanoTime();

            completed = System.nanoTime() - start;
            wait = (1000 / FPS) - (completed / 1000000);
            try{
                Primary.sleep(wait);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
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