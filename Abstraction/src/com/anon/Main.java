
package com.anon;

interface Portable {
    void carry();
}

abstract class Computer {              //abstract class
    public abstract void code();       //declaration
    public abstract void playVideo();  //abstract method
    
}

class Laptop extends Computer implements Portable {
    public void code() {            //defining 
        System.out.println("Writing code on laptop.");
    }
    
    public void playVideo() {
        System.out.println("Watching videos on laptop.");
    }
    
    public void carry() {
        System.out.println("Lets go....");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Writing code on desktop");
    }
    
    public void playVideo() {
        System.out.println("Watching videos on desktop");
    }
}

class Phone extends Computer implements Portable {
    public void code() {
        System.out.println("Coding on phone.");
    }
    
    public void playVideo() {
        System.out.println("Watching videos on phone.");
    }
    
    public void carry() {
        System.out.println("Lets go....");
    }
}

public class Main {

    
    public static void main(String[] args) {
        Desktop com = new Desktop();
        Alien a1 = new Alien();
        a1.build(com );
    }
    
}
