package com.bamgames.survivalatthedanceparty.levels;

import com.bamgames.survivalatthedanceparty.gamestates.GameState;
import com.bamgames.survivalatthedanceparty.graphics.Player;

import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class IntroLevel implements LevelBlueprint{
    BufferedImage image;
    boolean shouldEnter;
    GameState gs;
    public IntroLevel(String door,String doorg){
        try{
            image = ImageIO.read(getClass().getResourceAsStream(door));
        }catch(Exception e){
            e.printStackTrace();
        }
        shouldEnter = false;
    }
    public void keyReleased(int k){

    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_ENTER && shouldEnter == true){
        gs.changeState(1);
        }
    }

    public void getInventory(){

    }
    public void update(Player p){
    if(p.locationx >= 500 && p.locationx <= 550){
        shouldEnter = true;
    }
    if(p.locationx <= 0){
        p.locationx = 0;
    }else if(p.locationx >= 650){
        p.locationx = 650;
    }
    }
    public void render(Graphics2D g){
        g.drawImage(image,500,130,50,70,null);
        //Draw Door Guard Graphics
        //Draw Jump Graphics
    }
}
