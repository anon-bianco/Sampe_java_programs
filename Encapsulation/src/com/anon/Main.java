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
        Customer obj1 = new Customer("Anon Bianco", 585, "anonh7@gmail.com");
        
        
        System.out.println("The customer name is Mr." + obj1.getName());
        System.out.println("The credit limit of Mr." + obj1.getName() + " is " + obj1.getCreditLimit() );
        System.out.println("And his email id is " + obj1.getEmail());
    }
    
}
