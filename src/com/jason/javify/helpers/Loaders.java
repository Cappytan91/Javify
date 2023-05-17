package com.jason.javify.helpers;

import com.jason.javify.Song;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.images.Artwork;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Loaders {

    public static ArrayList<Song> loadSongs(){
        ArrayList<Song> tempList = new ArrayList<Song>();

        for (int i = 0; i < new File("src/com/jason/javify/music/").list().length; i++) {
            try {
                //Image mp3 = new MP3File(new File("src/com/jason/javify/music/" + new File("src/com/jason/javify/music/").listFiles()[i].getName()));
                tempList.add(new Song(/*(BufferedImage) mp3.getTag().getFirstArtwork()*/ null, new File("src/com/jason/javify/music/").listFiles()[i].getName()));
                System.out.println(tempList.get(i).getName());
            }catch (Exception e){
                System.out.println("you suck, you need to fix this:\n" + e);
            }
        }

        return tempList;
    }

    public static void getIMG(){

    }

}
