package day02;

import java.util.Scanner;

public class HWcorrectEx1 {

	public static void main(String[] args) {
		//성적을 입력 받음-콘솔에서
		Scanner scan = new Scanner(System.in);
		System.out.print("성적 입력(0~100) : ");
		int score = scan.nextInt();
		//성적을 기준으로 학점을 출력
        //성적이 90점이상이고 성적이 100점이하이면 A학점 출력
		if(score >= 90 && score <= 100) {
			System.out.println(score + "점은 A");
		}
		//성적이 80점이상이고 성적이 90점미만이면 B학점 출력
		else if(score >= 80 && score < 90) {
			System.out.println(score + "점은 B");
		}
		else if(score >= 70 && score < 80) {
			System.out.println(score + "점은 c");
		}
		else if(score >= 60 && score < 70) {
			System.out.println(score + "점은 d");
		}
		else if(score >= 0 && score < 60) {
			System.out.println(score + "점은 f");
		}
		scan.close();
	}

}
