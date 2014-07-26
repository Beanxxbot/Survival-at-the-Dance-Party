package com.bamgames.survivalatthedanceparty.areatwelve;

import com.bamgames.survivalatthedanceparty.SADPMain;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.*;
import static com.bamgames.survivalatthedanceparty.reference.Reference.name;

public class AreaTwelveDialog {
   public static void surprise(){
       debug("Wiz Q is drunk.");
       wizqSpeak("YOU BEAT ROCKIN ROCK?!");
       playerSpeak("Yes I did I now have control of the Rock Club.");
       wizqSpeak("I CAN'T BELIEVE YOU DID THAT! THIS SILLY ADVENTURE OF YOURS HAS GONE FAR ENOUGH.");
       playerSpeak("Sorry I am confused...");
       wizqSpeak("MEET YOUR WORST NIGHTMARE!");
       hunterSpeak("This is going to get interesting. DO NOT DESTROY THE BAR OR ILL KILL YOU BOTH!");
       debug("Wiz Q and player fight");
       debug("If Wiz Q wins.");
       wizqSpeak("THIS ADVENTURE STOPS NOW. YOU ARE A MERE HUMAN DONT EXPECT TO CONTROL HELL AT ALL");
       playerSpeak("Ugghghghhghghghhhhhh");
       wizqSpeak("HAVE A NICE DEATH.");
       debug("Player knocks out Wiz Q");
       playerSpeak("Enough Wiz Q.");
       wizqSpeak("Get me another ale.");
       hunterSpeak("Yea sure Wiz Q for that entertainment there this one's on the house.");
       wizqSpeak("That was pretty impressive kiddo. Rockin Rock should've watched himself. Do you want me to tell you where you need to go now?");
       playerSpeak("Yes");
       wizqSpeak("Well too bad for you.");
       playerSpeak("I should just kill you.");
       wizqSpeak("You do that, and you never going to get anywhere.");
       playerSpeak("What do you want me to do?");
       wizqSpeak("Beat me in a drinking contest!");
       debug("Player and Wiz Q have a drinking contest.");
       debug("If Wiz Q wins");
       wizqSpeak("Haha try again later kiddo. The old wiz beats the kiddo...");
       debug("If Player wins");
       wizqSpeak("The kiddo beats the old wiz! Wow now you have truely gained some of my respect.");
       wizqSpeak("Now for the punk club. Professor Punk on the other hand has probably been getting ready a long time. As you now control the Rock Club though, the Club Doors will let you in because they'll mistake you for Rockin Rock. Professor Punk is a rather interesting fellow. He is proper gentleman but he supposedly has a punk side to him. Otherwise how would he be a punk rock fan?");
       hunterSpeak("HEY "+ name + "!!! You have to pay for your drinks.");
       debug("Player pays for all attempts at winning the contest.");
       debug("If player doesnt have enough money play Club Hunter in drinking contest");
       debug("If player loses Club Hunter randomly selects an item he wants from you and takes it.");
       debug("If player wins");
       hunterSpeak("Alright "+ name +" be on your way. This ones on the house then!");
       debug("Player leaves");
       //Area 12 Finished
       debug("Area 12 Completed");
       SADPMain.nextArea();

   }
}
