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
public class pattern4 {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=6; i++){
            for(j=6; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println("");
                    
        }
    }
}
