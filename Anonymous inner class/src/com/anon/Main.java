
package com.anon;

class A {
    public void walk() {
        System.out.println("Running in track a");
    }
}
public class Main {

    
    public static void main(String[] args) {
        A obj = new A() {
            public void walk() {
                System.out.println("Running in track b");
            }
        };
        obj.walk();
    }
    
}
