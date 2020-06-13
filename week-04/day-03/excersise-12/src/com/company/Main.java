package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]


        int size = 10;
        int previousSize = 0;
        for (int i = 0; i < 6; i++) {
            drawing(size + previousSize + size*i, size + i * size, graphics); //10 + 0 + 10*0// 10 + 0 + 10*1// 10 + 10 + 10*2// 10 + 30 + 10*3//
            previousSize += size*i;//0 + (10*0) = 0// 0 + (10*1) = 10// 10 + (10*2) = 30// 30 + (10*3) = 60
        }

    }

    public static int[] drawing(int x, int y, Graphics g){
        Color violet = new Color(238, 130, 238);
        g.setColor(violet);
        g.fillRect(x, x, y, y);
        g.setColor(Color.BLACK);
        g.drawRect(x, x, y, y);
        int[] result = new int[]{x, x, y, y};
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