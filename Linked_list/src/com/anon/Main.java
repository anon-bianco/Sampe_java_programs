package com.anon;



public class Main {

    
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(25);
        list.insert(55);
        list.insert(62);
        
        list.insertAtStart(99);
        
        list.insertAt(1, 70);
        
        list.deleteAt(1);
        
        list.show();
    }
    
}
