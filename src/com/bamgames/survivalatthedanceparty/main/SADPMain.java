package com.bamgames.survivalatthedanceparty.main;

import com.bamgames.survivalatthedanceparty.areaeight.AreaEightDialog;
import com.bamgames.survivalatthedanceparty.areaeighteen.AreaEighteenDialog;
import com.bamgames.survivalatthedanceparty.areafive.AreaFiveDialog;
import com.bamgames.survivalatthedanceparty.areafourteen.AreaFourteenDialog;
import com.bamgames.survivalatthedanceparty.areaone.AreaOneDialog;
import com.bamgames.survivalatthedanceparty.areaseven.AreaSevenDialog;
import com.bamgames.survivalatthedanceparty.areasixteen.AreaSixteenDialog;
import com.bamgames.survivalatthedanceparty.areaten.AreaTenDialog;
import com.bamgames.survivalatthedanceparty.areatwelve.AreaTwelveDialog;
import com.bamgames.survivalatthedanceparty.areatwenty.AreaTwentyDialog;
import com.bamgames.survivalatthedanceparty.areatwo.AreaTwoDialog;

import javax.swing.*;
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
//        openingQuote();
//        AreaOneDialog.storyWelcome();
//        AreaTwoDialog.dHouse();
//
//
//        AreaFiveDialog.templeDialog();
//        AreaSevenDialog.searchForClubHunter();
//        AreaEightDialog.clubHunters();
//
//        AreaTenDialog.storyOfTheClubs();
//
//        AreaTwelveDialog.surprise();
//
//        AreaFourteenDialog.kingClub();
//
//        AreaSixteenDialog.runDownTown();
//
//        AreaEighteenDialog.theWizQAmbush();
//
//        AreaTwentyDialog.doorGuardDropsBy();
        JFrame window = new JFrame("Survival at the Dance Party");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setVisible(true);
    }
}
