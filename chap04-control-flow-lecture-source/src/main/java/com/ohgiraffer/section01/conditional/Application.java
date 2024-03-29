package com.ohgiraffer.section01.conditional;

public class Application {

    public static void main(String[] args) {

        /* 설명. 이제부터 실행용 클래스를 구분해서 사용한다(main 메소드는 여기에만 포함) */

        A_if aClass = new A_if();

        /* 필기. 단독 if문 흐름 확인용 메소드 호출*/
//        aClass.testSimpleIFStatement();

        /* 필기. 중첩 if문 흐름 확인용 메소드 호출*/
//        aClass.testNestedIfStatement();

//        B_ifElse bClass = new B_ifElse();
//
//        /* 필기. 단독 if-else문 흐름 확인용 메소드 호출 */
//        bClass.testSimpleIfElseStatement();
//
//        /* 필기. 중첩 if-else문 흐름 확인용 메소드 호출 */
//        bClass.testNestedIfElseStatement();
//
        C_ifElseIf cClass = new C_ifElseIf();

        /* 필기. 단독 if-else-if문 흐름 확인용 메소드 호출 */
//        cClass.testSimpleIfElseStatement();
        /* 필기. 중첩 if-else-if문 흐름 확인용 메소드 호출 */
        /* 필기. 중첩 if-else-if문 로직 개선 */
//        cClass.testNestedIfElseStatement();

        D_switch dClass = new D_switch();
        dClass.testSimpleSwitchStatement();
    }
}
