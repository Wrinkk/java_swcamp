package com.ohgiraffers.section01.method;

public class Application2 {

    /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다.(main 메소드에서 한번에 순차적으로 여러 메소드 호출 해보기) */
    /*  설명.
     *   static이 붙어 있지 않은 메소드는 <클래스명 변수명 = new 클래스명();>을 활용해 메소드를 호출해야 한다.
     *   (접근 연산자(.)도 활용)
    * */
    public static void main(String[] args) {
        Application2 application2 = new Application2();
        System.out.println("main() 호출.");
        application2.methodA();
        application2.methodB();
        application2.methodC();
        System.out.println("main() 종료.");

    }

    public void methodA() {
        System.out.println("methodA() 호출.");
        System.out.println("methodA() 종료.");
    }

    public void methodB() {

        System.out.println("methodB() 호출.");
        System.out.println("methodB() 종료.");
    }

    public void methodC() {
        System.out.println("methodC() 호출.");
        System.out.println("methodC() 종료.");
    }
}
