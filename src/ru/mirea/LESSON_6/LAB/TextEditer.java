package ru.mirea.LESSON_6.LAB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TextEditer extends JFrame {

    public TextEditer() {
        super("Редактор текста");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setText("Угадай число от 0 до 20:");
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        JButton button = new JButton("Применить");

        JLabel textColor = new JLabel();
        textColor.setText("Выберите цвет вашего текста");

        JRadioButton Black = new JRadioButton("Черный");
        Black.setSelected(true);

        JRadioButton Red = new JRadioButton("Красный");
        Red.setSelected(false);

        JRadioButton Blue = new JRadioButton("Синий");
        Blue.setSelected(false);

        Black.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Red.setSelected(false);
                    Blue.setSelected(false);
                }
            }
        });

        Red.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Black.setSelected(false);
                    Blue.setSelected(false);
                }
            }
        });

        Blue.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Black.setSelected(false);
                    Red.setSelected(false);
                }
            }
        });

        JLabel textFont = new JLabel();
        textFont.setText("Выберите шрифт вашего текста");

        JRadioButton TNR = new JRadioButton("Times New Roman");
        TNR.setSelected(true);

        JRadioButton MSSS = new JRadioButton("MS Sans Serif");
        MSSS.setSelected(false);

        JRadioButton CN = new JRadioButton("Courier New");
        CN.setSelected(false);

        TNR.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    MSSS.setSelected(false);
                    CN.setSelected(false);
                }
            }
        });

        MSSS.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    TNR.setSelected(false);
                    CN.setSelected(false);
                }
            }
        });

        CN.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    MSSS.setSelected(false);
                    TNR.setSelected(false);
                }
            }
        });

        button.addActionListener(e -> {
            Color color;
            Font font;

            if (Black.isSelected()) {
                color = Color.BLACK;
            } else if (Red.isSelected()) {
                color = Color.RED;
            } else {
                color = Color.BLUE;
            }

            if (TNR.isSelected()) {
                font = new Font(TNR.getText(), Font.PLAIN, 15);
            } else if (MSSS.isSelected()) {
                font = new Font(MSSS.getText(), Font.PLAIN, 15);
            } else {
                font = new Font(CN.getText(), Font.PLAIN, 15);
            }

            textArea.setForeground(color);
            textArea.setFont(font);
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 4, 10, 10));

        panel.add(textColor);
        panel.add(Black);
        panel.add(Red);
        panel.add(Blue);
        panel.add(textFont);
        panel.add(TNR);
        panel.add(MSSS);
        panel.add(CN);
        panel.add(textArea);
        panel.add(button);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(600, 450));
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TextEditer frame = new TextEditer();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

}
