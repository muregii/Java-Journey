package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
      int x = 1;
      int y = 1;
      System.out.println( x <= y); //less than or equal to, return true, else return false
      System.out.println(x == y); // equal to
    }

}

/*package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;*/

public class Main{
    public static void main(String[] args){
      int temperature = 72;
      boolean isWarm = temperature > 70 && temperature < 75; // logical AND operator
      System.out.println(isWarm);

    }
    
}

/*package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;*/

public class Main{
    public static void main(String[] args){
      boolean hasGoodConduct = true;
      boolean hasHighGPA = true;
      boolean isEligible = hasHighGPA || hasGoodConduct; // Logical OR operator
      System.out.println(isEligible);

    }

}
