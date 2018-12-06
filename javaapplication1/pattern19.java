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
public class pattern19 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1; i<=n; i++){
            int a=65;
            int b= 65;
            for(j=1; j<=i; j++){
                System.out.print((char)(a++)+" ");
            }
            //System.out.println("");
            for(j=2;j<=i; j++){
               
                System.out.print((char)(b++)+" ");
                
            }
            System.out.println("");
        }
        
    }
}
