package com.anon;


public class Main {

    
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.enQueue(25);
        q.enQueue(58);
        q.enQueue(30);
        q.enQueue(77);
        q.enQueue(65);
        
        q.deQueue();
        
        q.show();
        
        System.out.println();
        System.out.println(q.getSize());
        
        System.out.println("Empty status : " + q.isEmpty());
        System.out.println("Full status : " + q.isFull());
    }
    
}
