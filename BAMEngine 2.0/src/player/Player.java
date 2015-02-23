package player;

import javax.imageio.ImageIO;
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
    public boolean draw;
    public int mcode;
    int animation;
    public Player(){
        playerx = 0;
        playery = 0;
        draw = false;
        try{
            player = ImageIO.read(getClass().getResourceAsStream("/textures/player/player.png"));
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error retrieving player");
        }
    }
    public void playerSetup(int x,int y){
        playerx = x;
        playery = y;
        draw = false;
    }
    private void updatePlayer(int x,int y) {
        playerx += x;
        if(playerx >= right){
            playerx = right;
        }
        if(playerx <= left){
            playerx = left;
        }
        playery += y;
        if(playery <= top){
            playery = top;
        }
        if(playery >= bottom){
            playery = bottom;
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
    public void checkMove(int k) {
        if (k == KeyEvent.VK_W || k == KeyEvent.VK_D || k == KeyEvent.VK_A || k == KeyEvent.VK_SPACE) {
            draw = true;
            mcode = k;
        }else{
            draw = false;
        }
    }
    public void checkStop(int k){
        if (k == KeyEvent.VK_W || k == KeyEvent.VK_D || k == KeyEvent.VK_A || k == KeyEvent.VK_SPACE) {
            draw = false;
            mcode = 0;
        }
    }
    private void jump(int y){
        //playery = playery - y;
    }
    public void setBoundaries(int x, int y, int x2, int y2){
        top = y2;
        bottom = y;
        right = x;
        left = x2;
    }
    public void drawPlayer(Graphics2D g){
        if(draw){
            animation += 256;
            if(animation >= 768){
                animation = 0;
            }
        }else{
            animation = 0;
        }
        move(mcode);
        g.drawImage(player.getSubimage(0,animation,256,256),playerx,playery,50,50,null);
    }
}
