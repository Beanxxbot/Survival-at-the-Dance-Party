package com.bamgames.survivalatthedanceparty.areaseven;

import com.bamgames.survivalatthedanceparty.main.SADPMain;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;
public class AreaSevenDialog {

    public static void searchForClubHunter(){
        guardSpeak("Ah what a peculiar place. The sunlight and moonlight border. I am afraid I can not help you from here on out. I must return to the court of the devil.");
        playerSpeak("Thank you Door Guard.");
        debug("Door Guard leaves.");
        debug("Player crosses sunlight and moonlight border");
        debug("Screen blurs and monsters appear");
        debug("Player finds sand dune valley and slips down the bottom");
        debug("Player finds strange looking bump in the sand and whips it away. It is a hole in the ground. Player climbs down arrives at club hunters.");
        SADPMain.nextArea();

    }
}
