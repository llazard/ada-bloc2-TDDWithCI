package test;

import main.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest
{
    private final FizzBuzz fb = new FizzBuzz();

    @Test
    void return_n_pour_n() {
        assertEquals("1", fb.fizzBuzz(1));
        assertEquals("7", fb.fizzBuzz(7));
    }

    @Test
    void return_bouh() {
        assertEquals("bouh", fb.fizzBuzz(2));
        assertEquals("bouh", fb.fizzBuzz(4));
    }

    @Test
    void return_fizz() {
        assertEquals("fizz", fb.fizzBuzz(3));
        assertEquals("fizz", fb.fizzBuzz(6));
        assertEquals("fizz", fb.fizzBuzz(18));

    }
    @Test
    void return_buzz() {
        assertEquals("buzz", fb.fizzBuzz(5));
        assertEquals("buzz", fb.fizzBuzz(25));
    }

    @Test
    void return_fizzbuzz() {
        assertEquals("fizzbuzz", fb.fizzBuzz(15));
        assertEquals("fizzbuzz", fb.fizzBuzz(30));
        assertEquals("fizzbuzz", fb.fizzBuzz(45));
    }
}
