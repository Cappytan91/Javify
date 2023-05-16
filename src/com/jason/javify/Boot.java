package com.jason.javify;

import jaco.mp3.player.MP3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Timer;

import static com.jason.javify.helpers.Loaders.loadSongs;

public class Boot {

    public JFrame frame;
    public CircleButton playButton;
    public ArrayList<Song> songs;
    public int index;
    public JPanel panel;

    public static void main(String[] args){
        new Boot();
    }
    public Boot(){
        this.songs = loadSongs();
        this.index = 0;
        this.panel = new JPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                playButton.update(g);
            }
        };
        playButton = new CircleButton(512 / 2 - 50, 700, 50);

        frame = new MyFrame();
        frame.add(panel);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(playButton.isClicked(e) && !playButton.isPlaying()){
                    System.out.println("Working");
                    songs.get(index).getSong().play();
                    playButton.setPlaying(true);
                }else{
                    songs.get(index).getSong().pause();
                    playButton.setPlaying(false);
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
        Timer timer = new Timer(40, taskPerformer);
        timer.start();
        //updater();
    }

    public void updater(){
        panel.repaint();
        //System.out.println("Heylaskdnlas");

    }

    ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            //...Perform a task...
            updater();
        }
    };


}
