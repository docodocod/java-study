package ch09;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요:");
        int a= sc.nextInt();
        System.out.print("두번째 정수를 입력하세요:");
        int b=sc.nextInt();
        try {
            if(b==3){
                throw new ArithmeticException("3으로 나눌 수 없습니다.");
            }
            int result = a / b;
            System.out.println("결과 " + result);
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
