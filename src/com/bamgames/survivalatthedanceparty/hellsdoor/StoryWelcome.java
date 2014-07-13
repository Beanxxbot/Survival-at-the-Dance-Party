package com.bamgames.survivalatthedanceparty.hellsdoor;

import static com.bamgames.survivalatthedanceparty.speaking.Speaking.guardSpeak;

public class StoryWelcome
{
    public static void storyWelcome()
    {
        System.out.println("???: Hey! Hey you!");
        System.out.println("???: Yeah yeah, over here! By the door marked 'hell'!");
        System.out.println("???: Hello, my name");
        guardSpeak("Hi!");
    }
}
