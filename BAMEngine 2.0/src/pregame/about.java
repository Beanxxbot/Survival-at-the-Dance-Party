package pregame;

import main.GameManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/16/2015.
 */
public class about {
    boolean goBack;
    boolean selected;
    BufferedImage discoback;
    BufferedImage title;
    BufferedImage content;
    BufferedImage back;
    public about(){
        try{
            discoback = ImageIO.read(getClass().getResourceAsStream("/textures/objects/aboutdiscoman.png"));
            title = ImageIO.read(getClass().getResourceAsStream("/menutextures/about.png"));
            content = ImageIO.read(getClass().getResourceAsStream("/menutextures/abouttext.png"));
            back = ImageIO.read(getClass().getResourceAsStream("/menutextures/back.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(GameManager GM){
        if(goBack == true){
            GM.GSM = 1;
            goBack = false;
        }
    }
    public void render(Graphics2D g){
        g.setColor(Color.decode("#9c008f"));
        g.fillRect(0,0,1366,768);
        g.drawImage(discoback,0,50,324,600,null);
        g.drawImage(discoback,354,50,324,600,null);
        g.drawImage(title.getSubimage(300,0,300,100),694,25,300,100,null);
        g.drawImage(content,694,75,500,650,null);
        if(selected == false){
            g.drawImage(back.getSubimage(245,0,245,100),1116,628,225,100,null);
        }else{
            g.drawImage(back.getSubimage(0,0,245,100),1116,628,225,100,null);
        }

    }
    
    public void mouseMoved(int x,int y){
        if(x >= 1112 && y >= 639 && x <= 1350 && y <= 702){
            selected = true;
        }else{
            selected = false;
        }
        //1112,639 about 1350,702
    }
    public void mousePressed(){
        if(selected){
            goBack = true;
        }
    }
}
