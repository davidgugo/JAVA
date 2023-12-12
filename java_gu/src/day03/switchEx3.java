package day03;

import java.util.Scanner;

public class switchEx3 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력(1~12) : ");
		int month = scan.nextInt();
		
		
		switch(month) {
		case 1, 2, 12:
			System.out.println(month +"월은 겨울");
			break;
		case 3, 4, 5:
			System.out.println(month +"월은 봄");
			break;
		case 6, 7, 8:
			System.out.println(month +"월은 여름");
			break;
		case 9, 10, 11:
			System.out.println(month +"월은 가을");
		default:
			System.out.println(month +"월은 잘못된 월");
		
		}
		
		scan.close();

	}

}
