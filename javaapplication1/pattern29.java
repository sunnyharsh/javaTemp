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
public class pattern29 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1; i<=n; i++){
            int count=1;
            for(j=1; j<=i; j++){
                System.out.print(count+" "); 
                count++;
            }
            System.out.println("");
        }
        for(i=2; i<=n; i++){
            int temp=1;
            for(j=n; j>=i; j--){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println("");
        }
    }
}
