package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy"; // The tenary : operator 
      System.out.println(className);
    }
}
