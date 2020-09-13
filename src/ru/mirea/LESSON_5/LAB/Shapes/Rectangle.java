package ru.mirea.LESSON_5.LAB.Shapes;

import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, Color color, String text, int width, int height) {
        super(x, y, color, text);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(getColor());
        gr2d.fillRect(getXVar(), getYVar(), width, height);
        gr2d.setColor(Color.BLACK);
        gr2d.drawString(getText(), getXVar() + width/3, getYVar() + height/3);
    }
}
