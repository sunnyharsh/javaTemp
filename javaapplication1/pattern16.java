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
public class pattern16 {
    public static void main(String[] args) {
        int i,j,n=4;
        for(i=0; i<=n; i++){
            int a=65;
            for(j=n; j>=i; j--){
                System.out.print((char)(a++) +" ");
            }
          
            System.out.println("");
        }
        for(i=0; i<=n; i++){
            int a=65;
            for(j=0; j<=i; j++){
                System.out.print((char)(a+j) +" ");
            }
            System.out.println("");
        }
    }
}
