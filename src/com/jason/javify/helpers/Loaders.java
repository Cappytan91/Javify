package com.jason.javify.helpers;

import com.jason.javify.Song;

import java.io.File;
import java.util.ArrayList;

public class Loaders {

    public static ArrayList<Song> loadSongs(){
        ArrayList<Song> tempList = new ArrayList<Song>();

        for (int i = 0; i < new File("src/com/jason/javify/music/").list().length; i++) {
            tempList.add(new Song(null, new File("src/com/jason/javify/music/").listFiles()[i].getName()));
            System.out.println(tempList.get(i).getName());
        }

        return tempList;
    }

}
