/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.anon;

/**
 *
 * @author anonh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Students obj1 = new Students();
        Students obj2 = new Students();
        
        obj1.name = "Anon Bianco";
        obj1.roll_no = 7;
        Students.training_name = "Java";
        Students.study();
        
        obj2.name = "Adamsen Branay";
        obj2.roll_no = 5;
        
        
        System.out.println(obj1.name);
        System.out.println(obj1.roll_no);
        System.out.println(obj1.training_name);
        
        System.out.println("***********************************************************************");
        
        System.out.println(obj2.name);
        System.out.println(obj2.roll_no);
        System.out.println(obj2.training_name);
        
    }
    
}
