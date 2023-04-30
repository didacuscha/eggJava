package helloworld;

import java.util.ArrayList;
import java.util.Arrays;

/* Write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:

For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print FizzBuzz. */

public class FizzBuzz {
    
    public static void main(String[] args) {
        String result;
        
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
                System.out.println(result);      
            } else if (i % 5 == 0) {
                result = "Buzz";
                System.out.println(result);
            } else if (i % 3 == 0) {
                result = "Fizz";
                System.out.println(result);
            } else {
                result = Integer.toString(i);
            
                System.out.println(i);
            }
        }
    }
    
}