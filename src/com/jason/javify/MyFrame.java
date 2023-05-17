package com.jason.javify;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public int width, height;
    public JPanel panel;

    public MyFrame() {
        super("Javify");
        setSize(512 + 10,960);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.width = getWidth();
        this.height = getHeight();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}