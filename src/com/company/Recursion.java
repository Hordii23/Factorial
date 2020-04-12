package com.company;

public class Recursion {
    public static int calculateFactorial(int n) {

        while (n == 1) {
            if (n == 1) {
                return 1;
            }
            return calculateFactorial(n - 1) * n;

        }
        return calculateFactorial(n - 1) * n;

    }

}
