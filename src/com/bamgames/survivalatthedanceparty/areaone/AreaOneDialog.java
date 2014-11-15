package com.bamgames.survivalatthedanceparty.areaone;

import com.bamgames.survivalatthedanceparty.main.SADPMain;
import com.bamgames.survivalatthedanceparty.reference.Reference;
import com.bamgames.survivalatthedanceparty.util.NamePrompt;

import java.util.Scanner;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;

public class AreaOneDialog
{
    public static String getName;
    public static void storyWelcome()
    {
        System.out.println("???: Hey! Hey you!");
        System.out.println("???: Yeah yeah, over here! By the door marked 'hell'!");
        System.out.println("???: Hello, my name is... well, call me Guard.");
        guardSpeak("Hello. Welcome to Hell.");
        guardSpeak("For registration purposes I need to ask your name");
        guardSpeak("Ahh " + Reference.name + "...That's an ugly name!");
        playerSpeak("What the heck? What happened? Why did I end up in Hell?!?");
        guardSpeak("No no no, you've got it all wrong. It's not a bad thing to end up here");
        playerSpeak("What do you mean!? Of course Hell is bad!");
        //Display picture of WASD keys
        debug("Display WASD Keys");
        guardSpeak("Hahaha, well, walk over to me with the WASD keys and I'll show you");
        playerSpeak("Okay, I'm here.");
        //Display picture of E key
        debug("Display E Key");
        guardSpeak("Good, good. Now use the 'E' Key to open the door");
        debug("Door Opens");
        //Play loud dubstep music
        debug("Play Music");
        //fade out
        debug("Fade Out");
        //Enter crazy party
        guardSpeak("So... It appears this party has gone out of hand...");  
        //Play dubstep music
        playerSpeak("This is quite a party");
        //Enemies come in
        debug("Enemies in vicinity");
        guardSpeak("I didn't expect this would happen... I have some bad news... Devils' got some guys here. Watch yourself.");
        //Enemies come closer and you are about to engage in a fight
        debug("Enemies Approach");
        guardSpeak("OKAY! OKAY! OKAY! THIS IS BAD! Alright, do you know how to fight?");
        //TODO - Implement optional fighting tutorial
        playerSpeak("No!");
        debug("Display picture of 'Space Bar' and 'Shift' button.");
        guardSpeak("Alright then it appears I, The Door Guard, will have to teach you. To use a weapon press ____ as you don't have one at the moment use your fists. To block press _____ Alright! YOU GOT THIS!");
        playerSpeak("LET'S GO!");
        //Enemies fight
        debug("Enemies Fight");
        playerSpeak("I actually did it!");
        guardSpeak("You have a lot more where that came from... I wonder why you are in hell you clearly don't belong here. You should probably get out of this club.");
        debug("Continues to fight more enemies until reaches the end of the club");
        debug("Display 'R' Key");
        guardSpeak("You did it you beat the club! YOU WIN! YES! You picked up some stuff from fighting press 'R' to see it");
        debug("Flashing arrow to Health bar first.");
        debug("Flashing arrow to Exp bar second");
        guardSpeak("Oh I should probably also mention you also took some damage so you lost health. However, you gained experience!");
        playerSpeak("Well now that's over, time for some peace. I finally won!");
        qSpeak("NO FLIMSY NUGGET LIKE YOU GETS OUT OF HERE AND KILLS MY PALS! NOBODY!");
        playerSpeak("Who are you?");
        guardSpeak("Oh he's...");
        qSpeak("BE QUIET! ENOUGH TALK!");
        //Mone smashes player
        debug("Mone Smashed the Player");
        //Blinding bright light
        debug("A blinding bright light appears...");
        //Area1 Finished
        debug("Area 1 Complete");
        SADPMain.nextArea();
    }


}
