package org.codingdojo.kata;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.lang.String.valueOf;

public class FizzBuzz {
    private int rawNumber;
    public FizzBuzz(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString(){
        if (isRelatedTo(3) && isRelatedTo(5)) return "fizzbuzz";
        if (isRelatedTo(3)) return "fizz";
        if (isRelatedTo(5)) return "buzz";

        return valueOf(rawNumber);
    }




    private boolean isRelatedTo(int i) {
        return rawNumber % i == 0 || valueOf(rawNumber).contains(valueOf(i));
    }
}
