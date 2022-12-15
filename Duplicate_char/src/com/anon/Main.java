//Find the duplicate letters in the given string "Welcome to ICT Academy"
package com.anon;

/**
 *
 * @author hilbe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Welcome to ICT Academy";
        String str2 = str1.toLowerCase();
        int count;
        char arr[] = str2.toCharArray();
        for(int i=0; i<str2.length(); i++) {
            count = 1;
            for(int j = i+1; j<str2.length(); j++) {
                if(arr[i]==arr[j] && arr[i]!=' ') {
                count++;
                arr[j]='0';
            }
            }
            if(count>1 && arr[i]!='0') {
                System.out.println(arr[i]);
            }
        }
    }
    
}
