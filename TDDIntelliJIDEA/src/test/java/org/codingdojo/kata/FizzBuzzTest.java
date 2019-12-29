package org.codingdojo.kata;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_show_raw_number_for_normal_numbers(){
        checkFizzBuzzResult(1, "1");
        checkFizzBuzzResult(2, "2");
    }

    @Test
    public void should_show_fizz_if_rawNumbers_divisible_by_3() {
        checkFizzBuzzResult(3, "fizz");
    }

    @Test
    public void should_show_buzz_if_rawNumber_is_divisible_by_5() {
        checkFizzBuzzResult(5, "buzz");
    }

    @Test
    public void should_show_fizzbuzz_if_rawNumber_is_divisible_by_3_and_5() {
        checkFizzBuzzResult(15, "fizzbuzz");
    }

    @Test
    public void should_fizz_or_buzz_if_rawNumber_contains_3_or_5() {
        checkFizzBuzzResult(13, "fizz");
        checkFizzBuzzResult(15, "fizzbuzz");
        checkFizzBuzzResult(52, "buzz");
        checkFizzBuzzResult(51, "fizzbuzz");
        checkFizzBuzzResult(53, "fizzbuzz");
    }

    private void checkFizzBuzzResult(int i, String s) {
        assertThat((new FizzBuzz(i)).toString(), is(s));
    }
}
