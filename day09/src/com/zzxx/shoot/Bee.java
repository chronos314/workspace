package com.zzxx.shoot;

/*
小蜜蜂类
 */
public class Bee extends FlyingObject{
    private int x_speed,y_speed;
    public Bee() {
        super((int) (Math.random() * Main.WIDTH-Main.bee.getWidth()),
                - Main.bee.getHeight(),
                Main.bee);

        x_speed=1;
        y_speed=1;
    }

    @Override
    public void move(){
        // 先x变大, y变大,
        // x到最大值, x减小, y变大,
        setY(getY()+y_speed);
        setX(getX()+x_speed);
        if(getX()==Main.WIDTH-getWidth()-15){
            x_speed=-1;
        }else if (getX()==0){
            x_speed=1;
        }

    }
}
