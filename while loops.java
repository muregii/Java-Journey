package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String input = "";
      while (!input.equals("quit"))  /*OR while(true) */ {
          System.out.println("Input: ");
          input = scanner.next().toLowerCase();
          System.out.println(input);
      }
    }
}

