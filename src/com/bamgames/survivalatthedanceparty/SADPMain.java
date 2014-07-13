package com.bamgames.survivalatthedanceparty;

import com.bamgames.survivalatthedanceparty.area1.Dialog;
import com.bamgames.survivalatthedanceparty.area2.Dialog2;

import java.util.Scanner;

public class SADPMain
{
    //In Window Make Screen Black
    public static void openingQuote()
    {
        System.out.println("Hell is a big party. The reason why it has such a bad reputation is because the devil doesn't want everyone going to hell. It's an exclusive party...");
    }
    public static void nextArea()
    {
        System.out.println("Display next Area?");
        Scanner ready = new Scanner(System.in);
        String check = ready.nextLine();
        if(check.equals("yes")){

        }else{
            nextArea();
        }
    }
    public static void main(String[] args)
    {
        openingQuote();
        Dialog.storyWelcome();
        Dialog2.hello();
    }
}
