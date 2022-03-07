package com.capgemini.calculatorV3.main;

import com.capgemini.calculatorV3.exception.ExceptionWhenFileIsIncorrect;
import com.capgemini.calculatorV3.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculatorV3.screen.OutputScreenFile;

public class ProgramMainCalculatorFile {
    public static void main(String[] args) throws ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent, ExceptionWhenFileIsIncorrect {
        OutputScreenFile outputScreenFile = new OutputScreenFile();
        outputScreenFile.showEquationUsingFile();
    }
}
