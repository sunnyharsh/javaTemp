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
public class pattern12 {
    public static void main(String[] args) {
        int i,j,n=5 ;
        int k = 'A';
        for(i=1; i<=n; i++){
            char a = (char)k;
            for(j=5; j>i; j--)
                System.out.print("A");
            
            for(j=2; j<=i; j++)
                System.out.print(a);
            
                k++;
            
            System.out.println("");
            
        }
           
        
    }
}
