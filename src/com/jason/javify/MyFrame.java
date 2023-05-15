package com.jason.javify;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Javify");
        setSize(512,960);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}