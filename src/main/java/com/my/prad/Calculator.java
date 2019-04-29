package com.my.prad;

import org.springframework.stereotype.Service;

/**
 * The type Calculator.
 */
@Service
public class Calculator {
    /**
     * Sum int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    int sum(int a, int b) {
        return a + b;
    }
}
