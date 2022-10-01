//Concept 1

package com.raydonmuregi.demo;

public class Main {
  public static void main (String [] args) {
    //Augmented assignment operators
    int x = 2;
    x+= 1;
    System.out.println(x);
  }
}

//Concept 2


public class Main {
    public static void main(String[] args) {
        //implicit casting
        short x = 4;
       int y= x += x;
        System.out.println(y);
    }
}


//Concept 3

public class Main {
    public static void main(String[] args) {
        //implicit casting - happens when there's no chance for data loss
        //byte > short > int > long > double
        double x = 4.1;
       int y = (int) x + 2; //2.0 /* explicit casting of x. Must be compatible, meaning if x was String, you could not cast x to an integer*/
        // to convert a string to an integer, we use something called "parsing"
        String z = "4";
        int c = Integer.parseInt(z) + 3;
        System.out.println(z);
    }
