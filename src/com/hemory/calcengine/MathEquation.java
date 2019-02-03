package com.hemory.calcengine;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char operationCode;
    private double result;



    public MathEquation(char operationCode, double leftValue, double rightValue) {
        this.operationCode = operationCode;
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public void execute() {
        if (operationCode == 'a') {
            result = leftValue + rightValue;
            System.out.println(result);
        } else if (operationCode == 's') {
            result = leftValue - rightValue;
            System.out.println(result);
        } else if (operationCode == 'm') {
            result = leftValue * rightValue;
            System.out.println(result);

        } else if (operationCode == 'd') {
            try {
                result = leftValue / rightValue;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by Zero");
            }
            System.out.println(result);
        } else {
            System.out.println("Not a valid operation");
        }
    }
}




