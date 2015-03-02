package game;

import database.MImageData;
import interfaces.levelint;
import main.GameManager;
import player.Player;
import dialog.Dialog;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by James on 2/21/2015.
 */
public class IntroLevel implements levelint {
    Player p;
    Dialog d;
    boolean isPaused;
    boolean notDone;
    public IntroLevel(){
        p = new Player();
        d = new Dialog();
        d.numChar = 2;
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
        if(notDone == false){

        }else if(d.dState == d.dState % 2){
            d.speakers[1] = "Door Guard";
            d.updateProf("/textures/doorguard/DoorGuard.png");
        }else if(d.dState == d.dState){
            d.speakers[2] = "Player";
            d.updateProf("/textures/profile/defaultprof.png");
        }
    }

    @Override
    public void render(Graphics2D g, MImageData m) {
        g.setColor(Color.decode("#661400"));
        g.fillRect(0, 0, 1366,768);
        g.setColor(Color.RED);
        g.fillRect(0,581,1366,20);
        g.drawImage(m.getImage(0),1000,310,125,175,null);
        p.drawPlayer(g);
        g.drawImage(m.getImage(1), 900, 100, 60, 52,null);
        d.render(g,m);
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
        }else if(k == KeyEvent.VK_ENTER){
            d.changeDialog();
        }
    }

    @Override
    public void keyReleased(int k){
        p.checkStop(k);
    }
}
