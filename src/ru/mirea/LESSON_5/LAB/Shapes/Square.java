package ru.mirea.LESSON_5.LAB.Shapes;

import java.awt.*;

public class Square extends Rectangle {

    public Square(Color color, String text, int x, int y, int side) {
        super(color, text, x, y, side, side);
    }

    public int getSide() {
        return getWidth();
    }

    public void setSide(int side) {
        setWidth(side);
        setHeight(side);
    }

    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getSide(), getSide());
        g.drawString(getText(), 10, 35);
    }
}
