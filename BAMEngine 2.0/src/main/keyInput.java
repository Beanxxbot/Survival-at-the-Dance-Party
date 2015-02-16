package main;

import pregame.mainmenu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by James on 2/15/2015.
 */
public class keyInput implements KeyListener{
    private int GSM;
    private mainmenu mm;
    public keyInput(){

    }

    public void update(GameManager GM){
        GSM = GM.GSM;
        mm = GM.mm;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(GSM){
            case 0:

                break;
            case 1:
                System.out.println("eh");
                mm.keyPressed(e.getKeyCode());
                break;
            default:
                System.out.println("KeyPressed Error FROM KEYINPUTS");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
