package com.bamgames.survivalatthedanceparty.speaking;

import com.bamgames.survivalatthedanceparty.reference.Reference;

//This class is designed to help the dialog work easier

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
    public static void qSpeak(String saying)
    {
        System.out.println("???: " + saying);
    }
    public static void debug(String saying)
    {
        System.out.println("[DEBUG] " + saying);
    }
    public static void hunterSpeak(String saying) { System.out.println(Reference.hunter + ": " + saying); }
    public static void wizqSpeak(String saying) { System.out.println(Reference.wizq + ": " + saying); }

}
