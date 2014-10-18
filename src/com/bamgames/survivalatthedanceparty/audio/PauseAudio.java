package com.bamgames.survivalatthedanceparty.audio;

import com.bamgames.survivalatthedanceparty.gamestates.MenuState;

/**
 * Created by James Hulsizer on 10/17/2014.
 */
public class PauseAudio implements Runnable{
    static boolean shouldPause;
    @Override
    public void run() {
        while(shouldPause == false){
            try{
                MenuState.pausethread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        stopSound();
        try{
            MenuState.pausethread.sleep(100);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void stopSound(){
        MainMenu.player.close();
        shouldPause = true;
        System.out.println("Executed");
    }
    public static void pause(boolean p){
        shouldPause = p;
    }
}
