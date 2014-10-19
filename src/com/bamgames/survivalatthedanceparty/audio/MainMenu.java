package com.bamgames.survivalatthedanceparty.audio;


import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainMenu implements Runnable{
    InputStream music;
    AdvancedPlayer player;
    public boolean running = true;
    public void run(){
        while(running) {
            try {
                music = getClass().getResourceAsStream(DJCOMPUTER());
                player = new AdvancedPlayer(music);
                player.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
    public String DJCOMPUTER(){
        String selection[] = {
                "/audio/10-10.mp3","/audio/fireball.mp3","/audio/greenhillzone.mp3"
        };
        int random = (int) (Math.random() * 3);
        return selection[random];
    }
    public void pause(){
         player.close();
    }
}
