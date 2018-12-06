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
public class JavaApplication1 {

    
    public static void main(String[] args) {
        int t1=0,t2=1,n=10;
        int sum=0;
        System.out.println("fibbonacci series is::");
        System.out.println(t1);
        System.out.println(t2);
       for(int i=1;i<=10;i++)
       {
           
            sum = t1 + t2;
            t1=t2;
            t2=sum;
            System.out.println(sum);
       }
    }
    
}
