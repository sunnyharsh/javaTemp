/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author shilpi
 */
public class palindrome {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("enter num..");
        int num = scanner.nextInt();
        int rem,temp;
        int rev =0;
        temp=num;
        while(num!=0)
        {
            rem = num % 10;
            rev = rev *10 +rem;
            num = num /10;
        }
        if(temp==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palidrome...");
        }
    }
}
