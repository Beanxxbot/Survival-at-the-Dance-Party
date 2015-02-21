package pregame;

import main.GameManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/19/2015.
 */
public class resolution {
        BufferedImage back;
    boolean isSelected;
    boolean goBack;
    public resolution(){
        try{
            back = ImageIO.read(getClass().getResourceAsStream("/menutextures/back.png"));
        }catch(Exception e){

        }
    }
    public void update(GameManager GM){
        if(goBack){
            GM.GSM = 2;
            goBack = false;
        }
    }
    public void render(Graphics2D g){
        g.setColor(Color.decode("#00bbff"));
        g.fillRect(0, 0, 1366, 768);
        g.setColor(Color.decode("#9c008f"));
        g.setFont(new Font("aharoni",Font.BOLD,80));
        g.drawString("SUPPORTED RESOLUTIONS:",50,100);
        g.setColor(Color.yellow);
        g.setFont(new Font("aharoni",Font.PLAIN,50));
        g.drawString("1366 x 768",75,150);
        if(isSelected){
            g.drawImage(back.getSubimage(0,0,245,100),1116,628,225,100,null);
        }else{
            g.drawImage(back.getSubimage(245,0,245,100),1116,628,225,100,null);
        }
    }
    public void mouseMoved(int x,int y){
    if(x >= 1112 && y >= 639 && x <= 1350 && y <= 702){
        isSelected = true;
    }else{
        isSelected = false;
    }
    }
    public void mousePressed(){
        if(isSelected){
            goBack = true;
        }
    }
}
