package com.capgemini.calculatorV3.screen;

import com.capgemini.calculatorV3.exception.ExceptionWhenFileIsIncorrect;
import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;

public interface IWriteAndReadTxtFile {
    void saveNumbersInTxtFile(int firstNumber, String operator, int secondNumber) throws ExceptionWhenFileIsIncorrect;

    void readNumbersFromTxtFile() throws ExceptionWhenOperatorIsDifferent, ExceptionWhenFileIsIncorrect;
}
