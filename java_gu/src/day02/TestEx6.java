package day02;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		/* 산술 연산자와 두 정수를 입력받아
		 * 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * 예
		 * 두 정수와 연산자 입력 (예: 1+2) : 1 + 2
		 * 1 + 2 = 3
		 * 예2
		 * 두 정수와 연산자 입력 (예: 1+2) : 1 / 2
		 * 1 / 2 = 0.5
		 * 예3
		 * 두 정수와 연산자 입력 (예: 1+2) : 1 ? 2
		 * ?는 산술연산자가 아닙니다
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		System.out.println(num1 + " " + operator + " " + num2
				+ " = ");
		
		
		
		
		scan.close();

	}

}
