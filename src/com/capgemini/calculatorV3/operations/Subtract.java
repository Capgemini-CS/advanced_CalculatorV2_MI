package com.capgemini.calculatorV3.operations;

import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import org.tinylog.Logger;

public class Subtract implements IEquations {

    @Override
    public int executeEquationWithNumbers(int firstNumberOfEquation, String operator, int secondNumberOfEquation) throws ExceptionWhenOperatorIsDifferent {
        if (!operator.equals("-")) {
            Logger.warn("You can use only : -");
            throw new ExceptionWhenOperatorIsDifferent("You can use only : -");
        }
        return firstNumberOfEquation - secondNumberOfEquation;
    }
}
