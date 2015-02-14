package main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by James on 2/13/2015.
 */
public class SADPMain {
    public static void main(String args[]) {
        JFrame window = new JFrame("Survival at the Dance Party");
        GameManager GM = new GameManager();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(GM);
        window.setPreferredSize(new Dimension(1080,1020));
        window.pack();
        beginThreads(GM);
        window.setVisible(true);
    }
    public static void beginThreads(GameManager GM){
        GM.Primary = new Thread(GM);
        GM.Primary.start();
    }
}