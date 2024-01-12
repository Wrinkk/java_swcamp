package com.ohgiraffer.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {

        /* 수업목표. switch만 단독 사용 시 흐름을 이해하고 적용할 수 있다. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("본인의 등급을 입력하세요(G: 골드, S: 실버, B: 브론즈)  :  ");
        char grade = scanner.next().charAt(0);
        int point = 0;
        boolean flag = true;

        switch (grade) {
            case 'G':
                point += 10;
            case 'S':
                point += 10;
            case 'B':
                point += 10;
                break;
            default:
                System.out.print("어디 회원 등급이세요?");
                flag = false;
        }
//        if (grade == 'G' || grade == 'S' || grade == 'B') {
//            System.out.println("당신의 등급은 " + grade + "이며, 현재 포인트는 " + point + "점 입니다.");
//        } else {
//            System.out.println("이 참에 회원가입 하시죠");
//        }
        if (flag) {
            System.out.println("당신의 등급은 " + grade + "이며, 현재 포인트는 " + point + "점 입니다.");
        } else {
            System.out.println("이 참에 회원가입 하시죠");
        }
    }
}
