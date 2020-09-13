package ru.mirea.LESSON_5.LAB.Shapes;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    private int x;
    private int y;
    private Color color;
    private String text;

    public Shape(int x, int y, Color color, String text) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.text = text;
        setOpaque(false);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

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

    public int getXVar() {
        return x;
    }

    public void setXVar(int x) {
        this.x = x;
    }

    public int getYVar() {
        return y;
    }

    public void setYVar(int y) {
        this.y = y;
    }
}
