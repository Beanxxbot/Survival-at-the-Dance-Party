package com.bamgames.survivalatthedanceparty.gamestates;

import java.awt.*;

public interface StateBlueprint {
    public void render(Graphics2D g);
    public void update();
    public void keyPressed(int k);
    public void keyReleased(int k);
}
