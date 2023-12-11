package day02;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90이상 ~ 100이하 : A
		 * 80이상 ~ 90미만 : B
		 * 70이상 ~ 80미만 : C
		 * 60이상 ~ 70미만 : D
		 * 60미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘못된 점수 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int grade = scan.nextInt();
		
		if(grade < 0 || grade > 100) {
			System.out.println(grade + "잘못된 점수");
		}else if(grade < 60) {
			System.out.println(grade + "학점은 F");
		}else if(grade < 70) {
			System.out.println(grade + "학점은 D" );
		}else if(grade < 80) {
			System.out.println(grade + "학점은 C" );
		}else if(grade < 90) {
			System.out.println(grade + "학점은 B" );
		}else{
			System.out.println(grade + "학점은 A" );
		}
			scan.close();
			
	}
	
}
		
	

	
