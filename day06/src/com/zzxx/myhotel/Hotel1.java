package com.zzxx.myhotel;

public class Hotel1 {
    Room1[][] rooms;
    Hotel1(){
        rooms=new Room1[8][6];
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j]=new Room1((i+1)*1000+j+1);
            }
        }
    }
    void in(int num,String name){
        int i=num/1000-1;
        int j=num%1000-1;
        rooms[i][j].guest=new Guest1(name);
        System.out.println("入住成功!");
    }
    void out(int num){
        int i=num/1000-1;
        int j=num%1000-1;
        rooms[i][j].guest=null;
        System.out.println("退房成功");
    }
    void show(){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j].num + "\t");
            }
            System.out.println();
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].guest != null) {
                    System.out.print(rooms[i][j].guest.name + "\t");
                } else {
                    System.out.print(rooms[i][j].guest + "\t");
                }
            }
            System.out.println();
        }
    }
}
