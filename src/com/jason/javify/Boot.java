package com.jason.javify;

import jaco.mp3.player.MP3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Boot {

    public JFrame frame;

    public static void main(String[] args){
        new Boot();
    }
    public Boot(){
        frame = new MyFrame(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawOval(50, 50, 50, 50);
            }
        };

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(isClickingThePlayButton(e)){
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

    public boolean isClickingThePlayButton(MouseEvent e){
        double xDif = 50+25 - e.getX();
        double yDif = 50+25 - e.getY();
        double distanceSquared = xDif * xDif + yDif * yDif;
        boolean collision = distanceSquared < (25 + 1) * (25 + 1);
        return collision;
    }

}
