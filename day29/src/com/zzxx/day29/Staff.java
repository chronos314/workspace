package com.zzxx.day29;

public class Staff {
    private int empno;
    private String ename;
    private String job;

    public Staff(int empno, String ename, String job) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
