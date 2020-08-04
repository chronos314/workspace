package com.zzxx.day21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class DemoPrintWriter {
    public void m1() throws FileNotFoundException {
        BufferedReader br=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("a.txt")));
    }
}
