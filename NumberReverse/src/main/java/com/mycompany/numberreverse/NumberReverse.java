/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberreverse;
import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class NumberReverse {
    
        static int reverseNumber(int num)
    {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum* 10 + num % 10;
            num = num / 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int reverseN = reverseNumber(num);
        System.out.println("Reverse of num = " + reverseN);
        
        
    }
}
