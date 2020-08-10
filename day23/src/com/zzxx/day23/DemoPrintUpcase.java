package com.zzxx.day23;

public class DemoPrintUpcase {
    public static void methodC(String str,Printup p){
        p.print(str);
    }

    public static void main(String[] args) {
        PrintS prints=new PrintS();
        /*methodC("hello",s->{
            prints.printUpperCase(s);
        });*/
        methodC("yysNB",prints::printUpperCase);
    }
}
