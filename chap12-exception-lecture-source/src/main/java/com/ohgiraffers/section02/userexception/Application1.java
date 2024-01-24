package com.ohgiraffers.section02.userexception;


import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외 클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(-30000, 50000);
//            et.checkEnoughMoney(30000, -50000);
            et.checkEnoughMoney(50000, 30000);
        }
//        } catch (PriceNegativeException e) {
//            throw new RuntimeException(e.getMessage());
//        } catch (NotEnoughMoneyException e) {
//            throw new RuntimeException(e.getMessage());
//        } catch (MoneyNegativeException e) {
//            throw new RuntimeException(e.getMessage());
//        }/* catch (Exception e){
//            // 부모인 Exception e가 제일 위에서 catch를 하면 아랫 부분 자식파트가 진행이 안되기에 마지막에 모든에러를 처리하는 용도로 사용.
//        }*/

            catch (Exception e) {               // 다형성을 활용한 처리 방식
                System.out.println("예외 메시지: " + e.getMessage());
            }
    }
}
