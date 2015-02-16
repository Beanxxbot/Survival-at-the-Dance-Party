package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

/**
 * Created by James on 2/13/2015.
 */
public class SADPMain{
    public static void main(String args[]) {
        JFrame window = new JFrame("Survival at the Dance Party");
        mouse m = new mouse();
        keyInput k = new keyInput();
        GameManager GM = new GameManager(m,k);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(GM);
        window.setPreferredSize(new Dimension(1366,768));
        window.pack();
        window.setResizable(false);
        beginThread(GM,m,k);
        window.setVisible(true);
    }
    public static void beginThread(GameManager GM, mouse m, keyInput k){
        GM.Primary = new Thread(GM);
        GM.addKeyListener(k);
        //POSSIBLY REQUIRES CUSTOM MOUSE ENGINE
        GM.addMouseListener(m);
        GM.addMouseMotionListener(m);
        GM.Primary.start();
    }
}