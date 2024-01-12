package com.ohgiraffers.section01.method;

public class Calcultor {

    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }
    public int subTwoNumbers(int first, int second) {
        return first - second;
    }

    public int multiTwoNumbers(int first, int second) {
        return first * second;
    }

    public int divideTwoNumbers(int first, int second) {
        return first / second;
    }

    private int minTwoNumberof(int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxTwoNumberof(int first, int second) {
        return (first > second) ? first : second;
    }
}
