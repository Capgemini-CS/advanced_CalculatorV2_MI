package com.capgemini.calculatorV3.calculator;

import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculatorV3.operations.*;
import com.capgemini.calculatorV3.validation.IValidationOperator;
import org.tinylog.Logger;

import java.util.Arrays;
import java.util.List;

public class CalculatorLogic implements IEquations, IValidationOperator {

    public CalculatorLogic() {
        super();
    }

    @Override
    public int executeEquationWithNumbers(int firstNumberOfEquation, String operator, int secondNumberOfEquation) throws ExceptionWhenOperatorIsDifferent {
        int resultOfEquation = 0;
        IEquations equation;
        if (checkIfOperatorIsCorrect(operator)) {
            switch (operator) {
                case "+":
                    equation = new Addition();
                    resultOfEquation = equation.executeEquationWithNumbers(firstNumberOfEquation,operator,secondNumberOfEquation);
                    break;
                case "-":
                    equation = new Subtract();
                    resultOfEquation = equation.executeEquationWithNumbers(firstNumberOfEquation,operator,secondNumberOfEquation);
                    break;
                case "*":
                    equation = new Multiply();
                    resultOfEquation = equation.executeEquationWithNumbers(firstNumberOfEquation,operator,secondNumberOfEquation);
                    break;
                case "/":
                    equation = new Divide();
                    resultOfEquation = equation.executeEquationWithNumbers(firstNumberOfEquation,operator,secondNumberOfEquation);
                    break;
            }
        }
        return resultOfEquation;
    }

    @Override
    public boolean checkIfOperatorIsCorrect(String operator) {
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        if (operators.stream().anyMatch(op -> op.equals(operator))) {
            return true;
        } else {
            Logger.warn("Your parameters is not correct");
            System.exit(0);
            return false;
        }
    }
}
