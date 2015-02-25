package game;

import database.MImageData;
import database.PGImageData;
import main.GameManager;
import pregame.*;

import java.awt.*;

/**
 * Created by James on 2/24/2015.
 */
public class PausedState {
    String[] menu = {
            "Continue","Settings","Main Menu"
    };
    int selected;
    int choose;
    public PausedState(){

    }
    public void update(GameManager GM, MImageData m){
        switch (choose){
            case 1:
                GM.GSM = GM.pGSM;
                choose = 0;
                break;
            case 2:
                GM.GSM = 2;
                choose = 0;
                break;
            case 3:
                GM.hasReturned = true;
                GM.pGSM = 6;
                GM.GSM = 1;
                choose = 0;
                break;
        }
    }
    public void render(Graphics2D g){
        g.setColor(Color.decode("#9c008f"));
        g.fillRect(0, 0, 1376, 768);
        g.setFont(new Font("Aharoni", Font.ITALIC, 75));
        g.setColor(Color.decode("#00bbff"));
        g.drawString("Survival at the Dance Party",25,75);
        g.setFont(new Font("Aharoni", Font.PLAIN, 50));
        switch(selected) {
            case 0:
                g.setColor(Color.GRAY);
                g.drawString(menu[0], 25, 175);
                g.setColor(Color.decode("#00bbff"));
                g.drawString(menu[1], 25, 250);
                g.drawString(menu[2], 25, 325);
                break;
            case 1:
                g.drawString(menu[0], 25, 175);
                g.setColor(Color.GRAY);
                g.drawString(menu[1], 25, 250);
                g.setColor(Color.decode("#00bbff"));
                g.drawString(menu[2], 25, 325);
                break;
            case 2:
                g.drawString(menu[0], 25, 175);
                g.drawString(menu[1], 25, 250);
                g.setColor(Color.GRAY);
                g.drawString(menu[2], 25, 325);
                break;
        }
    }
    public void mouseMoved(int x,int y){
        //29,139
        if(x >= 29 && y >= 139 && x <= 230 && y <= 170){
            selected = 0;
        }else if(x >= 29 && y >= 210 && x <= 212 && y <= 246){
            selected = 1;
        }else if(x >= 29 && y >= 288 && x <= 290 && y <= 321){
            selected = 2;
        }
    }
    public void mousePressed(){
        choose = selected + 1;
    }
}
