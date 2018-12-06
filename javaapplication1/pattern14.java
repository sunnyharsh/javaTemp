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
public class pattern14 {
    public static void main(String[] args) {
        int i,j,n=5;
       
        for(i=0; i<=n; i++){
          int k=65;
           
            for(j=i; j<=n; j++){
                 
                System.out.print((char)(k+j) + " ");
               
            }
           for(j=n-1; j>=i; j--){
               
               System.out.print((char)(k+j)+" ");
           }
            System.out.println("");
        }
    }
}
