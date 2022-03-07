package com.capgemini.calculatorV3.operations;

import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import junit.framework.TestCase;
import org.testng.annotations.Test;

public class DivideTest extends TestCase {

    Divide divide = new Divide();

    @Test
    public void testDivideTwoNumbers() throws ExceptionWhenOperatorIsDifferent {
        int result = divide.executeEquationWithNumbers(8,"/",2);
        assertEquals(4,result);
    }
}