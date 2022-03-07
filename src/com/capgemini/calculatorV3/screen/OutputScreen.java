package com.capgemini.calculatorV3.screen;

import org.tinylog.Logger;

public class OutputScreen implements IScreen{

    @Override
    public void showOutputOnScreen(int result) {
        System.out.println("Your result is : " + result);
        Logger.info("Thank you!");
    }
}
