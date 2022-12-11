package com.anon;

class A {
    int num = 9;
}

class B extends A {
    int num = 8;
    public void show() {
        int num = 7;
        System.out.println(super.num);
    }
}
public class Main {

    
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
    
}
