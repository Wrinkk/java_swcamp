package com.ohgiraffers.section04.assignment.run;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.service.MemberService;

import java.util.Scanner;

/* 설명. 프로그램 실행 및 메뉴 출력과 사용자의 입력을 받을 View에 해당하는 클래스 */
public class Application {


    private static final MemberService mm = new MemberService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("======== 회원 관리 프로그램 =======");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴를 선택해 주세요: ");
            int input = scanner.nextInt();

            switch (input){
                case 1:
                    mm.selectAllMember();
                    break;
                case 2:
                    mm.selectMember(chooseMemberNo());
                    break;
                case 3:mm.signupMember(insertProfile());
                    break;
                case 4:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 제대로 다시 입력해주세요");
            }
        }
    }

    private static Member insertProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("등록 할 회원번호를 입력하세요: ");
        int memNo = scanner.nextInt();
        System.out.println();
        System.out.print("등록 할 아이디를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.print("등록 할 비밀번호를 입력하세요: ");
        String pwd = scanner.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.print("취미를 입력하세요: ");
        String[] = scanner.nextLine();
        System.out.print("혈액형을 입력하세요: ");
        String BloodType = scanner.nextLine();

    }

    /* 설명. 횡원 한명 조회를 위해 해당 회원 번호를 입력받아 반환 하는 메소드*/
    private static int chooseMemberNo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("회원번호를 입력하세요: ");
        return scanner.nextInt();
    }
}