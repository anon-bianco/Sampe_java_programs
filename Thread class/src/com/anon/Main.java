package com.anon;


public class Main {

    
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        
        obj1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        obj2.start();
        
    }
    
}
