package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        for (int i = 0; i < 3; i++) {
            drawing(150 + i * 20, 40 + i * 20, graphics);
        }


    }

    //Draw 3 lines in 1 function
    /*public static int[] drawing (int x, int y, Graphics g) {
        int xPoly = 0;
        int yPoly = 0;
        int [] result = new int[4];
        for (int i = 0; i < 1; i++) {
            xPoly = (x+i);
            yPoly = (y+i);
            g.drawLine(xPoly, yPoly, WIDTH/2, HEIGHT/2);
            result = new int[]{xPoly, yPoly, WIDTH/2, HEIGHT/2};
        }

        return result;
    }*/

    //Draw 1 line in 1 function
    public static int[] drawing(int x, int y, Graphics g) {
        int[] result = new int[]{x, y, WIDTH / 2, HEIGHT / 2};
        g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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