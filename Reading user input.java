package com.raydonmuregi.demo;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Reading input from the user
        Scanner scanner = new Scanner(System.in);         //Numbers like age e.t.c Remember to use the appropriate byte>float>double>int types
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years"); //concatenating a string and a boolean. Implicit conversion/casting will happen.

    }
}

//Reading the names of a person


