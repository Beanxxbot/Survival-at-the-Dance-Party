package com.bamgames.survivalatthedanceparty.areaeight;

import com.bamgames.survivalatthedanceparty.SADPMain;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.*;
import static com.bamgames.survivalatthedanceparty.reference.Reference.*;

public class AreaEightDialog {
    public static void clubHunters() {
        hunterSpeak("WHO ARE YOU?!");
        playerSpeak("I am " + name);
        hunterSpeak("I've never heard of you. SO THAT NAME MEANS NOTHING TO ME! WHY ARE YOU IN MY BAR?");
        playerSpeak("Wiz D sent me here.");
        hunterSpeak("I see... Any friend of Wiz D is my friend as well. How is the guy?");
        playerSpeak("He's an interesting person.");
        hunterSpeak("Same old same old. Anyways my name is Club Hunter I own this wonderful bar. Make yourself at home as long as you don't cause any trouble.");
        playerSpeak("Thank you");
        hunterSpeak("So why did Wiz D send you here?");
        playerSpeak("I am new to hell. I have many questions that need answering. I need to find King Club. Wiz D said you would know how.");
        hunterSpeak("YOU WANT TO FIND KING CLUB! HAHAHAHAHAHA! Why do you want to find him?");
        playerSpeak("I need him to get me to the Devil.");
        hunterSpeak("That's even more ridiculous than the previous goal you had! You're stupid, but I pity stupid people. Go talk to Wiz Q maybe he can help you. Please do me a favor, and don't bother me with this silly quest of yours.");
        playerSpeak("Of course.");
        debug("Player goes to find Wiz Q");
        debug("Wiz Q is a little drunk");
        wizqSpeak("Whaddyou want kiddo?");
        playerSpeak("You are Wiz Q?");
        wizqSpeak("Maybe. That depends on what you want.");
        playerSpeak("I want to find King Club so he can get me to the Devil");
        wizqSpeak("Has anyone told you that you're an idiot.");
        playerSpeak("Please just answer the question.");
        wizqSpeak("Well I have nothing else to do. You lucked out kiddo. The only way to get to King Club is to overthrow all the clubs in hell.");
        playerSpeak("This sounds like a difficult task");
        wizqSpeak("Considering that hell revolves around club culture... Yea you could say it's extremely difficult.");
        playerSpeak("Tell me more.");
        wizqSpeak("There is lemme see here... There are 7 clubs. Dubstep, Electronic, Classical, Rock, Punk, Pop, and Golf");
        playerSpeak("Golf?");
        wizqSpeak("Yea you know a golf club? Place where people play golf. What can I say it's a club and King Club plays lots of Golf.");
        playerSpeak("So I have to overthrow these clubs.");
        wizqSpeak("Yea there is a manager at each of these clubs. You have to kill them. Which is going to be difficult because they practically run hell. The Devil is really the chief overseer and maintenance.");
        playerSpeak("Any suggestions on where I should go to start.");
        wizqSpeak("Unfortunately the only way to get into a club is to be invited by a manager and then get a teleporter key. Then use the PortalPort portal to get to the said club. You can also get in by knowing the location. Nobody knows the location");
        playerSpeak("Is there anyway I can get invited?");
        wizqSpeak("Wow you really are new. No there is no way in hell you will be invited. In heaven there is way. However, you are in hell.");
        playerSpeak("Is there anyway I can find the location?");
        wizqSpeak("If you find a map of hell.");
        playerSpeak("Where can I get one of those?");
        wizqSpeak("There is only two. One is with the Devil, one is in Hells lost. It is guarded by Mr.NIGHT. He uses it to talk to the managers somehow for King Club. So if you kill Mr.NIGHT you will also disable communcations between all the managers and King Club.");
        playerSpeak("Won't they suspect something?");
        wizqSpeak("Yes they will. I would say steal it from Mr.NIGHT, but it's in Mr.NIGHT's stomach. When you get to the clubs they'll have their defenses setup, and they'll have stopped the party. The party won't resume until communications are restored. Which won't happen. So good luck! GO FIND THAT MAP!");
        debug("Player heads towards ladder.");
        hunterSpeak("Oh hey "+ name + " You can't leave that way. Take the exit over here.");
        debug("Club Hunter walks player over to exit/entrance door");
        hunterSpeak("This is the exit and entrance for people who've been here before. It's a secret. If you tell anyone about it the Club won't let you back in because of a spell I put on it. SO DON'T TELL ANYONE ABOUT IT.");
        debug("Player walks out door");
        //Area 8 Finished
        debug("Area 8 Completed");
        SADPMain.nextArea();
    }
}
