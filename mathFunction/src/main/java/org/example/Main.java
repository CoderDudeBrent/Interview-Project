package org.example;

import java.io.PrintStream;

public class Main {

    public static String MathFunction(int number1, int number2, int number3) {
        // check if num1 and num2 are equal to 2 and num3 equal to 4
        if (number1 == 2 && number2 == 2 && number1 + number2 == 4) {
            return "+ *";
        }
        // check if addition true
        if (number1 + number2 == number3) {
            return " + ";
        }
        // check if subtraction true
        if (number1 - number2 == number3) {
            return " - ";
        }
        // check if multiplication true
        if (number1 * number2 == number3) {
            return " * ";
        }
        // check if division true
        if (number2 != 0 && number1 / number2 == number3) {
            return " / ";
        }
        // if none of the operations make the statement true, return "None"
        return "None";
    }
}