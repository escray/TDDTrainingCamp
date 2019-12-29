package org.codingdojo.kata;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CalculatorTest {
    @Test
    public void should_add_two_numbers() {
        Calculator cal = new Calculator();
        int result = cal.add(1, 2);
        Assert.assertThat(result, is(3));
    }
}
