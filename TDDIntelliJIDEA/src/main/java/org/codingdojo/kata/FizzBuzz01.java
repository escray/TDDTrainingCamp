package org.codingdojo.kata;

import static java.lang.String.valueOf;

public class FizzBuzz01 {

    private String result = "";

    public String puzzle(int num) {
        result = "";

        if (num < 1 || num > 100) {
            result = "out_of_range";
        }
        else {
            if (relatedTo(num, 3)) {
                result += "fizz";
            }
            if (relatedTo(num, 5)) {
                result += "buzz";
            }
            if (result == "") {
                result = valueOf(num);
            }
        }
        return result;
    }

    private boolean relatedTo(int num, int i) {
        return num % i == 0 || valueOf(num).contains(valueOf(i));
    }
}
