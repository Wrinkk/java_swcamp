package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {

    /* 수업목표. Enum의 문법에 대해 이해하고 활요할 수 있다(플러스적인 면모)*/
    public static void main(String[] args) {
        /* 필기.
            enum타입의 필드를 최초 사용 시에만 열거타입의 인스턴스를 최초 하나만 생성하고 이후에는 생성자를
         *  호출 하지 않는다.
            또한, enum 타입은 set으로 바꿔 반복시키며 필드들을 한번에 확인하고 활용할 수 있다.
        * */
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin.toString());
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.name() + ", " + consumer.name() + ", " + consumer.getDescription());

        System.out.println("Set으로 바꿔 반복자 활용해보자.");
        System.out.println("====================================");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().name());

        }
    }


}
