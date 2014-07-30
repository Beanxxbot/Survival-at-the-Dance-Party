package com.bamgames.survivalatthedanceparty.main;

import com.bamgames.survivalatthedanceparty.gamestates.AboutState;
import com.bamgames.survivalatthedanceparty.gamestates.MenuState;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{
    //Measurements
    //Will be adjusted
    public static final int width = 700;
    //
    //Will be adjusted
    public static final int height = 400;
    //
    public static final int scale = 2;

    //Primary game function variables
    private Thread thread;
    //Temporary
    private boolean running = true;
    //
    //Temporary
    private int targetFPS = 30;
    //
    private int targetTime = 1000 / targetFPS;

    //Graphics
    private BufferedImage paintbrush;
    private Graphics2D g;
    public static boolean shouldRepaint;

    //Mouse Position
    int x;
    int y;

    //GameManager
    public static int GSM;

    //References to States of Game
    MenuState m;
    AboutState a;

    public GamePanel(){
        getPosition();

        //Temporary
        setPreferredSize(new Dimension(width * scale,height * scale));

        setFocusable(true);
        requestFocus();
    }
    private void getPosition(){
        //WILL BE EDITED LATER
    }
    public void addNotify(){
        super.addNotify();
        thread = new Thread(this);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        thread.start();
    }
    private void initialize(){
        m = new MenuState();
        a = new AboutState();
        paintbrush = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) paintbrush.getGraphics();
        GSM = 0;
    }
    public void run(){
        initialize();
        long start;
        long completed;
        long sleepTime;

        while(running){
            start = System.nanoTime();
            gameUpdate();
            gameRender();
            draw();
            completed = System.nanoTime() - start;
            sleepTime = targetTime - completed / 1000000;
            if(sleepTime <= -1){
                sleepTime = 0;
                sleepTime = targetTime - completed / 100000;
            }
            try{
                thread.sleep(sleepTime);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    private void gameUpdate(){
        switch (GSM) {
            case 0:
            m.update();
                break;
            case 1:
            a.update();
                break;
            default:
                System.out.println("Game Update GSM Error");
        }
        if(shouldRepaint){
            super.paintComponent(g);
            shouldRepaint = false;
        }
    }
    private void gameRender(){
        switch (GSM) {
            case 0:
            m.render(g);
                break;
            case 1:
                a.render(g);
                break;
            default:
                System.out.println("Game Render GSM Error");
                break;
        }
    }
    private void draw(){
       Graphics d = getGraphics();
       d.drawImage(paintbrush, 0, 0, width * scale, height * scale, null);
       d.dispose();
    }
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {
        switch (GSM) {
            case 0:
            m.keyPressed(e.getKeyCode());
                break;
            case 1:
                a.keyPressed(e.getKeyCode());
                break;
            default:
            System.out.println("keyPressed GSM Error");
                break;
        }
    }
    public void keyReleased(KeyEvent e) {
        switch (GSM) {
            case 0:
            m.keyReleased(e.getKeyCode());
                break;
            case 1:
            a.keyReleased(e.getKeyCode());
                break;
            default:
                System.out.println("keyReleased GSM Error");
                break;
        }
    }
    public void mouseClicked(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e) {
        switch(GSM) {
            case 0:
                m.mousePressed(e.getClickCount());
                break;
            case 1:
                a.mousePressed(e.getClickCount());
                break;
            default:
                System.out.println("mousePressed GSM Error");
                break;
        }
    }
    public void mouseReleased(MouseEvent e) {
        switch(GSM) {
            case 0:
            m.mouseReleased(e.getClickCount());
                break;
            case 1:
                a.mouseReleased(e.getClickCount());
                break;
            default:
                System.out.println("mouseReleased GSM Error");
                break;
        }
    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {

    }
    public void mouseDragged(MouseEvent e) {

    }
    public void mouseMoved(MouseEvent e) {
       switch(GSM){
           case 0:
           m.mouseMoved(e.getXOnScreen(),e.getYOnScreen());
               break;
           case 1:
           a.mouseMoved(e.getXOnScreen(),e.getYOnScreen());
               break;
           default:
               System.out.println("Mouse Moved GSM Error");
               break;
           }
       }
    }
