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
public class pattern18 {
    public static void main(String[] args) {
        int i,j,n=5;
        
        for(i=0; i<=n; i++){
            int a = 65;
           for(j=0; j<=i; j++){
               System.out.print("* ");
           }
           for(j=i; j<=n; j++){
              
               System.out.print((char)(a+j) +" ");
           }
            System.out.println("");
        }
        for(i=n; i>=0; i--){
            int b = 65;
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            for(j=i; j<=n; j++){
                System.out.print((char)(b+j)+" ");
            }
            System.out.println("");
        }
    }
}
