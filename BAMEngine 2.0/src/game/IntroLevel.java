package game;

import database.MImageData;
import interfaces.levelint;
import main.GameManager;
import player.Player;

import java.awt.*;

/**
 * Created by James on 2/21/2015.
 */
public class IntroLevel implements levelint {
    Player p;
    public IntroLevel(){
        p = new Player();
        p.setBoundaries(1366,768,0,0);
        p.playerSetup(0,380);
    }
    @Override
    public void update(GameManager GM) {

    }

    @Override
    public void render(Graphics2D g, MImageData m) {
        g.setColor(Color.RED);
        g.fillRect(0,380,1366,20);
        p.drawPlayer(g);
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
        p.move(k);
    }

    @Override
    public void keyReleased(int k){

    }
}
