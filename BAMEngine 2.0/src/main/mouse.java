package main;

import game.IntroLevel;
import pregame.about;
import pregame.mainmenu;
import pregame.resolution;
import pregame.settings;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by James on 2/14/2015.
 */
public class mouse implements MouseListener, MouseMotionListener {
    private int GSM;
    private int x;
    private int y;
    private int x2;
    private int y2;
    private mainmenu mm;
    private about a;
    private settings s;
    private resolution r;
    private IntroLevel l;

    public mouse(){

    }

    public void update(GameManager GM){
        GSM = GM.GSM;
        mm = GM.mm;
        a = GM.ab;
        s = GM.s;
        r = GM.r;
        l = GM.l;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch(GSM) {
            case 0:

                break;
            case 1:
                mm.mousePressed();
                break;
            case 2:
                s.mousePressed();
                break;
            case 3:
                a.mousePressed();
                break;
            case 4:
                l.mousePressed();
                break;
            case 5:
                r.mousePressed();
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        switch(GSM){
            case 2:
                s.mouseDragged(x2,y2);
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("X:" + e.getX());
        System.out.println("Y:" + e.getY());
        x = e.getX();
        y = e.getY();
        switch(GSM){
            case 0:

                break;
            case 1:
                mm.mouseMoved(x,y);
                break;
            case 2:
                s.mouseMoved(x,y);
                break;
            case 3:
                a.mouseMoved(x,y);
                break;
            case 4:
                l.mouseMoved(x,y);
                break;
            case 5:
                r.mouseMoved(x,y);
                break;
        }
        }
    }


