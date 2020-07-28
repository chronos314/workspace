package com.zzxx.holiday1;

/**
 * 7种图形相同的代码提取出来
 * 变成了一个全新的类
 *
 * 而其他7个类,还需要用到这个全新的类中的内容
 * 通过继承来实现
 * */

public class CellFamily {
    // 1.定义一个cell数组, 存放4个Cell对象
    Cell[] cells = new Cell[4];

    // 行为/方法
    public void moveLeft() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].moveLeft();
        }
    }

    // 打印的方法
    public void print() {
        // 屏幕上20行 10列
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                boolean flag = false;
                for (int k = 0; k < cells.length; k++) {
                    // 判断是 * 还是 -
                    if (cells[k].getRow() == i && cells[k].getCol() == j) {
                        flag = true;
                    }
                }
                if (flag) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }


}
