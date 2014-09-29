package com.bamgames.survivalatthedanceparty.levels;

import  java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import com.bamgames.survivalatthedanceparty.graphics.Player;
import com.bamgames.survivalatthedanceparty.gamestates.GameState;

import javax.imageio.ImageIO;


public class IntroLevel {
    private BufferedImage image;
    private GameState gs;
    public IntroLevel(String s){
        try{
            image = ImageIO.read(getClass().getResourceAsStream(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(Player p){
    if(p.locationx >= 500 && p.locationx <= 550){
        if(gs.keySharing == KeyEvent.VK_ENTER){
            System.out.println("hello world!");
        }
    }
    }
    public void render(Graphics2D g){
        g.drawImage(image,500,130,50,70,null);
        //Draw Door Guard Graphics
        //Draw Jump Graphics
    }
}
