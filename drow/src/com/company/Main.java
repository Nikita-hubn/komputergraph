package com.company;

import java.awt.*;
import java.awt.GridBagLayout;
import javax.swing.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var=scanner.nextInt();
JFrame frame=new JFrame();
frame.setSize(new Dimension(1000,1000));
frame.setLocationRelativeTo(null);
frame.setLayout(new GridBagLayout());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

Pict panel=new Pict();
Pictrota panel2=new Pictrota();
if (var == 0){
    frame.add(panel2,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,
            new Insets(2,2,2,2),0,0));
}
else
frame.add(panel,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,
        new Insets(2,2,2,2),0,0));
    }
}
