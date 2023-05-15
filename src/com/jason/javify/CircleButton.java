package com.jason.javify;

import java.awt.*;
import java.awt.event.MouseEvent;

public class CircleButton {

    public int x, y;
    public int radius;

    public CircleButton(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public void update(Graphics g){
        g.drawOval(x, y, radius*2, radius*2);
    }

    public boolean isClicked(MouseEvent e){
        double xDif = x + radius - e.getX();
        double yDif = y + radius - e.getY();
        double distanceSquared = xDif * xDif + yDif * yDif;
        boolean collision = distanceSquared < (radius + 1) * (radius + 1);
        return collision;
    }

}