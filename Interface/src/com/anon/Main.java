//class extends class
//class implements interface
//interface extends interface   

package com.anon;

interface Car {
    void drive();
}

interface SuperCar extends Car {
    void fly();
}

interface House {
    void stay();
}
class Dzire implements SuperCar, House {
    public void drive() {
        System.out.println("Driving.");
    }
    
    public void stay() {
        System.out.println("You can also stay in a car like house.");
    }
    
    public void fly() {
        System.out.println("Flying");
    } 
            
}
public class Main {

    
    public static void main(String[] args) {
        SuperCar obj = new Dzire();
        obj.drive();
        obj.fly();
    }
    
}
