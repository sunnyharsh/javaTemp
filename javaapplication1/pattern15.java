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
public class pattern15 {
    public static void main(String[] args) {
        int i,j,n=7;
        
        for(i=0; i<=n; i++){
            int a=65;
            for(j=0; j<=i; j++){
                
                System.out.print((char)(a+j) +" ");
            }
             System.out.println("");
        }
            for(i=n; i>=0; i--){
                int a=65;
            for(j=0; j<=i-1; j++){
                System.out.print((char)(a+j) +" ");
            } 
            
            
            System.out.println("");
        }
    }
}
