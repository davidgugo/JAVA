package day03;

import java.util.Scanner;

public class ForUpDownEx1 {

	public static void main(String[] args) {
		/* 숫자 업다운 게임을 작성하세요.
		 * 랜덤으로 생성된 숫자를 맞추는 게임. 1 ~ 100
		 * 예시
		 * 랜덤으로 생성된 숫자 : 30
		 * 정수 : 50
		 * Down!
		 * 정수 : 20
		 * Up!
		 * 정수 : 30
		 * 정답!
		 * */
		
		int min = 1, max = 100;
		int r = (int)(Math.random() * (max-min+1) + min);
		
		Scanner scan = new Scanner(System.in);
		int num = min -1;
		//반복문
		for( ;num != r; ) {
		//정수입력
			System.out.print("정수 : ");
			num = scan.nextInt();
			
			if(num > r) {
				System.out.println("Down!");
			}else if(num < r) {
				System.out.println("Up!");
			}else {
				System.out.println("정답입니다!!");
				
			}
	
		
		
		}
		scan.close();
	}
}
		
	

		


