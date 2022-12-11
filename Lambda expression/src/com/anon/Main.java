
package com.anon;

interface A {
    public void walk();
}
public class Main {

    
    public static void main(String[] args) {
        
//        A obj = new A() {
//            public void walk() {
//                System.out.println("Running in track b");
//            }
//        };
        
        A obj = ()-> System.out.println("Running in track b");
        obj.walk();
    }
    
}
