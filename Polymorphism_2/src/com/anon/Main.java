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
        Student obj1 = new Student();
        obj1.setName("Anon Bianco");
        obj1.setRoll_no(9);
        
        System.out.println(obj1.getName());
        System.out.println(obj1.getRoll_no());
         
        Student obj2 = new Student();
        obj2.setName("Astile Sebas");
        obj2.setRoll_no(14);
        
        System.out.println(obj2.getName());
        System.out.println(obj2.getRoll_no());
    }
    
}
