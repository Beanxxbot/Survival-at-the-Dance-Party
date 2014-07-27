package com.bamgames.survivalatthedanceparty.areafourteen;

import com.bamgames.survivalatthedanceparty.main.SADPMain;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;
import static com.bamgames.survivalatthedanceparty.reference.Reference.*;

public class AreaFourteenDialog {
    public static void kingClub(){
        debug("King Club enters with Posse.");
        qSpeak("OH WHAT A SURPISE. YOU MUST BE THE DISTURBANCE.");
        playerSpeak("Is there a disturbance?");
        qSpeak("You have been causing problems at my clubs.");
        playerSpeak("I am a mere traveler.");
        qSpeak("DON'T TRY TO FOOL ME. I know who you are.");
        playerSpeak("Who would you be?");
        kingSpeak("I am King Club master of the clubs, and manipulator of the Devil himself.");
        debug("A Pause");
        kingSpeak("Nothing to say? Well i've had enough of you!");
        debug("King Club attacks player, player gets knocked out.");
        kingSpeak("THIS IS THE THING THAT KILLED OFF MY MANAGERS!!! THEY NEED TO STOP BEING SO LAZY AND TRAIN MORE!!! THEY NEED TO DEFEND MY CLUBS!!!");
        debug("Explosion king club falls over along with posse");
        hunterSpeak("Well i've had enough of you KING CLUB.");
        kingSpeak("Club Hunter it's been awhile how's your quaint little bar in the middle of nowhere?");
        hunterSpeak("Better than you'll be if you keep talking.");
        kingSpeak("So it's not going so well. Did all my clubs take away all your customers? Or did my bombs destroy your first bar too much?");
        hunterSpeak("NOBODY DESTROYS MY BAR.");
        debug("Club Hunter attacks");
        debug("King Club disappears.");
        debug("Voice comes off from the distance.");
        kingSpeak("Prince Club eliminate them in the most painful way possible. SEND THEM TO THE DEPTHS.");
        hunterSpeak("Hey "+ name + " this might help ya.");
        debug("Player is fully revived");
        hunterSpeak("Get back into focus we have a royal guest.");
        debug("Player and Club Hunter fight Prince Club");
        debug("If player loses:");
        hunterSpeak("This might help! Get up and help me!");
        debug("If Club Hunter loses:");
        debug("Player fights Prince Club Solo");
        debug("If Club Hunter and Player lose:");
        kingSpeak("BOW BEFORE MY GLORY AND A SMALL PAYMENT SHALL BE MADE TO ME. THEN I SHALL LET YOU BACK TO THE REALM OF HELL.");
        debug("Player makes large payment and has to bow ENTER CUTSCENE. Resumes story Prince Club is gone.");
        debug("If player wins:");
        hunterSpeak("(SPEAKING TO AIR)My enemy King Club! Today I went Royal Club Hunting and I killed your precious prince! One day ill come for you! (SPEAKING TO PLAYER NOW) You're lucky I found you. You were going to be roasted! Next time you see King Club run! Come on let's get back to my bar.");
        debug("Walking cutscene.");
        debug("Teleport back to bar.");
        //Area 14 Finished
        debug("Area 14 Completed");
        SADPMain.nextArea();
    }
}
