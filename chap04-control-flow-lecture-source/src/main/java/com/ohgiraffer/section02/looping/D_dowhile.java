package com.ohgiraffer.section02.looping;

import java.util.Scanner;

public class D_dowhile {
    public void testSimpleDoWhileStatement() {

        /* 수업목표. do-while 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        do {

            System.out.println("실행될까?");
        } while (false);

        System.out.println("반복 종료 이후");

    }

    public void testDoWhileExample() {

        /* 수업목표. do-while 문의 흐름을 이해하고 적용할 수 있다. */
        Scanner scanner = new Scanner(System.in);
        String str = "";
        boolean flag = false;
        do {
            if(!str.equals("finish") && !str.equals("")){
                System.out.println("오타라고 믿을게요!");
            }
            System.out.println("finish라고 제발 입력해 주세요: ");
            str = scanner.nextLine();
            System.out.println(str + "을 입력하셨군요!!");
        } while (!(str.equals("finish")));          // equals 메소드는 String 비교에 사용되며 '=='과 같은 의미이다.
                                                    // str 문자열의 값이 finish와 일치하면 false가 되도록 작성
        System.out.println("감사합니다.");
    }
}