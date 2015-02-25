package pregame;

import database.PGImageData;
import main.GameManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/17/2015.
 */
public class settings {
    int selected;
    int actions;
    float vol;
    int positionx = 1300;
    String convert;
    BufferedImage gear;
    BufferedImage discoball;

    public settings(){
        try {
            gear = ImageIO.read(getClass().getResourceAsStream("/menutextures/gear.png"));
            discoball = ImageIO.read(getClass().getResourceAsStream("/menutextures/discoball.png"));
        }catch(Exception e){
            System.out.println("Get Image Settings Error");
            e.printStackTrace();
        }
        int tvol = 100;
        convert = "" + tvol +"%";
        vol = 100;
    }
    public void update(GameManager GM){
        switch(actions){
            case 0:

                break;
            case 1:
                GM.GSM = 5;
                actions = 0;
                selected = 0;
                break;
            case 2:
                GM.GSM = GM.pGSM;
                actions = 0;
                selected = 0;
                break;
        }
    }
    public void render(Graphics2D g, PGImageData PGI){
        g.setColor(Color.decode("#00bbff"));
        g.fillRect(0,0,1366,768);
        g.drawImage(gear,50,50,640,638,null);
        g.drawImage(discoball,257,255,225,224,null);
        g.drawImage(PGI.getImage(0).getSubimage(0,0,400,100),750,25,400,100,null);
        g.setColor(Color.decode("#9c008f"));
        g.fillRect(750,175,600,100);
        g.setColor(Color.BLACK);
        g.fillRect(positionx,155,50,140);
        //50,140
        g.drawImage(PGI.getImage(1),750,295,215,50,null);
        g.setColor(Color.decode("#9c008f"));
        g.setFont(new Font("aharoni",Font.PLAIN,80));
        g.drawString(convert,970,340);
        if(selected == 1) {
            g.drawImage(PGI.getImage(2).getSubimage(550,0,550,100), 750, 390, 575, 100, null);
        }else {
            g.drawImage(PGI.getImage(2).getSubimage(0,0,550,100), 750,390,575,100,null);
        }
        if(selected == 2){
            g.drawImage(PGI.getImage(3).getSubimage(0, 0, 245, 100),1116,628,225,100,null);
        }else{
            g.drawImage(PGI.getImage(3).getSubimage(245,0,245,100),1116,628,225,100,null);
        }
    }
    public void mouseDragged(int x,int y){
        if(x >= 725 && x <= 1379 && y >= 155 && y <= 295) {
            positionx = x;
            if(positionx >= 1300){
                positionx = 1300;
            }
            if(positionx <= 750){
                positionx = 750;
            }
            vol = positionx - 750;
            System.out.println(vol);
            double mvol =  vol / 550 * 100;
            int mvol2 = (int)mvol;
            convert = "" + mvol2 + "%";
        }

        //1191
    }
    public void mouseMoved(int x,int y){
        if(x >= 754 && y >= 399 && x <= 1294 && y <= 465){
            selected = 1;
        }else if(x >= 1112 && y >= 639 && x <= 1350 && y <= 702){
            selected = 2;
        }else{
            selected = 0;
        }
        //754, 399 Resolution 1294,465
    }
    public void mousePressed(){
        switch(selected){
            case 0:

                break;
            case 1:
                actions = 1;
                break;
            case 2:
                actions = 2;
                break;
        }
    }
}
