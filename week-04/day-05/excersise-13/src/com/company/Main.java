package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.


        int size = 320/8;

        for (int i = 0; i < 4 ; i++) {
            drawingWhite(size*i*2, 0, size, graphics);
        }
        for (int i = 0; i < 4; i++) {
            drawingWhite(size + size*i*2, size, size, graphics);
        }

        for (int i = 0; i < 4 ; i++) {
            drawingWhite(size*i*2, size*2, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingWhite(size + size*i*2, size*3, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingWhite(size*i*2, size*4, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingWhite(size + size*i*2, size*5, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingWhite(size*i*2, size*6, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingWhite(size + size*i*2, size*7, size, graphics);
        }


        for (int i = 0; i < 4 ; i++) {
            drawingBlack(size + size*i*2, 0, size, graphics);
        }
        for (int i = 0; i < 4; i++) {
            drawingBlack(size*i*2, size, size, graphics);
        }

        for (int i = 0; i < 4 ; i++) {
            drawingBlack(size + size*i*2, size*2, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingBlack(size*i*2, size*3, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingBlack(size + size*i*2, size*4, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingBlack(size*i*2, size*5, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingBlack(size + size*i*2, size*6, size, graphics);
        }

        for (int i = 0; i < 4; i++) {
            drawingBlack(size*i*2, size*7, size, graphics);
        }


    }

    public static int[] drawingWhite(int x, int y, int size, Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, size, size);
        int[] result = new int[]{x, y, size, size};
        return result;
    }

    public static int[] drawingBlack(int x, int y, int size, Graphics g){
        g.setColor(Color.BLACK);
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