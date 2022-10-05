package com.raydonmuregi.demo;


import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        //$1,000,000,000 == Number formatting.
        String result = NumberFormat.getPercentInstance().format(1.99) ;//chaining methods
        System.out.println(result);

    }
}
