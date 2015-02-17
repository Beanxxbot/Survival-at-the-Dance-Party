package audio;

import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.InputStream;

/**
 * Created by James on 2/16/2015.
 */

public class audiosystem implements Runnable {
    AdvancedPlayer player;
    String audio;
    boolean shouldStart;
    boolean running = true;
    public void run() {
        while (running) {
            if (shouldStart) {
                shouldStart = false;
                begin();
            }
        }
    }
    public void start(String path){
        audio = path;
        shouldStart = true;
    }
    public void stop(){
        player.close();
    }
    public void begin() {
        try {
            System.out.println("audio");
            InputStream input = getClass().getResourceAsStream(audio);
            player = new AdvancedPlayer(input);
            player.play();
        } catch (Exception e) {
            System.out.println("System Error");
            e.printStackTrace();
        }
    }
}
