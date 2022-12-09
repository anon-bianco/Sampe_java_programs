package com.anon;


public class Main {

    
    public static void main(String[] args) {
        int i = 5;
        Apple obj = null;    //Multiple behaviour - Polymorphism
        
        if(i%2==0) {
            obj = new Orange();
        } else {
            obj = new Mango();
        }
                
        obj.eat();
    }
    
}
