package interfaces;

import database.MImageData;
import main.GameManager;

import java.awt.*;

/**
 * Created by James on 2/15/2015.
 */
public interface levelint {
    public void update(GameManager GM);
    public void render(Graphics2D g, MImageData m);
    public void getInventory();
    public void mouseMoved(int x,int y);
    public void mousePressed();
    public void keyPressed(int k);
    public void keyReleased(int k);
}
