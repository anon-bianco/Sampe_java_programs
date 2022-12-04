/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.anon;

import java.util.Scanner;

/**
 *
 * @author anonh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Enter the unit consumed:");
        Scanner scanner = new Scanner(System.in);
        int usage = scanner.nextInt();
        
        if (usage >101 && usage <=500) {
            int additional_usage = usage - 100;
            int cal = (additional_usage*5)+200;
            System.out.println("The amount to be paid is Rs " + cal);
        } else if (usage >=501) {
            int additional_usage = usage - 500;
            int cal = (additional_usage*10)+2200;
            System.out.println("The amount to be paid is Rs " + cal);
        }else {
            int cal = usage*2;
            System.out.println("The amount to be paid is Rs " + cal);
        }
        
        
       
    }
    
}
