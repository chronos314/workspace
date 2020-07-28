package com.zzxx.holiday1;

/**
 * 方块类 - 实体类
 *  成员变量 - 位置:由行、列表示
 *  成员方法 - 左移、右移、下移
 */
public class Cell {
    private int row;//行
    private int col;//列

    // 构造方法重载
    public Cell(int a) {
        // 初始化成员变量
        row = a;
        col = a;
    }
    // 属性名与参数名重名时,使用this区分
    public Cell(int row, int col) {
        // 初始化成员变量
        //属性row = 参数row;
        this.row = row;
        this.col = col;
    }


    // 左移方法
    public void moveLeft() {
        col --;
    }
    // 右移方法
    public void moveRight() {
        col ++;
    }
    // 下移方法
    public void moveDown() {
        row ++;
    }
    // 方法重载:指定下移行数
    public void moveDown(int count) {
        row += count;
    }
    // 打印对象信息
    public void printCell() {
        System.out.println(row + ", " + col);
    }




    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
}
