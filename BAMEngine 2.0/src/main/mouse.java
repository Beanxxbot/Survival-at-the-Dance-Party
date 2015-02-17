package main;

import pregame.mainmenu;

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
    public mouse(){

    }

    public void update(GameManager GM){
        GSM = GM.GSM;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //System.out.println("X:" + e.getX());
        //System.out.println("Y:" + e.getY());
        x = e.getX();
        y = e.getY();
    }
}

