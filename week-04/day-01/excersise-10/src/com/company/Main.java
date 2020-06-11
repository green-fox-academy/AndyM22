package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        for (int i = 0; i < 7; i++) {
            Color red = new Color(255, 0, 0);
            Color orange = new Color(255, 165, 0);
            Color yellow = new Color(255, 255, 0);
            Color green = new Color(0, 128, 0);
            Color blue = new Color(0, 0, 255);
            Color indigo = new Color(75, 0, 130);
            Color violet = new Color(238, 130, 238);
            if (i == 0) {
                drawing(WIDTH, red, graphics);
            } else if (i == 1){
                drawing(WIDTH-WIDTH/7, orange, graphics);
            } else if (i == 2) {
                drawing(WIDTH-i*(WIDTH/7), yellow, graphics);
            } else if (i == 3) {
                drawing(WIDTH-i*(WIDTH/7), green, graphics);
            }else if (i == 4) {
                drawing(WIDTH-i*(WIDTH/7), blue, graphics);
            }else if (i == 5) {
                drawing(WIDTH-i*(WIDTH/7), indigo, graphics);
            } else {
                drawing(WIDTH-i*(WIDTH/7), violet, graphics);
            }
        }


    }


    public static int[] drawing(int x, Color fillColor, Graphics g) {
        g.setColor(fillColor);
        g.fillRect(WIDTH / 2 - x / 2, HEIGHT / 2 - x / 2, x, x);
        int[] result = new int[]{((WIDTH / 2) - (x / 2)), ((HEIGHT / 2) - (x / 2)), x, x};
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