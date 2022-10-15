package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Amateurish code
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
        System.out.println(hasHighIncome);
    }

}

package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Intermediate code
        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
        System.out.println(hasHighIncome);
    }

}

package com.raydonmuregi.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Professional code
        int income = 120_000;
        boolean hasHighIncome = income > 100_000;
       
        System.out.println(hasHighIncome);
    }

}



