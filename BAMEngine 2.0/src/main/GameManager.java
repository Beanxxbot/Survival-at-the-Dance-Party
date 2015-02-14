package main;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by James on 2/13/2015.
 */
public class GameManager extends JPanel implements Runnable {
    private boolean running;
    private int FPS = 40;
    public static Thread Primary;

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
            System.out.println("dang");
            completed = System.nanoTime() - start;
            wait = (1000 * FPS) - (completed / 1000000);
            System.out.println(wait);
            try{
                Primary.sleep(wait);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}