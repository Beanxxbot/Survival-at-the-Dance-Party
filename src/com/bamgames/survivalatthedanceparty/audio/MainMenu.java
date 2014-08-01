package com.bamgames.survivalatthedanceparty.audio;


import javax.sound.sampled.*;

public class MainMenu{
    private AudioInputStream audio;
    private AudioFormat format;
    private SourceDataLine line;
    private Clip clip;
    public MainMenu(){
        //WILL BE ADDRESSED LATER IN DEVELOPMENT
        //input();
        //createOutput();
        //checkDuration();
        //play();
    }
    public void input(){
    try{
        String s = "/audio/hello.aiff";
                //Possibly do .getResource()
        audio = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(s));
        format = audio.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        if(!AudioSystem.isLineSupported(info)){
            System.out.println("System does not support "+ format);
        }
        clip = (Clip) AudioSystem.getLine(info);
        clip.addLineListener((LineListener) this);
        clip.open(audio);
        clip.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    public void createOutput(){
        try{
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            if(!AudioSystem.isLineSupported(info)){
                System.out.println("System does not support "+ format);
                System.exit(0);
            }
            line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(format);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void checkDuration(){
        double duration = ((audio.getFrameLength()*1000)/audio.getFormat().getFrameSize())/1000;
    }
    public void play(){
        boolean numread = false;
        int numread2 = 0;
        byte[] buffer = new byte[line.getBufferSize()];
        line.start();
        try{
            int offset;
            while((numread = audio.read(buffer,0,buffer.length) >= 0)){
                offset = 0;
                while(offset < numread2){
                    offset += line.write(buffer, offset, numread2-offset);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        line.drain();
        line.stop();
        line.close();
    }
}
