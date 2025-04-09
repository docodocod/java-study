package ch05;

import java.io.IOException;
import java.util.Scanner;

public class forSyntax {
    public static void main(String[] args)throws IOException {
        System.out.println("****자판기 프로그램을 시작합니다****");
        Scanner sc=new Scanner(System.in);
        int balance = 0;
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("현재 투입된 금액 " + balance + "원");
            System.out.println("1.콜라(1500원)");
            System.out.println("2.오렌지주스(2000원)");
            System.out.println("3.생수(1000원)");
            System.out.println("4.종료");
            System.out.println("--------------------------------");
            System.out.print("음료를 고르세요(번호입력):");
            int button_number = sc.nextInt();
            switch (button_number) {
                case 1:
                    if (balance >= 1500) {
                        balance-=1500;
                        System.out.println("콜라를 구매하였습니다.");
                        continue;
                    } else {
                        System.out.println("잔액이 부족합니다.");
                        break;
                    }
                case 2:
                    if (balance >= 2000) {
                        balance-=2000;
                        System.out.println("오렌지주스를 구매하였습니다.");
                        continue;
                    } else {
                        System.out.println("잔액이 부족합니다.");
                        break;
                    }
                case 3:
                    if (balance >= 1000) {
                        balance-=1000;
                        System.out.println("생수를 구매하였습니다.");
                        continue;
                    } else {
                        System.out.println("잔액이 부족합니다.");
                        break;
                    }
                case 4:
                    System.out.println("자판기를 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하였습니다.");
                    continue;
            }
            System.out.print("금액을 충전해주세요:");
            int money = sc.nextInt();
            balance += money;
        }
    }
}
