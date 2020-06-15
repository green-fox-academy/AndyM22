package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.


        int size = 320 / 8;

        int i = 0;
        if (i % 2 == 0) {
            for (i = 0; i <= 8; i++) { //i určuje počet řádků (osu y)
                for (int j = 0; j <= 8; j++) { //j určuje počet sloupců (osu x)
                    drawingWhite(size * j * 2, size * i * 2, size, graphics);
                }
            }
        }
        if (i % 2 != 0) {
            for (i = 0; i <= 8; i++) {
                for (int j = 0; j <= 8; j++) {
                    drawingWhite(size * j * 2 + size, size * i * 2 + size, size, graphics);
                }

            }
        }
    }


    public static int[] drawingWhite(int x, int y, int size, Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, size, size);
        int[] result = new int[]{x, y, size, size};
        return result;
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
