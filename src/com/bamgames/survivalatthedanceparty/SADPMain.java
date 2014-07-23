package com.bamgames.survivalatthedanceparty;

import com.bamgames.survivalatthedanceparty.areaeight.AreaEightDialog;
import com.bamgames.survivalatthedanceparty.areafive.AreaFiveDialog;
import com.bamgames.survivalatthedanceparty.areaone.AreaOneDialog;
import com.bamgames.survivalatthedanceparty.areaseven.AreaSevenDialog;
import com.bamgames.survivalatthedanceparty.areatwo.AreaTwoDialog;

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
        //Program finishes and main action line goes to next action by default
        }else{
            nextArea();
        }
    }
    public static void main(String[] args)
    {
        openingQuote();
        AreaOneDialog.storyWelcome();
        AreaTwoDialog.dHouse();


        AreaFiveDialog.templeDialog();
        AreaSevenDialog.searchForClubHunter();
        AreaEightDialog.clubHunters();
    }
}
