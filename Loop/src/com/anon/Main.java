/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.anon;
import java.util.Arrays;

/**
 *
 * @author anonh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] week = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        
        for(int i=0; i<week.length; i++) {
            System.out.println(week[i]);
        }
        
        System.out.println(Arrays.toString(week));
    }
        
    
}
