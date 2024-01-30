package com.ohgiraffers.assertions.section01.jupiter;

public class PositiveNumberValidator {

    private int firstNum;
    private int secondNum;

    public void checkDividableNumbers(int firstNum, int secondNum) {
        if(secondNum == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
    }
}
