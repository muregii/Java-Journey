package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //switch statements
        int role = 1;

        switch (role) {
            case 1:
                System.out.println("Welcome admin");
                break;
            case 2:
                System.out.println("Welcome moderator");
                break;
            default:
                System.out.println("Welcome guest");
        }
    }
}
