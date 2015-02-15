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
        GameManager GM = new GameManager();
        mouse m = new mouse();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(GM);
        window.setPreferredSize(new Dimension(1750,1250));
        window.pack();
        beginThread(GM,m);
        window.setVisible(true);
    }
    public static void beginThread(GameManager GM, mouse m){
        GM.Primary = new Thread(GM);
        GM.addKeyListener(GM);
        //POSSIBLY REQUIRES CUSTOM MOUSE ENGINE
        GM.addMouseListener(m);
        GM.addMouseMotionListener(m);
        GM.Primary.start();
    }
}