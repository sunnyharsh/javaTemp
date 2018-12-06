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
public class pattern17 {
    public static void main(String[] args) {
        int i,j,n=5;
         int a=65;
        for(i=0; i<=n; i++){
           
            for(j=n; j>=i; j--){
                System.out.print((char)(a+j) +" ");
            }
            a=a-1;
            System.out.println("");
        }
        for(i=0; i<=n; i++){
            int b=65;
            for(j=0; j<=i; j++){
                System.out.print((char)(b+j) +" ");
            }
            System.out.println("");
        }
    }
}
