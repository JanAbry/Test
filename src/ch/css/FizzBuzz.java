package ch.css;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        asdf(1000);
    }

    private static void asdf(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("fizz");
            else if ((i % 3) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }


}