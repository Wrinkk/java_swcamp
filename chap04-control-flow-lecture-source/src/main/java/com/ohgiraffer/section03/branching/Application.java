package com.ohgiraffer.section03.branching;

public class Application {
    public static void main(String[] args) {

        A_break aClass = new A_break();

        /* 필기. break문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleBreakStatement();

        /* 필기. break문을 활용한 별찍기 문제 활용*/
        aClass.testPrintStarWithBreakStatement();

        B_continue bClass = new B_continue();

        /* 필기. continue문 흐름용 메소드 호출*/
        bClass.testSimpeContinueStatement();
    }
}
