package com.capgemini.calculatorV3.operations;

import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import junit.framework.TestCase;
import org.testng.annotations.Test;

public class SubtractTest extends TestCase {

    Subtract subtract = new Subtract();

    @Test
    public void testDivideTwoNumbers() throws ExceptionWhenOperatorIsDifferent {
        int result = subtract.executeEquationWithNumbers(10,"-",9);
        assertEquals(1,result);
    }

}