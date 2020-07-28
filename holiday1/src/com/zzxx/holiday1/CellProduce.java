package com.zzxx.holiday1;

public class CellProduce {
    public static void main(String[] args) {
        CellFamily t = randomCell();
        t.print();
    }

    /**
     * 生成一个随机图形的方法
     *   由于图形有7种, 具体生成哪种不确定
     *   返回值类型就不能写具体的哪一种
     *   只能用父类型来声明
     */
    public static CellFamily randomCell() {
        int x;
        x = (int) (Math.random() * 7);
        switch (x) {
            case 0:
                return new T((int)(Math.random()*16+1),(int)(Math.random()*6+1));
            case 1:
                return new J((int)(Math.random()*16+1),(int)(Math.random()*6+1));
            case 2:
                return new O((int)(Math.random()*16+1),(int)(Math.random()*6+1));
            case 3:
                return new L((int)(Math.random()*16+1),(int)(Math.random()*6+1));
            case 4:
                return new S((int)(Math.random()*16+1),(int)(Math.random()*6+1));
            case 5:
                return new I((int)(Math.random()*16+1),(int)(Math.random()*6+1));
            case 6:
                return new Z((int)(Math.random()*16+1),(int)(Math.random()*6+1));
            default:
                return new T(1, 1);
        }
    }
}
