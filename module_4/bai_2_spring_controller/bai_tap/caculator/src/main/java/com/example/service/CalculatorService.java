package com.example.service;

public class CalculatorService {

    public static double calculator(String cal, double numberA, double numberB) {
        double result;
        switch (cal) {
            case "add":
                result = numberA + numberB;
                break;
            case "sub":
                result = numberA - numberB;
                break;
            case "mul":
                result = numberA*numberB;
                break;
            default:
                result = numberA/numberB;
        }
        return result;
    }
}
