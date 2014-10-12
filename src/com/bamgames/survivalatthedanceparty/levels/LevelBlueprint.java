package com.bamgames.survivalatthedanceparty.levels;

import    java.awt.*;
import java.awt.image.BufferedImage;

import com.bamgames.survivalatthedanceparty.gamestates.StateBlueprint;
import com.bamgames.survivalatthedanceparty.graphics.Player;
import com.bamgames.survivalatthedanceparty.gamestates.GameState;

public interface LevelBlueprint{
public void render(Graphics2D g);
public void update(Player p);
public void keyPressed(GameState gs);
public void keyReleased(GameState gs);
}
