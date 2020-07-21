package com.zzxx.shoot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimerTask;

public class Main extends JPanel{
    private int flyingIndex=0;//控制频率
    private int grade=0;

    public static BufferedImage hero0;
    public static BufferedImage hero1;
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
    public Main(){
        flyings=new ArrayList<>();
        bullets=new ArrayList<>();
    }
    private ArrayList<FlyingObject> flyings;
    private ArrayList<Bullet> bullets;

    //生成飞行物对象
    private void creatFlyingOnject(){
        flyingIndex++;
        if(flyingIndex%50==0){
            int ran=(int)(Math.random()*20);
            FlyingObject fly;
            if (ran == 0) {
                fly=new Bee();
            }else if (ran==1|ran==2){
                fly=new BigPlane();
            }else {
                fly=new Airplane();
            }
            flyings.add(fly);
        }
    }
    // 画一个小蜜蜂
//    Bee b = new Bee();
    // 画一个英雄机
    Hero hero = new Hero();
    //敌机
//    Airplane air=new Airplane();


    @Override
    public void paint(Graphics g) {
        // 清除绘画内容
        super.paint(g);
        //画背景图片
        try {
            BufferedImage img=ImageIO.read(Main.class.getResourceAsStream("pic/background.png"));
            g.drawImage(img, 0, 0, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //分数
        Font font = new Font("Comic Sans MS", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.GRAY);
        g.drawString("Grade:"+ grade, 8, 40);
        g.drawString("Blood:"+ Blood, 8, 65);
        //画所有飞行类
        paintFlyings(g);
        //画英雄机
        g.drawImage(hero.getImg(), hero.getX(), hero.getY(), this);



    }
    //画飞行物
    private void paintFlyings(Graphics g){
        for (int i = 0; i <flyings.size(); i++) {
            FlyingObject fly=flyings.get(i);
            g.drawImage(fly.getImg(),fly.getX(),fly.getY(),this);
        }
        for (int i = 0; i <bullets.size(); i++) {
            Bullet fly=bullets.get(i);
            g.drawImage(fly.getImg(),fly.getX(),fly.getY(),this);
        }
    }
    public void action(){
        java.util.Timer timer=new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                hero.move();
                //生成飞行物
                creatFlyingOnject();
                //移动飞行物
                FlyingObjectStep();
                //判断是否越界
                outOfBoundsAction();
                //发射子弹
                shootAction();
                //子弹击中飞行物
                estimateHit();
                estimateBlood();
                repaint();
            }
        },100,10);

        MouseAdapter adapter=new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                int mouse_x=e.getX();
                int mouse_y=e.getY();
                hero.setX(mouse_x-hero0.getWidth()/2);
                hero.setY(mouse_y-hero0.getHeight()/2);
                repaint();
            }
        };
        this.addMouseListener(adapter);
        this.addMouseMotionListener(adapter);

    }
    //飞行物移动
    private void FlyingObjectStep(){
        for (int i = 0; i <flyings.size() ; i++) {
            FlyingObject fly=flyings.get(i);
            fly.move();
        }
        for (int i = 0; i <bullets.size() ; i++) {
            Bullet fly=bullets.get(i);
            fly.move();
        }
    }
    //判断飞行物越界
    private void outOfBoundsAction() {
        for (int i=0;i<flyings.size();i++){
            FlyingObject fly=flyings.get(i);
            if (fly.getY()>Main.HEIGHT-fly.getHeight()){
                flyings.remove(i);
                i--;
            }
        }for (int i=0;i<bullets.size();i++){
            Bullet fly=bullets.get(i);
            if (fly.getY()<0){
                bullets.remove(i);
                i--;
            }
        }
    }
    //发射子弹的方法
    private int bulletIndex=0;
    private void shootAction(){
        bulletIndex++;
        if (bulletIndex%25==0){
            Bullet[] bs=hero.shoot();
            for (int i = 0; i <bs.length ; i++) {
                bullets.add(bs[i]);
            }
        }
    }
    //记录击中大敌机的子弹数
    private int bigNumber=0;
    //判断子弹击中敌机
    private void estimateHit(){
        for (int i = 0; i <bullets.size(); i++) {
            for (int j = 0; j < flyings.size(); j++) {
                if (flyings.get(j)instanceof BigPlane
                        &&bullets.get(i).getY()<(flyings.get(j).getY()+flyings.get(j).getHeight())
                        &&bullets.get(i).getY()>flyings.get(j).getY()
                        &&(bullets.get(i).getX())>flyings.get(j).getX()
                        &&(bullets.get(i).getX())<(flyings.get(j).getX()+flyings.get(j).getWidth())){
                    bigNumber++;
                    if (bigNumber== ((BigPlane) flyings.get(j)).getBlood()){
                        bigNumber=0;
                        flyings.remove(j);
                    }
                    bullets.remove(i);
                    i--;
                    grade+=3;
                    break;
                }
                if (bullets.get(i).getY()<(flyings.get(j).getY()+flyings.get(j).getHeight())
                        && bullets.get(i).getY()>flyings.get(j).getY()
                        && (bullets.get(i).getX())>flyings.get(j).getX()
                        && (bullets.get(i).getX())<(flyings.get(j).getX()+flyings.get(j).getWidth())){
                    flyings.remove(j);
                    bullets.remove(i);
                    i--;
                    grade++;
                    break;
                }
            }
        }
    }
    private int Blood=hero.getLife();
    //判断英雄机血量
    private void estimateBlood(){
        for (int i = 0; i <bullets.size() ; i++) {
            for (int j = 0; j <flyings.size() ; j++) {
                if (flyings.get(j).getX()>hero.getX()-flyings.get(j).getWidth()
                    &&flyings.get(j).getX()+flyings.get(j).getWidth()<hero.getX()+hero.getWidth()+flyings.get(j).getWidth()
                    &&flyings.get(j).getY()>hero.getY()-flyings.get(j).getHeight()
                    &&flyings.get(j).getY()<hero.getY()+hero.getHeight()){
                    Blood--;
                    flyings.remove(j);
                    break;
                }
            }
        }
    }

    public static final  int WIDTH=400;
    public static final  int HEIGHT=650;
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("飞机大战");
        // 调用父类的无参构造器, 调用Main的无参构造器
        Main main = new Main();
        main.action();


        window.add(main);
        // 尽快调用paint方法
        window.setVisible(true);
    }
}
