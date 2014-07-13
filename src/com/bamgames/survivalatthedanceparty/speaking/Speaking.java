package com.bamgames.survivalatthedanceparty.speaking;

import com.bamgames.survivalatthedanceparty.reference.Reference;

public class Speaking
{
    public static void guardSpeak(String saying)
    {
        System.out.println(Reference.doorGuard + ": " + saying);
    }
    public static void playerSpeak(String saying)
    {
        System.out.println(Reference.player + ": " + saying);
    }
    public static void wizardSpeak(String saying)
    {
        System.out.println(Reference.wizard + ": " + saying);
    }
    public static void moneSpeak(String saying)
    {
        System.out.println(Reference.mone + ": " + saying);
    }

}
