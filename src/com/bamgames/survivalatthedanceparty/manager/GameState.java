package com.bamgames.survivalatthedanceparty.manager;


import java.awt.*;

public abstract class GameState{
    protected GameStateManager gsm;

    public abstract void initialize();
    public abstract void update();
    public abstract void render(Graphics2D g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);
    public abstract void mousePressed(int m);
    public abstract void mouseReleased(int m);
    public abstract void mouseMoved(int x, int y);
}
