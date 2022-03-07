package com.capgemini.calculatorV3.operations;

import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import junit.framework.TestCase;
import org.testng.annotations.Test;

public class AdditionTest extends TestCase {

    Addition addition = new Addition();

    @Test
    public void testAdditionOfTwoNumbers() throws ExceptionWhenOperatorIsDifferent {
        int result = addition.executeEquationWithNumbers(5,"+",7);
        assertEquals(12,result);
    }



}