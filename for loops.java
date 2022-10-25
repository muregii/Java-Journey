/* for (int i = 0; i < 5; i++ )
            System.out.println("Hello Raydon?" + i);*/


package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // For Loops
        /*initializing i to zero* /*Java evaluates this condition. Then first loop is executed*/ /*We're in the second loop now*/
        for (int i = 5; i > 0; i--  )
            System.out.println("Hello Raydon?" + i);
        }
    }

package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      String [] fruits = {"Apple", "Mango","Orange"};
      for(int i = 0; i < fruits.length; i++)
          System.out.println(fruits[i]);
      //For each loop - This is a forward only loop
      for (String fruit : fruits)
          System.out.println(fruit);
    }
}

