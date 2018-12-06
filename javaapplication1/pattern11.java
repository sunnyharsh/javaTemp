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
public class pattern11 {
    public static void main(String[] args) {
        int i,j,n=5, count=n-1;
        int k = 'A';
        System.out.println("k is" +k);
        for(i=1; i<=n; i++){
            char a = (char)k;
          for(j=1; j<=count; j++)
                System.out.print(" ");
                count--;
           for(j=1; j<=2*i-1; j++)
              
                System.out.print(a);
                k++;
           
            System.out.println("");
        }
    }
}
