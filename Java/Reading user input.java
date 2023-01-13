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

/*******************************************************************************************************************************/



// Oct 5 2022 12:39AM




//Reading the names of a person

package com.raydonmuregi.demo;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Reading input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); // This cannot print two names because names are "tokens, "every time we call the .next method it reads only one token. We therefore use .nextLine You can use the tri method to cut extra white spaces that may be at the start of the input. This is again a use of Chaining methods
        System.out.println("You are " + name); //concatenating a string and a boolean. Implicit conversion/casting will happen.
    }
}




/*******************************************************************************************************************************/
