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
public class pattern7 {
    public static void main(String[] args) {
        int i,j,n=5,k,r=4;
        for(i=1; i<=n; i++){
            for(j=5; j>=i; j--){
                System.out.print("# ");
            }
            System.out.println("");
            for(k=1; k<=i; k++){
                System.out.print("* ");
            }
           
          
        }
    }
}
