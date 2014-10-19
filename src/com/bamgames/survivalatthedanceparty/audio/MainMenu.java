package com.bamgames.survivalatthedanceparty.audio;


import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainMenu implements Runnable{
    InputStream music;
    public static AdvancedPlayer player;
    public void run(){
            try {
                music = getClass().getResourceAsStream(DJCOMPUTER());
                player = new AdvancedPlayer(music);
                player.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    public String DJCOMPUTER(){
        String selection[] = {
        "/audio/10-10.mp3","/audio/fireball.mp3","/audio/greenhillzone.mp3"
        };
        int random = (int) (Math.random() * 3);
        System.out.println(random);
        return selection[random];
    }
    public static void pause(){
    player.close();
    }
}
