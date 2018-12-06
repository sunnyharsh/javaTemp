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
public class Pattern27 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=0; i<=n; i++){
            for(j=0; j<=n; j++){
                if(i==0){
                    System.out.print("* ");
                }
                else if(j==0){
                    System.out.print("* ");
                }
                else if(j==5){
                    System.out.print("* ");
                }
                else if(i==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
