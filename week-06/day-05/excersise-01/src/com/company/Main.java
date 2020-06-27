package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {

        int startX = WIDTH/4;
        int startY = HEIGHT/4;
        int width = WIDTH/2;
        int height = HEIGHT/2;

        drawSquare(startX, startY, width, height, graphics, 4);

    }


    public static void drawSquare(int startX, int startY, int width, int height, Graphics g, int level) {
        if (level < 0){
            return;
        }
        g.setColor(Color.BLACK);
        g.drawRect(startX, startY, width, height);
        //top left
        drawSquare(startX - width/4, startY - height/4, width/2, height/2, g, level -1);
        //bottom left
        drawSquare(startX - width/4, startY + height - height/4, width/2, height/2, g, level -1);
        //top right
        drawSquare(startX + width - width/4 , startY - height/4, width/2, height/2, g, level -1);
        //bottom right
        drawSquare(startX + width - width/4, startY + height - height/4, width/2, height/2, g, level -1);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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