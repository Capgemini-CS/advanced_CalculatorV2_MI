package com.capgemini.calculatorV3.input;

import com.capgemini.calculatorV3.exception.ExceptionWhenKeyIsInvalid;
import org.tinylog.Logger;

import java.util.Scanner;

public class Key {

    public Key(){ }

    public int getKeyNumber() throws ExceptionWhenKeyIsInvalid {
        int key;
        Scanner scanner = new Scanner(System.in);
        try{
            key = scanner.nextInt();
        } catch (NumberFormatException number) {
            throw new ExceptionWhenKeyIsInvalid("Your parameter is not a valid key.");
        }
        return key;
    }
}
