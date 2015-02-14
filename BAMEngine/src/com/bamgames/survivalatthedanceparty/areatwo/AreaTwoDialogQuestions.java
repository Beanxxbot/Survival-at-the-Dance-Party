package com.bamgames.survivalatthedanceparty.areatwo;

import java.util.Scanner;

import static com.bamgames.survivalatthedanceparty.util.Speaking.debug;
import static com.bamgames.survivalatthedanceparty.util.Speaking.playerSpeak;
import static com.bamgames.survivalatthedanceparty.util.Speaking.wizardSpeak;

public class AreaTwoDialogQuestions
{

//Which question content should appear?
public static boolean isSecondaryOne = false;
public static boolean isSecondaryThree = false;
public static boolean isTertiaryOne = false;

//Was question 1,2, or 3 already asked?
public static boolean oneAsked = false;
public static boolean twoAsked = false;
public static boolean threeAsked = false;

//Which question should be prompted?
public static int whichOne = 1;
public static int whichTwo = 1;
public static int whichThree = 1;

//question prompts
public static String questionOneOne = "Why is Hell like this?";
public static String questionOneTwo = "Where can I meet 'The Devil'?";
public static String questionOneThree = "Can I go now?";
public static String questionTwoOne = "Why am I in Hell?";
public static String questionTwoTwo = "Where can I go to find Mone?";

//question prompt that appears to user
public static String questionOne;
public static String questionTwo;
public static String questionThree;

//Has the exception question been asked?
public static boolean exceptionQuestionAsked = false;

    //Decides question content that is prompted to the user
    public static void selectQuestionStage(){
        if(whichOne == 1){
          questionOne = questionOneOne;
        }else if(whichOne == 2){
            questionOne = questionOneTwo;
        }else if(whichOne == 3){
            questionOne = questionOneThree;
        }

        if(whichTwo == 1){
            questionTwo = questionTwoOne;
        }else if(whichTwo == 2){
            questionTwo = questionTwoTwo;
        }else if(!exceptionQuestionAsked){
           questionTwo = questionTwoOne;
        }
        else{
            questionTwo = "INFORMATION GIVEN";
        }

        if(whichThree == 1){
            questionThree = "Why am I here?";
        }else{
            questionThree = "INFORMATION GIVEN";
        }
    }

    public static void initialQuestions()
    {
        //Which question should be prompted to the user?
        selectQuestionStage();

        //Prompt questions to the user
        Scanner initialQuestion = new Scanner(System.in);
        debug("1."+questionOne+"\n"+
                "2."+questionTwo+"\n"+
                "3."+questionThree);
        debug("Type the number you want answered");
        String question = initialQuestion.nextLine();

        //Question Slot 1
        if(question.equals("1") && !oneAsked)
        {
            if(isSecondaryOne){
                playerSpeak(questionOneTwo);
                wizardSpeak("AHAHAHAHAHAHAHA!!!!!! You can't you have to be summoned! Good luck trying to be summoned!");
                isSecondaryOne = false;
                isTertiaryOne = true;
                whichOne++;
                initialQuestions();
            }else if(isTertiaryOne){
                playerSpeak("Can I go now?");
                wizardSpeak("You were never a prisoner here! You may go whenever you wish!");
                playerSpeak("Thank you Wiz D.");
                wizardSpeak("Bye... WAIT ONE LAST THING!");
                playerSpeak("What?");
                wizardSpeak("You will be limited in where you can travel due to the fact you do not have a key to freedom. The devil gives them out at free will. You will have to take the highway...");
                playerSpeak("The highway?");
                wizardSpeak("You will see. Anyways, get OUT OF MY HOUSE!");
                isTertiaryOne = false;
                oneAsked = true;
                whichOne++;
            }
            else {
                playerSpeak(questionOneOne);
                wizardSpeak("Hell has always been like this. This is how it was from the start. The devil wanted it to be fun and joyous. A little different than heavens joyous, but still quite fun.");
                playerSpeak("I see");
                wizardSpeak("So in truth I don't know why you should ask the devil. HE RUNS IT");
                isSecondaryOne = true;
                whichOne++;
                initialQuestions();
            }
        }

        //Question Slot 2
        else if (question.equals("2") && !twoAsked)
        {
            if(isSecondaryThree){
                playerSpeak("Where can I go to find Mone?");
                wizardSpeak("Go back to the club in the Hellscity that you arrived at. That's the best place to check.");
                isSecondaryThree = false;
                whichTwo++;
                if(exceptionQuestionAsked) {
                    twoAsked = true;
                    whichTwo++;
                }
                initialQuestions();
            }
            else {
                playerSpeak("Why am I in hell?");
                wizardSpeak("Well heaven didn't let you in. Then the devil accepted you. Very few know why a decision is made. You must ask the devil to get that answer.");
                if(whichTwo == 2){
                    twoAsked = true;
                    System.out.println(whichTwo);
                }
                exceptionQuestionAsked = true;
                initialQuestions();
            }
        }

        //Question Slot 3
        else if(question.equals("3") && !threeAsked)
        {
                playerSpeak("Why am I here?");
                wizardSpeak("A monster named Mone almost killed you. If you die in hell you suffer through the most pain and misery you can possibly face, and then you reappear. I stopped Mone because you don't know what you are doing. I rescued you.");
                playerSpeak("That was very nice of you to save me. That information is very helpful to know.");
                wizardSpeak("There is no nice in hell remember. In fact your going to have to get out of my house soon.");
                playerSpeak("Why?");
                wizardSpeak("I have done enough for you. After you don't have anymore questions. Just... Get Out!");
                playerSpeak("Nothing is nice in hell...");
                isSecondaryThree = true;
                threeAsked = true;
                whichTwo++;
                whichThree++;
                initialQuestions();
        }
        else
        {
            initialQuestions();
        }

    }
}
