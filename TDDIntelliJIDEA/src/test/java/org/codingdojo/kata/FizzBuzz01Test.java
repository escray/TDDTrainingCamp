package org.codingdojo.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzz01Test {

    private FizzBuzz01 fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz01();
    }

    @Test
    public void should_fizz_if_divisible_by_3() {
        checkAnswer(1, "1");
        checkAnswer(3, "fizz");
        checkAnswer(6, "fizz");
    }

    @Test
    public void should_buzz_if_divisible_by_5() {
        checkAnswer(5, "buzz");
        checkAnswer(25, "buzz");
    }

    @Test
    public void should_fizzbuzz_if_divisible_by_3_and_5() {
        checkAnswer(15, "fizzbuzz");
        checkAnswer(45, "fizzbuzz");
    }

    @Test
    public void should_fizzbuzz_if_related_to_3_and_5() {
        checkAnswer(35, "fizzbuzz");
    }

    @Test
    public void should_error_if_less_than_1_or_more_than_100() {
        checkAnswer(0, "out_of_range");
        checkAnswer(101, "out_of_range");
    }

    private void checkAnswer(int i, String s) {
        Assert.assertEquals(this.fb.puzzle(i), s);
    }
}
