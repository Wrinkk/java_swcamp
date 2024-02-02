package com.ohgiraffers.chap06.section01.dp;

import java.io.*;

public class Application3 {


    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer[] dp = new Integer[101];

    public static int solution(int n) throws IOException {

        for (int i = 0; i < n; i++) {
//            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;

        }
            return padovan(n);
    }

    private static int padovan(int n) {
        System.out.println(n);

        if (n == 1 || n == 2 || n == 3) {
            return 1;
        }

        /* 설명. if문은 기존에 dp에 값이 있을 때 점화식을 다시 사용하지 않도록 조건식 작성(효율을 위함) */
//        if (dp[n] == null)
//            dp[n] = dp[n - 3] + dp[n - 2];                // 현재 위치의 값(n)은 3번째 전(n-3)과 2번째 전 (n-2)의 값을 더하는 것이다.
            dp[n] = padovan(n - 2) + padovan(n - 3);        // 재귀함수형식
        return dp[n];
    }
}
