package main;

import pregame.about;
import pregame.mainmenu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by James on 2/15/2015.
 */
public class keyInput implements KeyListener{
    private int GSM;
    private mainmenu mm;
    private about a;
    public keyInput(){

    }

    public void update(GameManager GM){
        GSM = GM.GSM;
        mm = GM.mm;
        a = GM.ab;
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
                mm.keyPressed(e.getKeyCode());
                break;
            case 2:

                break;
            case 3:
                a.keyPressed(e.getKeyCode());
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
