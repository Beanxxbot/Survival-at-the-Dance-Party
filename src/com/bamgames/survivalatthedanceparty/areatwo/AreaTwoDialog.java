package com.bamgames.survivalatthedanceparty.areatwo;

import com.bamgames.survivalatthedanceparty.SADPMain;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.debug;
import static com.bamgames.survivalatthedanceparty.speaking.Speaking.wizardSpeak;
import static com.bamgames.survivalatthedanceparty.speaking.Speaking.playerSpeak;

public class AreaTwoDialog
{
    public static void dHouse()
    {
    //Make screen blur
    debug("Its a blur..");
    System.out.println("???: HELLO THERE!");
    playerSpeak("I had the strangest dream");
    System.out.println("???: What dream would that be?");
    playerSpeak("I was in a strange version of hell. It was nothing what I thought it was.");
    //Wizard is smiling
    System.out.println("???: Was it different from this hell?");
    playerSpeak("I'm still in hell.");
    System.out.println("???: Oh that type of dream. It's alright the first-timers have those dreams the first sleep. It's typical.");
    playerSpeak("Oh");
    System.out.println("???: I'm sorry I should've introduced myself. I'm Wiz D.");
    playerSpeak("Nice to meet you I think.");
    wizardSpeak("Yea this is hell though. There is nothing nice in hell.");
    playerSpeak("Anyways I have a bunch of questions. Door Guard didn't tell me much besides the basics.");
    wizardSpeak("Oh... Well what do you want to know?");
    //Bring up menu of questions to ask
    debug("Bring up menu of questions to ask \n 1.Why is hell like this? \n 2.Why am I in hell? \n 3.Why am I here?");

    //Sirawesomeknight WILL DO 7/13/2014 Answer to questions here

    //Bring up menu of secondary questions
    debug("Bring up menu of secondary questions to ask \n 1.Where can I meet the Devil?(After Why am I in hell?) \n 2.Where can I go to find Mone?(After Why am I here?)");

    //Sirawesomeknight WILL DO 7/13/2014 Answer to questions here

    //Bring up menu of tertiary questions
    debug("Bring up menu of tertiary questions to ask \n 1.Can I Go Now(After all questions answered)");

    //Sirawesomeknight WILL DO 7/13/2014 Talk about Key to Freedom Here
    debug("Wiz D gives player basic items here");
    //Area2 Finished
    debug("Area 2 Complete");
        SADPMain.nextArea();
    }
}
