package main;

import game.IntroLevel;
import pregame.about;
import pregame.mainmenu;
import pregame.settings;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by James on 2/15/2015.
 */
public class keyInput implements KeyListener{
    private int GSM;
    private IntroLevel l;
    public keyInput(){

    }

    public void update(GameManager GM){
        GSM = GM.GSM;
        l = GM.l;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(GSM){
            case 4:
                l.keyPressed(e.getKeyCode());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(GSM){
            case 4:
                l.keyPressed(e.getKeyCode());
                break;
        }
    }
}
