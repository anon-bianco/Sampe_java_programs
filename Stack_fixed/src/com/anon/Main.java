package com.anon;


public class Main {

    
    public static void main(String[] args) {
        Stack num = new Stack();
        num.push(5);
        num.push(66);
        num.push(8);
        
        num.show();
        
        System.out.println("***********************************************");
        
        System.out.println(num.pop());
        
        System.out.println("***********************************************");
        
        num.show();
        
        System.out.println("***********************************************");
        
        System.out.println(num.peek());
        
        System.out.println("The size is " + num.size());
        
        System.out.println("Empty status: " + num.isEmpty());
    }
    
}
