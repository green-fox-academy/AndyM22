package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {


        int osaX = WIDTH / 15;
        int osaY = HEIGHT / 15;
        for (int i = 1; i < 15; i++) {
            drawingGreen(osaX * i, WIDTH, 0, osaY * i, graphics);
        }

        for (int i = 1; i < 15; i++) {
            drawingMagenta(HEIGHT, osaY * i, osaX * i, 0, graphics);

        }


    }


    public static int[] drawingGreen(int x1, int y1, int x2, int y2, Graphics g) {
        g.setColor(Color.GREEN);
        g.drawLine(x1, y1, x2, y2);
        int[] result = new int[]{x1, y1, x2, y2};
        return result;
    }

    public static int[] drawingMagenta(int x1, int y1, int x2, int y2, Graphics g) {
        g.setColor(Color.MAGENTA);
        g.drawLine(x1, y1, x2, y2);
        int[] result = new int[]{x1, y1, x2, y2};
        return result;
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setBackground(Color.WHITE);
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