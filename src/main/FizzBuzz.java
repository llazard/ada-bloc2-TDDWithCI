package main;

public class FizzBuzz {
    public String fizzBuzz(int n) {

        if (n % 15 == 0){
            return "fizzbuzz";
        }

        if (n % 2 == 0){
            return "bouh";
        }
        if (n % 3 == 0){
            return "fizz";
        }
        if (n % 5 == 0){
            return "buzz";
        }

        return String.valueOf(n);
    }
}
