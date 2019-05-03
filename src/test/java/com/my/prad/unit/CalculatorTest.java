package com.my.prad.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.my.prad.Calculator;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTest {


    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {

        System.out.println("Unit test:");
        assertEquals(5, calculator.sum(2, 3));
    }
}