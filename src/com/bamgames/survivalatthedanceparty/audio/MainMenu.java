package com.bamgames.survivalatthedanceparty.audio;


import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainMenu implements Runnable{
    public void run(){
        try{
            InputStream music = getClass().getResourceAsStream(DJCOMPUTER());
            AdvancedPlayer player = new AdvancedPlayer(music);
            player.play();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String DJCOMPUTER(){
        String selection[] = {
        "/audio/10-10.mp3","/audio/fireball.mp3"
        };
        int random = (int) (Math.random() * 2);
        System.out.println(random);
        return selection[random];
    }
}
