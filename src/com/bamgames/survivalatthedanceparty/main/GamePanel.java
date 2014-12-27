package com.bamgames.survivalatthedanceparty.main;

import com.bamgames.survivalatthedanceparty.audio.MainMenu;
import com.bamgames.survivalatthedanceparty.gamestates.*;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
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
    public Thread thread2;
    public static int music = 0;

    //Temporary
    private boolean running = true;
    //
    //Temporary
    private int targetFPS = 40;
    //
    private int targetTime = 1000 / targetFPS;

    //Graphics
    private BufferedImage paintbrush;
    private Graphics2D g;
    public static boolean shouldRepaint;

    //Mouse Position
    int x;
    int y;

    //Initialize game after splash screen
    int count;

    //GameManager
    public static int GSM;

    //References to States of Game
    MenuState m;
    AboutState a;
    SettingsState s;
    GameState gs;
    OpeningState o;
    Paused p;
    MainMenu mm;

    boolean mouseState;

    boolean runmusic;

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
        addMouseMotionListener(this);
        addMouseListener(this);
        thread.start();
    }
    public void shouldMute() {
        mm.pause();
        mm.running = false;
    }
    private void initialize(){
        m = new MenuState();
        a = new AboutState();
        s = new SettingsState();
        o = new OpeningState();
        p = new Paused();
        gs = new GameState();
        mm = new MainMenu();

        runmusic = true;

        thread2 = new Thread(mm);
        thread2.start();

        paintbrush = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) paintbrush.getGraphics();
        GSM = 4;
    }
    public void run(){
        initialize();
        long start;
        long completed;
        long sleepTime;

        while(running){
            start = System.nanoTime();
            clearCheck();
            switch(GSM){
                case 0:
                    m.update();
                    m.render(g);
                    runmusic = true;
                    break;
                case 1:
                    a.update();
                    a.render(g);
                    runmusic = true;
                    break;
                case 2:
                    s.update();
                    s.render(g);
                    runmusic = true;
                    break;
                case 3:
                    if(runmusic == true){
                        mm.pause();
                       runmusic = false;
                    }
                    gs.update();
                    gs.render(g);
                    break;
                case 4:
                    o.render(g);
                    if(count >= 75) {
                        GSM = 0;
                    }else{
                        count++;
                    }
                    break;
                case 5:
                    runmusic = true;
                    p.render(g);
                    mm.pause();
                    break;
                default:
                    System.out.println("Main GSM Error");
                    break;
            }
            draw();
            completed = System.nanoTime() - start;
            sleepTime = targetTime - completed / 1000000;
            if(sleepTime <= 0){
                sleepTime = 10;
            }
            try{
                thread.sleep(sleepTime);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void clearCheck(){
        if(shouldRepaint){
        super.paintComponent(g);
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
            case 2:
                s.keyPressed(e.getKeyCode());
                break;
            case 3:
                gs.keyPressed(e.getKeyCode());
                break;
            case 4:
                break;
            case 5:
                p.keyPressed(e.getKeyCode());
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
            case 2:
                break;
            case 3:
            gs.keyReleased(e.getKeyCode());
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("keyReleased GSM Error");
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseState = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseState = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        switch(GSM) {
            case 2:
                s.mouseMoved(e.getX(),e.getY(),mouseState);
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
