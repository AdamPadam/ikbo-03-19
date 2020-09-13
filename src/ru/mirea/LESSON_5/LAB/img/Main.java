package ru.mirea.LESSON_5.LAB.img;

import javax.swing.*;

public class Main extends JFrame {

    public Main(String[] args) {
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
            Img img = new Img((args.length > 0) ? args[0] : "");
            img.setBounds(0, 0, 850, 450);
            lp.add(img);
        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main(args);
    }
}
