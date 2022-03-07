package com.capgemini.calculatorV3.main;

import com.capgemini.calculatorV3.calculator.CalculatorLogic;
import com.capgemini.calculatorV3.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculatorV3.input.Key;
import com.capgemini.calculatorV3.input.Operator;
import com.capgemini.calculatorV3.screen.OutputScreen;

public class ProgramMainCalculator {
    public static void main(String[] args) throws ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent {
        CalculatorLogic calculator = new CalculatorLogic();

        Key firstNumber = new Key();
        Key secondNumber = new Key();
        Operator operator = new Operator();

        int resultOfEquation = calculator.executeEquationWithNumbers(
                firstNumber.getKeyNumber(),
                operator.getOperatorInput(),
                secondNumber.getKeyNumber()
        );

        OutputScreen outputScreen = new OutputScreen();
        outputScreen.showOutputOnScreen(resultOfEquation);
    }
}
