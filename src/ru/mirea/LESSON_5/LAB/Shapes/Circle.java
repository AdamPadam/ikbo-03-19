package ru.mirea.LESSON_5.LAB.Shapes;

import java.awt.*;

public class Circle extends Shape {

    private int radius;

    public Circle(Color color, String text, int x, int y, int radius) {
        super(color, text, x, y);
        this.radius = radius;
    }

    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), 2*radius, 2*radius);
        g.drawString(getText(), 10, 35);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
