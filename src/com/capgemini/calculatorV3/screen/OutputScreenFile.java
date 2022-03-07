package com.capgemini.calculatorV3.screen;

import com.capgemini.calculatorV3.calculator.CalculatorLogic;
import com.capgemini.calculatorV3.exception.ExceptionWhenFileIsIncorrect;
import com.capgemini.calculatorV3.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.calculatorV3.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculatorV3.input.Key;
import com.capgemini.calculatorV3.input.Operator;
import org.tinylog.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutputScreenFile extends CalculatorLogic implements IWriteAndReadTxtFile {

    String answer = "";
    Scanner scanner = new Scanner(System.in);
    Key firstNumber = new Key();
    Key secondNumber = new Key();
    Operator operator = new Operator();

    public void showEquationUsingFile() throws ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent, ExceptionWhenFileIsIncorrect {
        System.out.println("\n \t\t 1. Save in txt file");
        System.out.println("\n \t\t 2. Read from txt file");
        System.out.println("\n \t Choose 1 or 2 ");
        answer = scanner.nextLine();
        switch (answer) {
            case "1":
                System.out.println("Please enter the data (number 1, operator + / - / * or /, number 2");
                saveNumbersInTxtFile(firstNumber.getKeyNumber(), operator.getOperatorInput(), secondNumber.getKeyNumber());
                break;
            case "2":
                readNumbersFromTxtFile();
                break;
        }
    }


    @Override
    public void saveNumbersInTxtFile(int firstNumberOfEquation, String operator, int secondNumberOfEquation) throws ExceptionWhenFileIsIncorrect {
        FileOutputStream fileOutputStream;
        int result;
        try {
            fileOutputStream = new FileOutputStream("Equation.txt");
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.println(firstNumberOfEquation);
            printWriter.println(operator);
            printWriter.println(secondNumberOfEquation);
            result = executeEquationWithNumbers(firstNumberOfEquation, operator, secondNumberOfEquation);
            printWriter.println(result);
            printWriter.close();
        } catch (FileNotFoundException | ExceptionWhenOperatorIsDifferent e) {
            Logger.debug("hi from here");
            throw new ExceptionWhenFileIsIncorrect("Something went wrong with the file operation.");
        }
        System.out.println("Succes. Your result is " + result);
    }

    @Override
    public void readNumbersFromTxtFile() throws ExceptionWhenOperatorIsDifferent, ExceptionWhenFileIsIncorrect {
        String lineWithValue;
        int firstNumberOfEquation;
        String operator;
        int secondNumberOfEquation;
        try {
            FileReader fileInputNumbers = new FileReader("InputEquation.txt");
            BufferedReader bufferedReader = new BufferedReader(fileInputNumbers);
            List<String> listWithNumbers = new ArrayList<>();
            while ((lineWithValue = bufferedReader.readLine()) != null) {
                listWithNumbers.add(lineWithValue);
            }
            firstNumberOfEquation = Integer.parseInt(listWithNumbers.get(0));
            operator = listWithNumbers.get(1);
            secondNumberOfEquation = Integer.parseInt(listWithNumbers.get(2));

            bufferedReader.close();
            for (String listNum : listWithNumbers) {
                System.out.println(listNum);
            }
        } catch (IOException e) {
            throw new ExceptionWhenFileIsIncorrect("Something went wrong with the file operation.");
        }
        System.out.println(executeEquationWithNumbers(firstNumberOfEquation, operator, secondNumberOfEquation));
    }
}
