/* Create a mortgage calculator that prompts the user to enter the amount of loan they want to get.
Predetermine the annual interest rate, and the payback period of the loan in years. 
The calculator should then return the monthly instalments required based on inputs entered. 
Use the formula M = P (1+r)^n / (1+r)^n -1
Remember that the rate the user enters is terms of percentage. So, you'll have to divide it by 100 "and then by 12 to get to the annual rate."


**********************************************
MY ATTEMPT
**********************************************/
package com.raydonmuregi.demo;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      double RATE = 0.0392;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String name = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the amount of loan you're requesting: ");
        int loan = scanner.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        

    }

}
