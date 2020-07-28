package com.zzxx.shoot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimerTask;

public class Main extends JPanel {
    public static BufferedImage hero0;
    public static BufferedImage hero1;//
    public static BufferedImage bee;
    public static BufferedImage bullet;
    public static BufferedImage airplane;
    public static BufferedImage bigplane;
    static {
        // 一次性读取图片
        try {
            hero0 = ImageIO.read(Main.class.getResourceAsStream("pic/hero0.png"));
            hero1 = ImageIO.read(Main.class.getResourceAsStream("pic/hero1.png"));
            bee = ImageIO.read(Main.class.getResourceAsStream("pic/bee.png"));
            bullet = ImageIO.read(Main.class.getResourceAsStream("pic/bullet.png"));
            airplane = ImageIO.read(Main.class.getResourceAsStream("pic/airplane.png"));
            bigplane = ImageIO.read(Main.class.getResourceAsStream("pic/bigplane.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 定义所有的飞行物对象 - 包括小蜜蜂\敌机\大敌机
    private ArrayList<FlyingObject> flyings;
    // 定义一个存放所有子弹的列表对象
    private ArrayList<Bullet> bullets;

    public Main() {
        flyings = new ArrayList<>();
        bullets = new ArrayList<>();
    }
    /*
    游戏开始的方法, 定时且重复的代码 -> 定时器
     */
    // import javax.swing.*;
    private java.util.Timer timer = new java.util.Timer();
    public void action() {
        // TimerTask -> 要重复执行的代码
        // long -> 定时器什么时候开始 (ms)
        // long -> 时间 间隔
        timer.schedule(new TimerTask(){
            public void run() {
                // 1.生成新的飞行物
                creatFlyingObject();
                // 2.飞行物移动
                flyingObjectStep();
                // 3.判断飞行物越界
                outOfBoundsAction();
                hero.move();
                // 4.发射子弹
                shootAction();
                // 5.子弹移动
                bulletStep();
                // 6.判断相撞
                bangAction();

                repaint(); // 重画 -> 重新调用paint方法
            }
        },100, 20);
    }
    // 子弹和飞行物相撞
    private void bangAction() {
        for (int i = 0; i < bullets.size(); i++) {
            for (int j = 0; j < flyings.size(); j++) {

            }
        }
    }

    private void bulletStep() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            b.move();
        }
    }

    // 发射子弹的方法
    private void shootAction() {
        /*
           本身界面中存在n个子弹, 存储子弹需要用到ArrayList
           hero.shoot() - 会得到1个或者2个子弹
           ArrayList.add()
         */
        Bullet[] bs = hero.shoot();
        for (int i = 0; i < bs.length; i++) {
            bullets.add(bs[i]);
        }
    }

    // 判断是否越界
    private void outOfBoundsAction() {
        for (int i = 0; i < flyings.size(); i++) {
            FlyingObject fly = flyings.get(i);
            if (fly.getY() >= Main.HEIGHT) {
                // 越界了, 就将这个飞行物移除掉
                flyings.remove(i);
                i --;
            }
        }
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (b.getY() <= -b.getHeight()) {
                bullets.remove(i);
                i--;
            }
        }
    }

    // 移动所有的飞行物
    private void flyingObjectStep() {
        for (int i = 0; i < flyings.size(); i++) {
            FlyingObject fly = flyings.get(i);
            fly.move();
        }
    }

    // 生成新的飞行物 (小蜜蜂,敌机,大敌机)
    private int flyingIndex = 0; // 控制生成频率
    private void creatFlyingObject() {
        flyingIndex++;
        if (flyingIndex % 20 == 0) {
            int ran = (int) (Math.random() * 20);
            FlyingObject fly ;
            if (ran == 0) {
                fly = new Bee();
            } else if (ran == 1 || ran == 2) {
                fly = new BigPlane();
            } else {
                fly = new Airplane();
            }
            flyings.add(fly);
        }

    }
    private Hero hero = new Hero();
    @Override
    public void paint(Graphics g) {
        // 清除绘画内容
        super.paint(g);
        // 测试----
        // 画一个英雄机
        g.drawImage(hero.getImg(), hero.getX(), hero.getY(), this);
        // 画所有的小蜜蜂,敌机,大敌机 flyings
        paintFlyingObjects(g);
        // 画所有的子弹
        paintBullets(g);
    }

    private void paintBullets(Graphics g) {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            g.drawImage(b.getImg(), b.getX(), b.getY(), this);
        }
    }

    private void paintFlyingObjects(Graphics g) {
        for (int i = 0; i < flyings.size(); i++) {
            FlyingObject fly = flyings.get(i);
            g.drawImage(fly.getImg(), fly.getX(), fly.getY(), this);
        }
    }
    public static final int WIDTH = 400;
    public static final int HEIGHT = 650;
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 调用父类的无参构造器, 调用Main的无参构造器
        Main main = new Main();
        window.add(main);
        // 尽快调用paint方法
        window.setVisible(true);

        // 调用游戏开始的方法
        main.action();
    }
}
