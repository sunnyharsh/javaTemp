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
public class pattern6 {
    public static void main(String[] args) {
        int i,j,n=4;
        int counter=1;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println("");
        }
    }
}
