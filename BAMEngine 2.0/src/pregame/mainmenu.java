package pregame;

import main.GameManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/15/2015.
 */
public class mainmenu {
    BufferedImage background;
    BufferedImage title;
    BufferedImage[] menulist;
    private int selector;
    int substate;

    public mainmenu(){
        menulist = new BufferedImage[4];
        try{
            background = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/discoball.jpg"));
            title = ImageIO.read(getClass().getResourceAsStream("/menutextures/Gaemtit.png"));
            menulist[0] = ImageIO.read(getClass().getResourceAsStream("/menutextures/start.png"));
            menulist[1] = ImageIO.read(getClass().getResourceAsStream("/menutextures/settings.png"));
            menulist[2] = ImageIO.read(getClass().getResourceAsStream("/menutextures/about.png"));
            menulist[3] = ImageIO.read(getClass().getResourceAsStream("/menutextures/quit.png"));
        }catch(Exception e){
            System.out.println("Background Main Menu Error");
            e.printStackTrace();
        }
    }
    public void update(GameManager GM){
        if(substate == 1){
            GM.GSM = 5;
            substate = 0;
        }else if(substate == 2){
            GM.GSM = 2;
            substate = 0;
        }else if(substate == 3){
            GM.GSM = 3;
            substate = 0;
        }else if(substate == 4){
            System.exit(0);
        }
    }
    public void render(Graphics2D g) {
        g.drawImage(background, -100, 0, 1366, 768, null);
        g.setColor(Color.BLACK);
        g.fillRect(1266,0,100,768);
        g.drawImage(title,250,50,550,250,null);
        switch(selector) {
            case 0:
            g.drawImage(menulist[0].getSubimage(250, 0, 250, 100), 950, 250, 189, 75, null);
            g.drawImage(menulist[1].getSubimage(0, 0, 400, 100), 950, 380, 300, 75, null);
            g.drawImage(menulist[2].getSubimage(0, 0, 300, 100), 950, 510, 225, 75, null);
            g.drawImage(menulist[3].getSubimage(0, 0, 212, 100), 950, 630, 159, 75, null);
                break;
            case 1:
                g.drawImage(menulist[0].getSubimage(0, 0, 250, 100), 950, 250, 189, 75, null);
                g.drawImage(menulist[1].getSubimage(400, 0, 400, 100), 950, 380, 300, 75, null);
                g.drawImage(menulist[2].getSubimage(0, 0, 300, 100), 950, 510, 225, 75, null);
                g.drawImage(menulist[3].getSubimage(0, 0, 212, 100), 950, 630, 159, 75, null);
                break;
            case 2:
                g.drawImage(menulist[0].getSubimage(0, 0, 250, 100), 950, 250, 189, 75, null);
                g.drawImage(menulist[1].getSubimage(0, 0, 400, 100), 950, 380, 300, 75, null);
                g.drawImage(menulist[2].getSubimage(300, 0, 300, 100), 950, 510, 225, 75, null);
                g.drawImage(menulist[3].getSubimage(0, 0, 212, 100), 950, 630, 159, 75, null);
                break;
            case 3:
                g.drawImage(menulist[0].getSubimage(0, 0, 250, 100), 950, 250, 189, 75, null);
                g.drawImage(menulist[1].getSubimage(0, 0, 400, 100), 950, 380, 300, 75, null);
                g.drawImage(menulist[2].getSubimage(0, 0, 300, 100), 950, 510, 225, 75, null);
                g.drawImage(menulist[3].getSubimage(212, 0, 212, 100), 950, 630, 159, 75, null);
                break;
        }

    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_S){
            selector++;
            if(selector > 3){
                selector = 3;
            }
        }else if(k == KeyEvent.VK_W){
            selector--;
            if(selector < 0){
                selector = 0;
            }
        }
        if(k == KeyEvent.VK_ENTER){
            substate = selector + 1;
            if(substate > 4){
                substate = 4;
            }
        }
    }

}
