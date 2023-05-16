package com.jason.javify;

import java.awt.*;
import java.awt.event.MouseEvent;

public class CircleButton {

    public int x, y;
    public int radius;
    public boolean playing;

    public CircleButton(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.playing = false;

    }

    public void update(Graphics g){
        g.drawOval(x, y, radius*2, radius*2);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(x+30, y+25, x+30, y + radius*2 - 25 );
        g2.drawLine(x + radius*2 - 30, y+25, x + radius*2 - 30, y + radius*2 - 25 );
        g.drawPolygon(new int[] {x + 30, x + radius*2 - 20, x + 30}, new int[] {y + 25, y + radius, y + radius*2 - 25}, 3);
    }

    public boolean isClicked(MouseEvent e){
        double xDif = x + radius - e.getX();
        double yDif = y + radius - e.getY();
        double distanceSquared = xDif * xDif + yDif * yDif;
        boolean collision = distanceSquared < (radius + 1) * (radius + 1);
        return collision;
    }

    public boolean isPlaying(){
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}