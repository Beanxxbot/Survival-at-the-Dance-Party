package com.bamgames.survivalatthedanceparty.areatwo;

import java.util.Scanner;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.debug;
import static com.bamgames.survivalatthedanceparty.speaking.Speaking.playerSpeak;
import static com.bamgames.survivalatthedanceparty.speaking.Speaking.wizardSpeak;

public class AreaTwoDialogQuestions
{
    static Scanner initialQuestion = new Scanner(System.in);

    public static void initialQuestions()
    {
        debug("1.Why is hell like this? \n" +
                " 2.Why am I in hell? \n" +
                " 3.Why am I here? \n" +
                " 4. Continue");
        debug("Type the number you want answered");
        String question = initialQuestion.nextLine();
        if(question.equals("1"))
        {
            debug("Why is hell like this?");
            wizardSpeak("Hell has always been like this. This is how it was from the start. The devil wanted it to be fun and joyous. A little different than heavens joyous, but still quite fun.");
            playerSpeak("I see");
            wizardSpeak("So in truth I don't know why you should ask the devil. HE RUNS IT");
            initialQuestions();
        }
        else if (question.equals("2"))
        {
            debug("Why am I in hell?");
            wizardSpeak("Well heaven didn't let you in. Then the devil accepted you. Very few know why a decision is made. You must ask the devil to get that answer.");
            initialQuestions();
        }
        else if(question.equals("3"))
        {
            debug("Why am I here?");
            wizardSpeak("A monster named Mone almost killed you. If you die in hell you suffer through the most pain and misery you can possibly face, and then you reappear. I stopped Mone because you don't know what you are doing. I rescued you.");
            playerSpeak("That was very nice of you to save me. That information is very helpful to know.");
            wizardSpeak("There is no nice in hell remember. In fact your going to have to get out of my house soon.");
            playerSpeak("Why?");
            wizardSpeak("I have done enough for you. After you don't have anymore questions. Just... Get Out!");
            playerSpeak("Nothing is nice in hell...");
            initialQuestions();
        }
        else if(question.equals("4"))
        {
            initialQuestion.close();
        }
        else
        {
            initialQuestions();
        }

    }
}
