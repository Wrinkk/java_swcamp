package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calcultor;

public class Application2 {

    public static void main(String[] args) {
        /* 수업목표. import에 대해 이해할 수 있다. */

        /* 목차. 1. non-static method의 경우 */
        Calcultor cal = new Calcultor();
        int sub = cal.subTwoNumbers(80, 21);
        System.out.println("80 - 21 = " + sub);

        /* 목차. 2. static method의 경우 */
        System.out.println("두 수 중 큰 값은: " + Calcultor.maxTwoNumberof(22,80));
 }
}
