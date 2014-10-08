package com.bamgames.survivalatthedanceparty.areatwenty;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;
import static com.bamgames.survivalatthedanceparty.reference.Reference.*;

public class AreaTwentyDialog {
    public static void doorGuardDropsBy(){
        qSpeak("Hello there "+ name +"...");
        playerSpeak("WHO ARE YOU?!");
        debug("Player points sword on strange person.");
        guardSpeak("It's me Door Guard.");
        playerSpeak("Good to see you Door Guard!");
        guardSpeak("Save it. You are becoming a serious threat "+ name +".");
        playerSpeak("That's great!");
        guardSpeak("It's not. The Devil is concerned. You are toppling all of King Club's managers like dominoes.");
        playerSpeak("So what do you want me to do?");
        guardSpeak("I merely came to tell you to be on guard at all times. For good luck take this! If you need me for anything come get me in Heaven's Light. I'm setting up a shop there.");
        //Area 20 Finished
        debug("Area 20 Completed");
    }
}
