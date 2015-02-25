package game;

import database.MImageData;
import interfaces.levelint;
import main.GameManager;
import player.Player;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by James on 2/21/2015.
 */
public class IntroLevel implements levelint {
    Player p;
    boolean isPaused;
    public IntroLevel(){
        p = new Player();
        p.draw = true;
        p.setBoundaries(1316,718,0,0);
        p.playerSetup(0,330);
    }
    @Override
    public void update(GameManager GM) {
        if(isPaused == true){
            GM.pGSM = GM.GSM;
            GM.GSM = 6;
            isPaused = false;
        }
    }

    @Override
    public void render(Graphics2D g, MImageData m) {
        g.setColor(Color.decode("#661400"));
        g.fillRect(0, 0, 1366,768);
        g.setColor(Color.RED);
        g.fillRect(0,380,1366,20);
        g.drawImage(m.getImage(0),1000,310,50,70,null);
        p.drawPlayer(g);
        g.drawImage(m.getImage(1), 900, 100, 30, 26,null);
    }

    @Override
    public void getInventory() {
        //NOT IMPLEMENTED YET
    }

    @Override
    public void mouseMoved(int x, int y) {

    }

    @Override
    public void mousePressed() {

    }

    @Override
    public void keyPressed(int k){
        p.checkMove(k);
        if(k == KeyEvent.VK_ESCAPE){
            isPaused = true;
        }
    }

    @Override
    public void keyReleased(int k){
        p.checkStop(k);
    }
}
