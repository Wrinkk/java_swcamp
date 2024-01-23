package com.ohgiraffers.section02.set.run;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class lotto {
    public static void main(String[] args) {
        /* 설명. 과제. 중복되지 않는 번호를 발생시켜 로또 번호 발생기 만들기(TreeSet 사용하지 않고)*/

        int[] lotto = new int[45];
        int[] lotto2 = new int[6];

        /* 설명. 1부터 45까지의 6자리 중복되지 않는 난수를 발생하여 값 저장 */
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i+1;
        }
        for (int j = 0; j < 6; j++){
           lotto2[j] = lotto[(int) (Math.random() * 45) + 1];
//           if (lotto2[j] == )
        }
        /* 설명. 출력 시에는 오름차순으로 출력 되도록 작성 */

        System.out.println("lotto2 = " + Arrays.toString(lotto2));
//        System.out.println("lotto = " + Arrays.toString(lotto));
    }
}
