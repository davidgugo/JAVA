package day02;

import java.util.Scanner;

public class ScannerEx1 {

	//콘솔 창에서 정수, 실수, 문자, 문자열을 입력받는 예제
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("입력받은 정수 : " + num1);
		
		
		//문자열 입력받는 예제
		//한 단어를 입력받는 예제
		System.out.println("한 단어를 입력하세요 : ");
		String str1 = scan.next();
		System.out.println("입력받은 단어 : " + str1);
		
		System.out.println("실수를 입력하세요 : ");
		double num2 = scan.nextDouble();
		System.out.println("입력받은 실수 : " + num2);
		
		//한 줄을 입력받는 예제
		System.out.println("한 문장을 입력하세요 : ");
		scan.nextLine();
		String str2 = scan.nextLine();
		System.out.println("입력받은 문장 : + str2 ");
		//문자를 입력받는 예제
		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.print("입력받은 문자 : "  + ch);
		
		scan.close();

	}

}
