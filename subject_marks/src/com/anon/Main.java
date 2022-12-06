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
        int total = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of subjects: ");
        int n = sc.nextInt();
        
        int marks[] = new int[n];//{85, 25, 66, 45, 58}
                            //       0   1   2   3   4
        
        
        for (int i=0; i<n; i++) {
            System.out.println("Enter marks:");
            marks[i] = sc.nextInt();
            total = total + marks[i];// total = 0 + 85;
                                      //total = 85 + 25;
        }
        int average = total/n;
        
        System.out.println("Total is "+total);
        System.out.println("Average is "+ average);
        System.out.println("Marks of 2nd subject is "+ marks[1]);
        
        
        
    }
    
}
