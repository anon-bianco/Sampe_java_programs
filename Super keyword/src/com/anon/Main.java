package com.anon;


class A {
    public A() {
        System.out.println("In A");
    }
    
    public A(int i) {
        System.out.println("In int A");
    }
}

class B extends A {
    public B() {
        System.out.println("In B");
    }
    
    public B(int i) {
        System.out.println("In int B");
    }
}

public class Main {

   
    public static void main(String[] args) {
        B obj = new B();
        
    }
    
}
