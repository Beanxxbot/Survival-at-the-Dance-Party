package com.bamgames.survivalatthedanceparty.areaeighteen;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;
import static com.bamgames.survivalatthedanceparty.reference.Reference.*;

public class AreaEighteenDialog {
    public static void theWizQAmbush(){
       playerSpeak("Club hunter there's a lot of mysterious figures in your bar today. Who are they?");
       hunterSpeak("They are friends of Wiz Q's.");
       playerSpeak("You are sure? They look hostile.");
       hunterSpeak("Wiz Q confirmed it. Go ask him why they are here.");
       debug("Player goes over to Wiz Q's area.");
       wizqSpeak("Go away kiddo. I don't want to help you anymore. It's too dangerous.");
       playerSpeak("Not again... Wiz Q will you please help me?");
       wizqSpeak("NO I WILL NOT I AM GOING TO DIE AT THE END OF THIS.");
       playerSpeak("So I have to fight you for you're help again?");
       wizqSpeak("Not this time! Wizzes let's take em out.");
       debug("People in hoods reveal themselves to be wizzes. Wizzes B,H,I,and J");
       debug("If player loses");
       wizqSpeak("DON'T COME BACK TO THIS BAR EVER AGAIN! STAY AWAY FROM ME!");
       debug("If player wins");
       wizqSpeak("Ugh you got me. I am happy to die rather than help you!");
       playerSpeak("Wiz Q maybe in the end I rid hell of King Club?");
       wizqSpeak("That is...ridiculous... Stop before he sends you to the depths!");
       playerSpeak("Will I see you again?");
       wizqSpeak("No I must go to the depths... I have been here a long time. Goodbye Kiddo. I wish I had never known you.");
       debug("Wiz Q dies.");
       hunterSpeak("I can't believe you just killed Wiz Q! You are going to clean all these bodies up!");
       playerSpeak("I am sorry for the trouble Club Hunter.");
       hunterSpeak("Just... Try not to kill anymore wizzes. They are on our side.");
       debug("Player uses mop to clean up bodies, but discovers wizzes B and J are alive.");
       wizjSpeak("Don't clean me up... Please I was just here because Wiz Q wanted to take you out. I have nothing against you...");
       playerSpeak("Fine... At the slightest sign of trouble, I am going to eliminate you.");
       wizbSpeak("I am Wiz B. Just don't clean me up I beg of you. I won't attack you!");
       playerSpeak("Fine... At the slightest sign of trouble, I am going to eliminate you.");
       debug("Player dumps bodies into trash.");
       hunterSpeak("Good Job cleaning up the bodies. You are the only nice person in this realm. For that I will be nice. Take some cash for cleaning it up. Even though it was your mess.");
       debug("Player receives a certain amount of money.");
       hunterSpeak("Go talk to those Wizzes you saved maybe they'll help you now.");
       debug("Player talks to Wizzes.");
       debug("CUTSCENE BEGINS");
       playerSpeak("Good afternoon gentleman I am "+ name +".");
       wizbSpeak("I can't believe you killed Wiz Q, Wiz H, and Wiz I!!!");
       wizjSpeak("They were our friends!");
       playerSpeak("It is a shame they are dead, but I was attacked.");
       wizjSpeak("You forced Wiz Q too! You pressured him into doing something dangerous!");
       playerSpeak("I needed his help. My quest benefits everyone, and he didn't want to play his part. I needed him.");
       wizbSpeak("You shouldn't have forced him!");
       playerSpeak("Do you know what my quest is? Did Wiz Q mention it?");
       wizbSpeak("Well... no...");
       wizjSpeak("We asked! He wouldn't tell us. A wiz is a wiz, and we did what we asked.");
       playerSpeak("I going kill King Club, and take over his clubs.");
       wizbSpeak("Oh I will help you.");
       wizjSpeak("I will have to think about helping you. What would I do?");
       playerSpeak("You must merely give me locations of places in hell for I do not know hell as well as you.");
       wizjSpeak("Easy enough. Sure I will help.");
       playerSpeak("I have overthrown the Rock, Punk, and Classical clubs.");
       wizjSpeak("Go over to the Golf club now.");
       playerSpeak("The Golf club?");
       wizbSpeak("DO YOU WANT HIM TO GET KILLED WIZ J? KING CLUB'S USUALLY THERE. I know what you need to do. I am apprentice to Wiz A. I went to the electronic and dubstep clubs the other day with him for business. They are having a power loss there. The Dubstep Club has to be accessed by some special portal. I'd ask Wiz A for his Portal to it, but he's gone missing. Get to the electronic club.");
       hunterSpeak("Get the help you were looking for "+ name +"?");
       playerSpeak("They were more helpful and more willing than Wiz Q.");
       hunterSpeak("I still can't believe you killed Wiz Q! Wiz Q... Customer for 3,209 years!");
       //Area 18 Finished
       debug("Area 18 Completed");
    }
}
