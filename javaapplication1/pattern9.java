/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author shilpi
 */
public class pattern9 {
    public static void main(String[] args) {
        int i,j,n=7;
        int count = n-1;
        for(i=1; i<=n; i++){
            for(j=1; j<=count; j++)
                System.out.print("#");
                count--;
            
            for(j=1; j<=2*i-1; j++)
                System.out.print("*");
            
            System.out.println("");
        }
    }
    
    }
