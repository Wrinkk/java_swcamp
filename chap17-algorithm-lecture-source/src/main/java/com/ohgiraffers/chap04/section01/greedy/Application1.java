package com.ohgiraffers.chap04.section01.greedy;

public class Application1 {
    public static int solution(int n) {
        int count = 0;

        while(true){

            /* 설명. 5kg 봉지로로 바로 나눌 수 있으면 n/5를 반환한다. */
            if(n % 5 == 0) {
                return (n / 5 + count);         // (+ count)의 개념은 이전 반복에서 가져간 3kg 봉지의 수
            }else if(n < 0) {
                return -1;
            }

            /* 설명. 3kg 봉지로 한 봉지 들고 간다. */
            n = n - 3;
            count++;
        }

    }
}
