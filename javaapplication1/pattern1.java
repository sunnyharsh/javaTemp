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
public class pattern1 {
     int i,j,k=0,n=6;
    public static void main(String[] args) {
        int i,j,k=0,n=6;
        for( i=1; i<=n; i++, k=0){
            for(j=1; j<=n-i; j++){
                System.out.println(" ");
            }
            while(k!=2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println("");
        }
        
    }
}
