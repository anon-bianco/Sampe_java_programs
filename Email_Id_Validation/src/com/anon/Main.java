//Program to validate email id
package com.anon;


public class Main {

    
    public static void main(String[] args) {
        String email_id = "anonh7@gmail.com";
        
        String regex = "^[a-zA-Z0-9+._-]+@[a-zA-Z0-9+.-]+$";
        
        boolean res = email_id.matches(regex);
        
        if(res) {
            System.out.println("Valid email id.");
        }else {
            System.out.println("Invalid email id.");
        }
    }
    
}
