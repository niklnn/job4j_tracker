package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int y, int a, int b, int c) {
        return sum(y) + multiply(a) + minus(b) + divide(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rslSum = sum(7);
        System.out.println(rslSum);
        int rslMultiply = calculator.multiply(4);
        System.out.println(rslMultiply);
        int rslMinus = minus(30);
        System.out.println(rslMinus);
        int rslDivide = calculator.divide(40);
        System.out.println(rslDivide);
        int rslSumAll = calculator.sumAllOperation(5, 7, 9, 15);
        System.out.println(rslSumAll);
    }
}