/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author shilpi
 */
public class pattern5 {
    public static void main(String[] args) {
        int i,j;
         int k='A';
        
        System.out.println("k is:" +k);
        
        
        for(i=1; i<=5; i++){
            for(j=1;j<=i; j++){
                char c= (char)k;
                System.out.print(c );
            }
            System.out.println("");
            k++;
            
        }
        
    }
}
