package com.bamgames.survivalatthedanceparty;

import com.bamgames.survivalatthedanceparty.area1.Dialog;
public class SADPMain
{
    //In Window Make Screen Black
    public static void openingQuote()
    {
        System.out.println("Hell is a big party. The reason why it has such a bad reputation is because the devil doesn't want everyone going to hell. It's an exclusive party...");
    }
    public static void main(String[] args)
    {
        openingQuote();
        Dialog.storyWelcome();
    }
}
