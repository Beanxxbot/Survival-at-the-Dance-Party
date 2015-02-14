package com.bamgames.survivalatthedanceparty.util;

import java.util.Scanner;

import static com.bamgames.survivalatthedanceparty.util.Speaking.*;

public class NamePrompt
{
    static Scanner namePrompt = new Scanner(System.in);
    public static String playerName = namePrompt.next();
}
