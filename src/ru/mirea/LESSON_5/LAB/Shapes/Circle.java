package ru.mirea.LESSON_5.LAB.Shapes;

import java.awt.*;

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, Color color, String text, int radius) {
        super(x, y, color, text);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(getColor());
        gr2d.fillOval(getXVar(), getYVar(), 2*radius, 2*radius);
        gr2d.setColor(Color.BLACK);
        gr2d.drawString(getText(), getXVar() + 2*radius/3, getYVar() + 2*radius/3);
    }
}
