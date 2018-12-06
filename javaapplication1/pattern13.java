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
public class pattern13 {
    public static void main(String[] args) {
        int i,j,n=5,count=n-1;
       int k ;
         char a;
        for(i=0; i<=n; i++){
           int A=65;
            for(j=5; j>i; j--){
                System.out.print(" ");
            }
           
             for(k=0; k<=i; k++){
               
                System.out.print((char)(A+k) +" ");
               
             }
                 System.out.println("");
               
               
                
        }
    }
}
