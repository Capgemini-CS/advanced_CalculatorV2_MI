package com.capgemini.calculatorV3.operations;

import com.capgemini.calculatorV3.exception.ExceptionWhenDividingBy0;
import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculatorV3.validation.IValidationNumber;
import org.tinylog.Logger;

public class Divide implements IEquations, IValidationNumber {

    @Override
    public int executeEquationWithNumbers(int firstNumberOfEquation, String operator, int secondNumberOfEquation) throws ExceptionWhenOperatorIsDifferent {
        if(checkValidationNumber(secondNumberOfEquation)){
            Logger.warn("You can use only : /");
            throw new ExceptionWhenOperatorIsDifferent("You can use only : /");
        }
        return firstNumberOfEquation / secondNumberOfEquation;
    }

    @Override
    public boolean checkValidationNumber(int number) {
        Logger.error("Something went wrong");
        return number == 0;
    }
}
