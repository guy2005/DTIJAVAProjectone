package com.sau.tech;

public class MyClass01 {
    public static void met1() {
        System.out.println("111");

    }


    public static void main(String[] args) {
        System.out.println("AAA");
        met1();
        met1();
        System.out.println("BBB");
        met2();

    }
    public static void met2(){
        System.out.println("222");

    }
}
