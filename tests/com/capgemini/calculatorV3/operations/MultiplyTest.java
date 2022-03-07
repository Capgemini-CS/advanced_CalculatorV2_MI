package com.capgemini.calculatorV3.operations;

import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import junit.framework.TestCase;
import org.testng.annotations.Test;

public class MultiplyTest extends TestCase {

    Multiply multiply = new Multiply();

    @Test
    public void testDivideTwoNumbers() throws ExceptionWhenOperatorIsDifferent {
        int result = multiply.executeEquationWithNumbers(10,"*",20);
        assertEquals(200,result);
    }

}