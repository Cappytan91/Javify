package com.jason.javify;

import jaco.mp3.player.MP3Player;

import java.awt.*;
import java.io.File;

public class Song {

    private Image cover;
    private String name;
    private MP3Player song;

    public Song(Image cover, String name, double length){
        this.cover = cover;
        this.name = name;

        this.song = new MP3Player(new File("src/com/jason/javify/music/" + name));

    }

    public MP3Player getSong() {
        return song;
    }

    public Image getCover() {
        return cover;
    }

    public String getName() {
        return name;
    }
}
