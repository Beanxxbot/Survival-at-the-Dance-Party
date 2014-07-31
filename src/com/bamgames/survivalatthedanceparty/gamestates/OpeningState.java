package com.bamgames.survivalatthedanceparty.gamestates;

import com.bamgames.survivalatthedanceparty.graphics.SplashScreen;

import java.awt.Graphics2D;

public class OpeningState {
    SplashScreen s;

    public OpeningState(){
        s = new SplashScreen("/BAMLogo.png");
    }
    public void render(Graphics2D g){
        s.render(g);
    }
}
