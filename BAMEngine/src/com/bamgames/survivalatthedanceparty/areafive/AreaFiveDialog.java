package com.bamgames.survivalatthedanceparty.areafive;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;
import static com.bamgames.survivalatthedanceparty.reference.Reference.*;

import com.bamgames.survivalatthedanceparty.main.SADPMain;
import java.util.Scanner;

public class AreaFiveDialog {
    public static void templeDialog(){
        moneSpeak("ROOOOOOOOAAAAAAAARRRRRRR!!!!!!!");
        debug("Screen Shakes Player Stops");
        debug("Player falls all the way down to the base.");
        moneSpeak("Hey Hey Hey Hey!!!! Look who came to play! Didn't I kill you? Wouldn't you want to stay away?");
        playerSpeak("Wiz D saved me.");
        moneSpeak("Wiz D?!? Really?!? Wiz D?!?");
        playerSpeak("Yes.");
        moneSpeak("I believe I never caught your name. Even though I almost killed you.");
        playerSpeak("I'm " + name);
        moneSpeak("Well " + name + " Wiz D is the most selfish person on the planet. He should go to Hell.");
        playerSpeak("We are already in Hell.");
        moneSpeak("That was a joke! If you can't even take a joke I don't know why Wiz D thought you were even worth saving.");
        playerSpeak("Enough distractions!");
        moneSpeak("YOU THINK YOU HAVE AUTHORITY HERE?!? YOU HAVE SOME HUMOR AFTER ALL! WHY HAVE YOU COME HERE?!?");
        playerSpeak("I have to ask you some questions.");
        moneSpeak("Fine...");
        debug("1. Why did you try to kill me\n2. Can you get me summoned to see The Devil?\n3. Can I get out of Hell somehow?\n4. What is your position here?");
        debug("Type the number you want answered.");
        Scanner fakeScanner = new Scanner(System.in);
        fakeScanner.nextLine();
        moneSpeak("HAHAHAHA YOU THINK I WAS GOING TO ANSWER YOUR QUESTIONS! I AM GOING TO LET A PUNY HUMAN INTERROGATE ME! GO TO HELL!");
        playerSpeak("(Fake Laughter)Hahahahahaha");
        moneSpeak("STOP NOW!!! I SHOULDVE FINISHED THE JOB. ILL LET YOU HAVE ONE CHANCE! WHY SHOULDN'T I KILL YOU RIGHT NOW?");
        playerSpeak("I AM NOT GOING TO ANSWER THAT");
        moneSpeak("Very funny now tell me please.");
        playerSpeak("Alright...(Interrupted)");
        moneSpeak("I WAS BEING NICE! I AM NEVER NICE! I AM MONE! I AM SICK OF THIS CONVERSATION!");
        debug("Battle begins");
        debug("If player loses:");
        moneSpeak("NEXT TIME COME WITH A BETTER SENSE OF HUMOR! THAT IS IF YOU DO COME.");
        debug("Be ready to have secondary dialog if battle is lost and you come back again.");
        debug("If player wins:");
        moneSpeak(name +"... I have nothing to say to you before I leave for my eternal pain and misery. Unlike you I don't get unlimited chances.");
        playerSpeak("Now you have to answer me!");
        moneSpeak("I WILL DIE FIRST AND THERE IS NOTHING YOU CAN DO OR SAY THAT WILL CHANGE MY MIND. However, I can make sure you regret having done this to me.");
        playerSpeak("You have no power!");
        moneSpeak("Oh but just you wait... I have a little surprise for you inside the temple walls.");
        debug("Lava starts pouring out of the walls. Then the walls start exploding");
        moneSpeak("Good Luck...");
        debug("Mone dies.");
        playerSpeak("So this is the end?");
        debug("Door Guard appears.");
        guardSpeak("HEY! LOOK OVER HERE! The devil says you've entertained him! He will reward you, but you can't accept the reward if you die now can you?");
        playerSpeak("Where...(Interrupted)");
        guardSpeak("ENOUGH QUESTIONS GET OUT OF HERE!");
        debug("Player escapes jump maze.");
        playerSpeak("Door Guard!");
        guardSpeak("Hey " + name +"!");
        playerSpeak("Can I have my reward?");
        guardSpeak("No silly! there is no reward! The devil thought you did entertain him though! He wanted you to live so he told me to make you live. I was feeling lazy, and I know you listen to me to I took advantage of that. It worked I should say!");
        playerSpeak("I had accepted death!");
        guardSpeak("That isn't an option trust me. I've died here... Before I was Door Guard...");
        playerSpeak("It is an option for me!");
        guardSpeak("Whatever go die if you want! I was kidding about the no reward. Here it is.");
        debug("PLAYER RECEIVES KEY TO FREEDOM");
        playerSpeak("Thank You.");
        guardSpeak("It's not from me! It's from the Devil. Don't thank him. That's a bad idea.");
        debug("Door Guard Disappears");
        //Area5 Finished
        debug("Area 5 Complete");
        SADPMain.nextArea();
    }

}
