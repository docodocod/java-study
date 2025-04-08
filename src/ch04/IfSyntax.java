package ch04;

import java.util.Scanner;

//문제 알파벳 소문자를 입력 받아 대문자로 변환해 출력하는 프로그램을 switch문으로 작상하여라
public class IfSyntax {
    public static void main(String[] args) {
        System.out.print("알파벳 소문자를 입력하세요: ");
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();
        switch (ch) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println('B');
                break;
            case "c":
                System.out.println('C');
                break;
            default:
                System.out.print("일치하는 알파벳 없음");
                break;
        }
    }
}
