package ru.mirea.LESSON_5.LAB.img;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Img extends JPanel {

    private BufferedImage image;
    private final String filepath;

    public Img(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        try {
            image = ImageIO.read(new File((filepath.equals("")) ? "src/ru/mirea/LESSON_5/LAB/img/LOGO.png" : filepath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        gr2d.drawImage(image, 50, 50, 300, 300, this);
    }
}
