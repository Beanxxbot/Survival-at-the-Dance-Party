package com.bamgames.survivalatthedanceparty.area1;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.debug;
import static com.bamgames.survivalatthedanceparty.speaking.Speaking.guardSpeak;
import static com.bamgames.survivalatthedanceparty.speaking.Speaking.playerSpeak;

public class StoryWelcome
{
    public static void storyWelcome()
    {
        System.out.println("???: Hey! Hey you!");
        System.out.println("???: Yeah yeah, over here! By the door marked 'hell'!");
        System.out.println("???: Hello, my name is... well call me Guard");
        guardSpeak("Hello. Welcome to hell.");
        playerSpeak("What the heck? What happened? Why did I end up in hell!");
        guardSpeak("No no no, you've got it all wrong. It's not a bad thing to end up here");
        playerSpeak("What do you mean!? Of course hell is bad!");
        //Display picture of WASD keys
        debug("Display WASD Keys");
        guardSpeak("Hahaha, well, walk over to me with the WASD keys and I'll show you");
        playerSpeak("Okay, I'm here.");
        //Display picture of R key
        debug("Display R Key");
        guardSpeak("Good, good. Now use the 'R' Key to open the door");
        debug("Door Opens");
        //Play loud dubstep music
        debug("Play Music");
        //fade out
        debug("Fade Out");

    }
}
