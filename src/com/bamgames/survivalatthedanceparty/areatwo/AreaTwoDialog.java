package com.bamgames.survivalatthedanceparty.areatwo;

import com.bamgames.survivalatthedanceparty.SADPMain;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.*;

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
    debug("Why is hell like this?");
    wizardSpeak("Hell has always been like this. This is how it was from the start. The devil wanted it to be fun and joyous. A little different than heavens joyous, but still quite fun.");
    playerSpeak("I see");
    wizardSpeak("So in truth I don't know why you should ask the devil. HE RUNS IT.");
    debug("Why am I in hell?");
    wizardSpeak("Well heaven didn't let you in. Then the devil accepted you. Very few know why a decision is made. You must ask the devil to get that answer.");
    debug("Why am I here?");
    wizardSpeak("A monster named Mone almost killed you. If you die in hell you suffer through the most pain and misery you can possibly face, and then you reappear. I stopped Mone because you don't know what you are doing. I rescued you.");
    playerSpeak("That was very nice of you to save me. That information is very helpful to know.");
    wizardSpeak("There is no nice in hell remember. Infact your going to have to get out of my house soon.");
    playerSpeak("Why?");
    wizardSpeak("I have done enough for you. After you don't have anymore questions. Just... Get Out!");
    playerSpeak("Nothing is nice in hell...");
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
