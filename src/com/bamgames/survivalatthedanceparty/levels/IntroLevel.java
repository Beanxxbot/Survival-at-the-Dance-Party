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
    public IntroLevel(String s){
        try{
            image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
        shouldEnter = false;
    }
    public void keyReleased(int k){

    }
    public void keyPressed(int k){
        if(k == KeyEvent.VK_ENTER && shouldEnter == true){
            System.out.println("swag");
        }
        System.out.println(k);
        System.out.println(shouldEnter);
    }

    public void update(Player p){
    if(p.locationx >= 500 && p.locationx <= 550){
        shouldEnter = true;
    }
    }
    public void render(Graphics2D g){
        g.drawImage(image,500,130,50,70,null);
        //Draw Door Guard Graphics
        //Draw Jump Graphics
    }
}
