package com.bamgames.survivalatthedanceparty.areaten;

import com.bamgames.survivalatthedanceparty.main.SADPMain;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.*;

public class AreaTenDialog {
   public static void storyOfTheClubs(){
       wizqSpeak("Ah you actually got the map! That is absolutely incredible! Good Job! It appears you are not such a waste of time! So I shall tell you the story of the clubs.");
       debug("CUT SCENE BEGINS");
       wizqSpeak("A long time ago hell used to be an awful place.");
       wizqSpeak("Then the Devil grew bored of having a domain full of all sorts of bad things");
       wizqSpeak("So he decided to make it more fun. He gathered his weakest subjects, and he cast spells on them to make them the managers. There was originally 8.");
       wizqSpeak("After sometime of having these clubs the subjects of hell became fun, and slightly more civilized.");
       wizqSpeak("Cities and towns started being constructed...");
       wizqSpeak("Out of the darkness came the most fun being of all time. King Club.");
       wizqSpeak("The Devil was getting bored of running all these clubs. King Club manipulated him somehow into giving up the power to control the clubs.");
       wizqSpeak("Since then he controlled hell really giving the illusion that the Devil controls it. So the Devil is satisfied, and won't kill King Club.");
       wizqSpeak("King Club was free to rule hell however he wished.");
       wizqSpeak("There used to be a Disco Club. King Club took a tour of all the clubs. He liked every club except the Disco Club. So he banished the manager to the depths, and destroyed the club.");
       debug("CUT SCENE ENDS");
       wizqSpeak("Some say it's because he wanted to show the power he had.");
       playerSpeak("What are the depths?");
       wizqSpeak("You are not allowed to speak of them.");
       playerSpeak("Now will you tell me what I must do? Where do I go first?");
       wizqSpeak("You must go to the Rock Club. Rockin Rock is a terrible manager. He is probably so busy rocking out that he didn't notice the communications went down. NOW GO! FREE HELL!");
       debug("Player leaves bar.");
       SADPMain.nextArea();
   }
}
