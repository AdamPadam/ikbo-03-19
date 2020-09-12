package ru.mirea.LESSON_5.LAB.Shapes;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    private int x;
    private int y;
    private Color color;
    private String text;

    Shape(Color color, String text, int x, int y) {
        this.color = color;
        this.text = text;
        this.x = x;
        this.y = y;
        setOpaque(false);
    }

    protected abstract void paintComponent(Graphics g);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
