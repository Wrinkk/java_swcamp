package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;                     // 연산장치
    private int hdd;                        // 하드
    private int ram;                        // 램
    private String opreationSystem;         // 운영체제

    public Computer() {
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.opreationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    public Computer(String code, String brand, String name, int price, Date menufacturingDate, String cpu, int hdd, int ram, String opreationSystem) {
        super(code, brand, name, price, menufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.opreationSystem = opreationSystem;
        System.out.println("Computer 클래스의 부모 필드까지 모두 초기화하는 생성자 호출함...");
    }

    @Override
    public String toString() {
//        return "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operationSystem='" + opreationSystem + '\'' +
//                "} " + super.toString();
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + opreationSystem + '\'' +
                "} " + "Product{" +
                "code='" + super.getCode() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", manufacturingDate=" + this.getManufacturingDate() +
                '}';
    }
}
