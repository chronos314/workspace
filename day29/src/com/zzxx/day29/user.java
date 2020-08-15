package com.zzxx.day29;

public class user {
    private String name;
    private String password;

    public user(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
