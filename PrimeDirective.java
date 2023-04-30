package helloworld;

import java.util.ArrayList;
import java.util.Arrays;

class PrimeDirective {
  
  public boolean isPrime(int number){
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    } else {
    for (int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      }
    }
    return true;
    }
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)){
        primes.add(number);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.onlyPrimes(numbers));

  }  

}

/* Expansion Pack
Build a method that filters an array for odd or even numbers (bonus points if it can do either depending on arguments passed in!).
Build a method that returns an ArrayList of the first n primes in an array.
Build a method that returns an ArrayList of the first n Fibonacci numbers.
*/
