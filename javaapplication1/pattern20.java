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
public class pattern20 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1; i<=n; i++){
            
            for(j=1; j<=i; j++){
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                else{
                    if(j%2!=0){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
        }
            System.out.println("");
        }
    }
}
