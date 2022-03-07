package com.capgemini.calculatorV3.operations;

import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;

public interface IEquations {
    int executeEquationWithNumbers(int firstNumberOfEquation, String operator, int secondNumberOfEquation) throws ExceptionWhenOperatorIsDifferent;
}
