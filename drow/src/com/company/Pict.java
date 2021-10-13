package com.company;

import java.awt.*;
import javax.swing.*;

public class Pict extends JPanel{

private Rectangle rectangle;

    public Pict(){
        rectangle=new Rectangle(300,300,50,50);
    }
@Override
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.MAGENTA);
        g2.fill(rectangle);
move(g2,50,50,300,300);
mashtab(g2,50,50,300,300);
tynutX(g2,50,50,300,300);
tynutY(g2,50,50,300,300);
}
public void move(Graphics g,int sh,int vys,int x,int y){
    Rectangle kv=new Rectangle(x,y,sh,vys);
        int range=100;
        kv.setRect(kv.getX()+range,kv.getY()+range,kv.getWidth(),kv.getHeight());
    Graphics2D g2=(Graphics2D) g;
    g2.setColor(Color.GREEN);
    g2.fill(kv);
}
    public void mashtab(Graphics g,int sh,int vys,int x,int y){
        Rectangle kv=new Rectangle(x,y,sh,vys);
        int range=2;
        kv.setRect(kv.getX(),kv.getY(),kv.getWidth()*range,kv.getHeight()*range);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.RED);
        g2.draw(kv);
    }
    public void tynutX(Graphics g,int sh,int vys,int x,int y){
        Rectangle hp=new Rectangle(x,y,sh,vys);
        hp.setRect(hp.getX()+200,hp.getY()-200,hp.getWidth()*2,hp.getHeight());
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fill(hp);
    }
    public void tynutY(Graphics g,int sh,int vys,int x,int y){
        Rectangle kv=new Rectangle(x,y,sh,vys);
        kv.setRect(kv.getX()-200,kv.getY()-200,kv.getWidth(),kv.getHeight()*2);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fill(kv);
    }
}
