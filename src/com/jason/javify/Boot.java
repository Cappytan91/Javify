package com.jason.javify;

import jaco.mp3.player.MP3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

import static com.jason.javify.helpers.Loaders.loadSongs;

public class Boot {

    public JFrame frame;
    public CircleButton playButton;
    public ArrayList<Song> songs;
    public int index;

    public static void main(String[] args){
        new Boot();
    }
    public Boot(){
        this.songs = loadSongs();
        this.index = 0;
        playButton = new CircleButton(512 / 2 - 50, 700, 50);

        frame = new MyFrame(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                playButton.update(g);
            }
        };

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(playButton.isClicked(e) && !playButton.isPlaying()){
                    System.out.println("Working");
                    songs.get(2).getSong().play();
                    playButton.setPlaying(true);
                }else{
                    songs.get(2).getSong().pause();
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

    }


}
