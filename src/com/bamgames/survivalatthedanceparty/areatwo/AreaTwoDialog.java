package com.bamgames.survivalatthedanceparty.areatwo;

import com.bamgames.survivalatthedanceparty.main.SADPMain;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;

public class AreaTwoDialog
{
    public static void dHouse()
    {
    //Make screen blur
    debug("Its a blur...");
    System.out.println("???: HELLO THERE!");
    playerSpeak("I had the strangest dream");
    System.out.println("???: What dream would that be?");
    playerSpeak("I was in a strange version of Hell. It was nothing what I thought it was.");
    //Wizard is smiling
    System.out.println("???: Was it different from this Hell?");
    playerSpeak("I'm still in Hell.");
    System.out.println("???: Oh that type of dream. It's alright, the newcomers usually have those dreams the first time they sleep. It's typical.");
    playerSpeak("Oh");
    System.out.println("???: I'm sorry I should've introduced myself. I'm Wiz D.");
    playerSpeak("Nice to meet you, I think.");
    wizardSpeak("Yeah this is Hell though. There is nothing nice in hell.");
    playerSpeak("Anyways I have a bunch of questions. Door Guard didn't tell me much besides the basics.");
    wizardSpeak("Oh... Well what do you want to know?");
    AreaTwoDialogQuestions.initialQuestions();
    debug("Wiz D gives player basic items here");
    //Area2 Finished
    debug("Area 2 Complete!");
        SADPMain.nextArea();
    }

}
