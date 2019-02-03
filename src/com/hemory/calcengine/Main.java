package com.hemory.calcengine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double leftValue;
        double rightValue;
        char operationCode;


        System.out.println("Welcome to the Calc Engine. Please enter an action: a = ADD, " +
                "s = SUBTRACT, m = MULTIPLY, d = DIVIDE");
        operationCode = input.next().charAt(0);

        System.out.println(operationCode);


        System.out.println("Please enter the left value ");
        leftValue = input.nextDouble();
        System.out.println(leftValue);

        System.out.println("Please enter the right value ");
        rightValue = input.nextDouble();
        System.out.println(rightValue);

        MathEquation equation = new MathEquation(operationCode, leftValue, rightValue);

        equation.execute();

    }
}

