package ru.mirea.LESSON_5.LAB.gif;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GIF {

    private JFrame frame;
    private static String filename = "src/ru/mirea/LESSON_5/LAB/img/LOGO.png";

    public static void main(String[] args) {
        new GIF().go();
    }

    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setSize(650, 460);
        startGIF();
    }

    static class DrawPanel extends JPanel {
        private BufferedImage image;

        public void paintComponent(Graphics g) {
            Graphics2D gr2d = (Graphics2D) g;
            try {
                image = ImageIO.read(new File(filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
            gr2d.drawImage(image, 50, 50, 545, 351, this);
        }
    }

    private int index = 0;
    private static final String PATH = "src/ru/mirea/LESSON_5/LAB/img/";
    String[] imgs = {"IIT.png", "INTEGU.png", "KBSP.png", "KIB.png"};

    private void startGIF() {
        while (true) {
            filename = PATH + imgs[index];
            index = (index + 1) % 4;
            try {
                Thread.sleep(400);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            frame.repaint();
        }
    }
}
