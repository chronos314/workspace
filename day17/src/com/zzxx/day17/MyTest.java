package com.zzxx.day17;

public class MyTest {
    private static String[] names = {"bill", "hill", "jill"};

    public static void main(String[] args) {
        // 调⽤⽅法
        try {
            // 可能出现异常的代码
            checkUsername("nill");
            System.out.println("注册成功"); // 如果没有异常就是注册成功
        } catch(MyException e) {
            // 处理异常
            e.printStackTrace();
        }
    }
    // 判断当前注册账号是否存在
    // 因为是编译期异常，⼜想调⽤者去处理 所以声明该异常
    public static boolean checkUsername(String uname) throws  MyException {
        for (String name : names) {
            if (name.equals(uname)) {//如果名字在这⾥⾯ 就抛出登陆异常
                throw new MyException("亲" + name + "已经被注册了！");
            }
        }
        return true;
    }
}
