package day03;

import java.util.Scanner;

public class Forupd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//랜덤한 수 생성
		//반복문 : 조건식만 입력
			//정수 입력
			//정수와 랜덤한 수를 비교후 결과를 출력
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 100;
		int r = (int)(Math.random() * (max-min+1) + min);
		System.out.println("랜덤 :" + r);
		int i = 1;
		for( ;r != 30 ; ) {
			System.out.println()
		}
		
		
	scan.close();
	
}
}