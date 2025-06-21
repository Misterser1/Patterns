package org.rustem;

public class Calculator {
    public int calculate(int a, String op, int b){
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
