package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {

        int startX = WIDTH/3;
        int startY = HEIGHT/3;
        int width = WIDTH/3;
        int height = HEIGHT/3;

        drawSquare(startX, startY, width, height, graphics, 5);

    }


    public static void drawSquare(int startX, int startY, int width, int height, Graphics g, int level) {
        if (level < 0){
            return;
        }
        g.setColor(Color.BLACK);
        g.fillRect(startX, startY, width, height);
        //left
        drawSquare(startX - width + width/3, startY + height/3, width/3, height/3, g, level -1);
        //right
        drawSquare(startX + width + width/3, startY + height/3, width/3, height/3, g, level -1);
        //top
        drawSquare(startX + width/3 , startY - height + height/3, width/3, height/3, g, level -1);
        //bottom
        drawSquare(startX + width/3, startY + height + height/3, width/3, height/3, g, level -1);
        //top left
        drawSquare(startX - width + width/3, startY - height + height/3, width/3, height/3, g, level -1);
        //bottom left
        drawSquare(startX - width + width/3, startY + height + height/3, width/3, height/3, g, level -1);
        //top right
        drawSquare(startX + width + width/3, startY - height + height/3, width/3, height/3, g, level -1);
        // bottom right
        drawSquare(startX + width + width/3, startY + height + height/3, width/3, height/3, g, level -1);
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
