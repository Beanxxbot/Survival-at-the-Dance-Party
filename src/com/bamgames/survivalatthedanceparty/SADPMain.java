package com.bamgames.survivalatthedanceparty;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SADPMain
{
    static ActionListener listener = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

        }
    };
    static Timer timer = new Timer(1000, listener);

    public static void SADPMain()
    {
        timer.start();
        if (timer.isRunning())
        {
            System.out.println("Running");
        }
        else
        {
            System.out.println("Not Running");
        }
        //System.out.println("Timer");
    }
    public static void main(String[] args)
    {
        SADPMain();
    }
}
