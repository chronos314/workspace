package com.zzxx.day09;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class HeroTest extends JPanel{
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    public static BufferedImage bee;
    public static BufferedImage airplane;
    public static BufferedImage bigplane;
    static {
        try {
            hero0 = ImageIO.read(HeroTest.class.getResourceAsStream("shooter/hero0.png"));
            hero1 = ImageIO.read(HeroTest.class.getResourceAsStream("shooter/hero1.png"));
            bee = ImageIO.read(HeroTest.class.getResourceAsStream("shooter/bee.png"));
            airplane= ImageIO.read(HeroTest.class.getResourceAsStream("shooter/airplane.png"));
            bigplane= ImageIO.read(HeroTest.class.getResourceAsStream("shooter/bigplane.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        paintPlane(g);
        Hero hero=new Hero();
        g.drawImage(hero.getImg(),hero.getX(),hero.getY(),this);
        Bee bee=new Bee();
        g.drawImage(bee.getImg(),bee.getX(),bee.getY(),this);
        Airplane air=new Airplane();
        g.drawImage(air.getImg(),air.getX(),air.getY(),this);
        BigPlane big=new BigPlane();
        g.drawImage(big.getImg(),big.getX(),big.getY(),this);
    }

    public static void main(String[] args) {
        JFrame window=new JFrame();
        window.setSize(400,650);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel h=new HeroTest();
        window.add(h);
        window.setVisible(true);
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
