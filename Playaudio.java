import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Playaudio extends Applet implements ActionListener {
    Button play, stop, repeat;
    AudioClip audio;

    public void init(){
        play=new Button("Play");
        stop=new Button ("Stop");
        repeat=new Button("Repeat");
        audio=getAudioClip(getCodeBase(),"Audio.wav");
        add(play);
        add(stop);
        add(repeat);
        play.addActionListener(this);
        stop.addActionListener(this);
        repeat.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(play)){
            audio.play();
        }
        else if(e.getSource().equals(repeat)){
            audio.loop();
        }
        else{
            audio.stop();
        }
    }
public void stop(){
    audio.stop();
}

