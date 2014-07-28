package com.bamgames.survivalatthedanceparty.manager;


import com.bamgames.survivalatthedanceparty.gamestates.MenuState;
import java.util.ArrayList;
import java.awt.*;

public class GameStateManager {
    private ArrayList<GameState> gameStates;
    private int currentState;
    private int MENUSTATE = 0;
    private int SETTINGSSTATE = 1;
    private int PAUSEDSSTATE = 2;
    private int GAMESTATE = 3;
    private int ABOUTSTATE = 4;

    public GameStateManager(){
        currentState = MENUSTATE;
        gameStates = new ArrayList<GameState>();
        gameStates.add(new MenuState(this));
    }
    public void changeState(int state){
        currentState = state;
        gameStates.get(currentState).initialize();
    }
    public void update(){
        gameStates.get(currentState).update();
    }
    public void render(Graphics2D g){
        gameStates.get(currentState).render(g);
    }
    public void keyPressed(int k){
        gameStates.get(currentState).keyPressed(k);
    }
    public void keyReleased(int k){
        gameStates.get(currentState).keyReleased(k);
    }
    public void mouseMoved(int x, int y){ gameStates.get(currentState).mouseMoved(x,y); }
    public void mousePressed(int m) { gameStates.get(currentState).mousePressed(m);}
    public void mouseReleased(int m) { gameStates.get(currentState).mouseReleased(m);}
}
