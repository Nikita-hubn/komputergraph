package com.company;
import java.awt.*;
import javax.swing.*;
public class Pictrota extends JPanel{

    private Rectangle rectangle;


    public Pictrota() {

        rectangle = new Rectangle(500,100,50,50);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(Math.toRadians(45));
        g2.setColor(Color.MAGENTA);
        g2.fill(rectangle);

    }
}
