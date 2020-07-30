package com.zzxx.day09;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
//背景图片
public class DemoPlane {
    public static void main(String[] args) {
        JFrame window=new JFrame("飞机大战");
        window.setSize(400,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        MyPainl p= new MyPainl();

        window.add(p);
        window.setVisible(true);
    }
}
class MyPainl extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Font font=new Font("微软雅黑",3,15);
        g.setFont(font);
        Color color=new Color(255,255,255);
        g.setColor(color);
        g.drawString("HelloWorld!",10,20);
        paintPlane(g);
    }
    private void paintPlane(Graphics g){
        BufferedImage img=null;
        try {
            img= ImageIO.read(DemoPlane.class.getResourceAsStream("shooter/background.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(img,0,0,this);
    }
}

