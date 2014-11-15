package com.bamgames.survivalatthedanceparty.audio;


import com.bamgames.survivalatthedanceparty.main.GamePanel;
import  javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.InputStream;

public class MainMenu implements Runnable{
    InputStream music;
    AdvancedPlayer player;
    public boolean running = true;
    GamePanel GP;
    public void run(){
        while(running) {
            try {
                music = getClass().getResourceAsStream(select());
                player = new AdvancedPlayer(music);
                player.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
    public String select(){
        String pathmusic = null;
        if(GP.GSM == 3){
            pathmusic = "/audio/intro.mp3";
        }else{
            String selection[] = {
                    "/audio/10-10.mp3", "/audio/fireball.mp3", "/audio/greenhillzone.mp3"
            };
            int random = (int) (Math.random() * 3);
            pathmusic = selection[random];
        }
        System.out.println(GP.GSM);
        return pathmusic;
    }
    public void pause(){
        player.close();
    }
}
