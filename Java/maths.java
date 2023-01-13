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


/*******************************************************************************************************************************/
//Concept 2


public class Main {
    public static void main(String[] args) {
        //implicit casting
        short x = 4;
       int y= x += x;
        System.out.println(y);
    }
}



/*******************************************************************************************************************************/
//Concept 3

public class Main {
    public static void main(String[] args) {
        //implicit casting - happens when there's no chance for data loss
        //byte > short > int > long > double
        double x = 4.1;
       int y = (int) x + 2; //2.0 /* explicit casting of x. Must be compatible, meaning if x was String, you could not cast x to an integer*/
        // to convert a string to an integer, we use something called "parsing"
        String z = "4";
      String a = "3.14";
        int c = Integer.parseInt(z) + 3;
        double w = Double.parseDouble(a)
        System.out.println(z);
      System.out.println(w);
    } 
}


/*******************************************************************************************************************************/
//Concept 4: MATH METHODS

public class Main {
    public static void main(String[] args) {
        int result = Math.round(1.1F); // rounds a floating point number to the nearest whole number
       int result1 = (int)Math.ceil(1.1F);//returns the smallest integer that is >= to the given number
        int result2 = (int)Math.floor(1.1F);// returns the largest integer that is <= the given number
        int result3 = Math.max(91,19); //returns the largest number
        int result4 = Math.min(34, 25);//returns the smallest number
        int result5 = (int)(Math.random() *100); // returns a random number within the specified range. Must be a double because it returns decimal values
/*int has 4 bytes of memory, you'll have to explicitly cast (int)Math.round(Math.random() *100) to store your random value in an integer
*  int result5 = (int)Math.random() *100 is wrong because you are applying the type directly on th round method.
* int result5 = (int)(Math.round() *100 , wrapping parenthesis on the entire expression
*
* */
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}


