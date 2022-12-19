package com.anon;


public class Main {

    
    public static void main(String[] args) {
        
        Dynamic_stack num = new Dynamic_stack();
        
        num.push(2);
        num.show();
        System.out.println("*****************");
        num.push(25);
        num.show();
        System.out.println("*****************");
        num.push(66);
        num.show();
        System.out.println("*****************");
        num.push(88);
        num.show();
        System.out.println("*****************");
        num.push(44);
        num.show();
        System.out.println("*****************");
        
        num.pop();
        num.pop();
        num.pop();
        
        num.show();
        
        System.out.println("*****************");
        num.pop();
        num.show();
    }
    
}
