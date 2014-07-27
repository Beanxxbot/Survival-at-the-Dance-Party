package com.bamgames.survivalatthedanceparty.main;

import com.bamgames.survivalatthedanceparty.gamestates.MenuState;
import com.bamgames.survivalatthedanceparty.manager.GameStateManager;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements Runnable, KeyListener, MouseListener{
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

    //Mouse Position
    int x;
    int y;

    //Reference to Game State Manager
    GameStateManager gsm;

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
        thread.start();
    }
    private void initialize(){
        paintbrush = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) paintbrush.getGraphics();
        gsm = new GameStateManager();
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
            System.out.println(sleepTime);
            try{
                thread.sleep(sleepTime);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void mousePosition(){

    }
    private void gameUpdate(){
        gsm.update();
    }
    private void gameRender(){
        gsm.render(g);
    }
    private void draw(){
       Graphics d = getGraphics();
       d.drawImage(paintbrush, 0, 0, width * scale, height * scale, null);
       d.dispose();
    }
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {
        gsm.keyPressed(e.getKeyCode());
    }
    public void keyReleased(KeyEvent e) {
        gsm.keyReleased(e.getKeyCode());
    }
    public void mouseClicked(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e) {
        gsm.mousePressed(e.getButton());
    }
    public void mouseReleased(MouseEvent e) {
        gsm.mouseReleased(e.getButton());
    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {

    }
}
