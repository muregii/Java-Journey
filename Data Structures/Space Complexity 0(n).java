package com.example.datastructures;


public class HelloApplication {
    //Space Complexity
    public void greet (String[]names) {
        //0(n)
    String[] copy = new String[names.length];
    for ( int i = 0; i < names.length; i++)
        System.out.println("Hi" + names[i]);
    }
}
    //Linear search [1][2][3][4][5][6][7][8][9][10]
    //Binary search  Logarithmic time is more scalable than one in linear time.

