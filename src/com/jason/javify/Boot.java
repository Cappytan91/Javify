package com.jason.javify;

import jaco.mp3.player.MP3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Boot {

    public JFrame frame;
    public CircleButton playButton;

    public static void main(String[] args){
        new Boot();
    }
    public Boot(){

        playButton = new CircleButton(100, 100, 25);
        
        frame = new MyFrame(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                playButton.update();
            }
        };

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(playButton.isClicked(e)){
                    System.out.println("Working");
                    new MP3Player(new File("src/com/jason/javify/music/vine-boom.mp3")).play();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        System.out.println(new File("src/com/jason/javify/music/").list().length);
        MP3Player m = new MP3Player(new File("src/com/jason/javify/music/vine-boom.mp3"));
        m.play();
        //m.setRepeat(true);

    }


}
