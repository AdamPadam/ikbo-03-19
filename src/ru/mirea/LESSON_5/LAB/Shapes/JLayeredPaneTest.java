package ru.mirea.LESSON_5.LAB.Shapes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JLayeredPaneTest extends JFrame {

    public static int i = 1;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    public static Shape getRandomShape() {
        Random random = new Random();
        int width = random.nextInt(WIDTH/15);
        int height = random.nextInt(HEIGHT/15);
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        String text = "shape #" + i++;
        Color color = getRandomColor(random.nextInt(10));
        switch (random.nextInt(3)) {
            case 0:
                return new Circle(color, text, x, y, width/2);
            case 1:
                return new Rectangle(color, text, x, y, width, height);
            case 2:
                return new Square(color, text, x, y, width);
        }
        return new Circle(color, text, x, y, width/2);
    }

    private static Color getRandomColor(int i) {
        switch (i) {
            case 0: return Color.BLACK;
            case 1: return Color.BLUE;
            case 2: return Color.CYAN;
            case 3: return Color.GRAY;
            case 4: return Color.GREEN;
            case 5: return Color.YELLOW;
            case 6: return Color.LIGHT_GRAY;
            case 7: return Color.MAGENTA;
            case 8: return Color.ORANGE;
            case 9: return Color.PINK;
        }
        return Color.RED;
    }

    public JLayeredPaneTest() {
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        Shape figure1 = getRandomShape();
        Shape figure2 = getRandomShape();
        Shape figure3 = getRandomShape();
        // определение местоположения фигур в окне
        figure1.setBounds(10, 40, 120, 120);
        figure2.setBounds(60, 120, 160, 180);
        figure3.setBounds(90, 55, 250, 180);
        lp.add(figure1, JLayeredPane.POPUP_LAYER);
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure3, JLayeredPane.PALETTE_LAYER);
        lp.setPosition(figure3, 0);
        setSize(280, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JLayeredPaneTest();
    }
}
