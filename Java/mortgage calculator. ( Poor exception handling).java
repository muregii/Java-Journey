package com.raydonmuregi.demo;
/* Create a mortgage calculator that prompts the user to enter the amount of loan they want to get.
Predetermine the annual interest rate, and the payback period of the loan in years.
The calculator should then return the monthly instalments required based on inputs entered.
Use the formula M = P (1+r)^n / (1+r)^n -1
Remember that the rate the user enters is terms of percentage. So, you'll have to divide it by 100 "and then by 12 to get to the annual rate."*/

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      final byte MONTHS_IN_YEARS = 12;
      final byte PERCENT = 100;


      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter principal: ");
      int principal = scanner.nextInt();

      System.out.println("Annual interest: ");
      float annualInterest = scanner.nextFloat();
      float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS; //DON'T USE MAGIC NAMES OR NUMBERS. USE PROPER DESCRIPTIVE NAMES

      System.out.println("Years: ");
      byte years = scanner.nextByte();
      int numberOfPayments = years * MONTHS_IN_YEARS;

      double mortgage = principal
              *(monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

      String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
      System.out.println("Your Mortgage payment is: " + mortgageFormatted);



    }

}
