package com.ohgiraffer.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwotoNine() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */

        /* 설명.
         *  2단
         *     2 * 1 = 2
         *     2 * 2 = 4
         *     2 * 3 = 6
         *     ...
         *     9 * 7 = 63
         *     9 * 8 = 72
         *     9 * 9 = 81
         * */
        for (int i = 2; i <= 9; i++) {

            System.out.println(i + "단수의 곱");
            for (int j = 1; j <= 9; j++) {
                int gop = i * j;
                System.out.println(i + " * " + j + " = " + gop);
            }
            System.out.println();
        }

    }

    public void printUpgradeGugudanFromTwotoNine() {

        /* 수업목표. inner for문을 메소드로 따로 모듈화 해보자.(하나의 기능 단위로 보고) */
        for (int dan = 2; dan < 10; ++dan) {
            System.out.println(dan + "수 출력");
            printGugudanOf(dan);
            System.out.println();

        }
    }

    /* 설명. 단수를 넘기면 1~9까지 곱해서 숫자를 출력해주는 기능 */
    private void printGugudanOf(int dan) {
        for (int su = 0; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    /*  설명.
     *   아래와 같은 별모양이 나오도록 작성해보자
     *              *
     *             **
     *            ***
     *           ****
     *          *****
     * */

    public void printStars() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하시오: ");
        int num = scanner.nextInt();

//        for (int i= 0; i < num; i++) {
//            for (int a= num; a >= i; a--){
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//            System.out.print("*");
//            }
//                System.out.println("");
//        }
        for (int i = 0; i < num; i++) {

            /* 설명. 공백 출력용 안쪽 for문(input - i) */
//            for (int j = 0; j < num - i; j++) {
//                System.out.print(" ");
//            }
            printSpace(num, i);

            /* 설명. 별 출력용 for문(i) */
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
            printStar(i);
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int a = 5; a <= i; a--) {
                System.out.print(" ");
            }
        }


    }

    private void printSpace(int num, int i) {
        for (int j = 0; j < num - i; j++) {
            System.out.print(" ");
        }
    }

    private void printStar(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
    }
}
