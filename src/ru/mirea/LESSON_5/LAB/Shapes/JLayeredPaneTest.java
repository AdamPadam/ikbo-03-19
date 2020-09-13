package ru.mirea.LESSON_5.LAB.Shapes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JLayeredPaneTest extends JFrame {

    public static int i = 1;
    public static int nextX = 20;
    public static int nextY = 45;
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 450;

    public static Shape getRandomShape() {
        Random random = new Random();
        int width = random.nextInt(50) + 50;
        int height = random.nextInt(50) + 50;
        int x = nextX;
        int y = nextY;
        if (nextX + 130 <= WIDTH-130) {
            nextX += 130;
        } else {
            nextX = 20;
            nextY += 120;
        }
        Color color = getRandomColor(random.nextInt(10));
        switch (random.nextInt(3)) {
            case 0:
                return new Circle(x, y, color, "круг #" + i++, width / 2);
            case 1:
                return new Rectangle(x, y, color, "прям-к #" + i++, width, height);
            case 2:
                return new Square(x, y, color, "квадрат #" + i++, width);
        }
        return new Circle(x, y, color, "круг #" + i++, width / 2);
    }

    private static Color getRandomColor(int i) {
        switch (i) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.CYAN;
            case 3:
                return Color.GRAY;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.YELLOW;
            case 6:
                return Color.LIGHT_GRAY;
            case 7:
                return Color.MAGENTA;
            case 8:
                return Color.ORANGE;
            case 9:
                return Color.PINK;
        }
        return Color.RED;
    }

    public JLayeredPaneTest() {
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        for (int j = 0; j < 20; j++) {
            Shape figure = getRandomShape();
            figure.setBounds(0, 0, WIDTH, HEIGHT);
            lp.add(figure);
        }
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JLayeredPaneTest();
    }
}
