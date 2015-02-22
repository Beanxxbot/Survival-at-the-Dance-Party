package player;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 * Created by James on 2/21/2015.
 */
public class Player {
    BufferedImage player;
    public volatile int playerx;
    public volatile int playery;
    int top;
    int bottom;
    int left;
    int right;
    public Player(){
        playerx = 0;
        playery = 0;
        try{
            //Load Player Image
        }catch(Exception e){
            //Catch
        }
    }
    public void playerSetup(int x,int y){
        playerx = x;
        playery = y;
    }
    private void updatePlayer(int x,int y) {
        playerx += x;
        playery += y;
        if(playerx >= right){
            playerx = right;
        }
        if(playery >= bottom){
            playery = bottom;
        }
        if(playerx <= left){
            playerx = left;
        }
        if(playery <= top){
            playery = top;
        }
    }
    public void move(int k){
        if(k == KeyEvent.VK_W){
            jump(20);
        }
        if(k == KeyEvent.VK_D){
            updatePlayer(4,0);
        }
        if(k == KeyEvent.VK_A){
            updatePlayer(-4,0);
        }
    }
    private void jump(int y){
        playery = playery - y;
    }
    public void setBoundaries(int x, int y, int x2, int y2){
        top = y2;
        bottom = y;
        right = x;
        left = x2;
    }
    public void drawPlayer(Graphics2D g){
        g.drawImage(player,playerx,playery,50,50,null);
    }
}
