package ch03;
import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num1=scan.nextInt();
        System.out.print("실수를 입력하세요 : ");
        double num2=scan.nextDouble();
        System.out.printf("덧셈 결과: %d\n",num1+(int)num2);
        System.out.printf("뺄셈 결과(실수): %.1f\n",num1-num2);
        System.out.printf("곱셈 결과(실수): %.1f\n",num1*num2);
        System.out.printf("나눗셈 결과(정수): %d\n",num1/(int)num2);
    }
}
