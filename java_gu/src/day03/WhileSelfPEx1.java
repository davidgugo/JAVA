package day03;

public class WhileSelfPEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		/* System.out.println(i);
		++i;
		System.out.println(i);
		++i;
		System.out.println(i);
		++i;
		System.out.println(i);
		++i;
		System.out.println(i);
		++i;
		*/
		/* 반복회수      : i가 1부터 5까지 1씩 증가
		 * 규칙성       : i를 콘솔에 출력
		 * 반복문종료후   : 없음
		 */
		int count = 5;
		while(i <= count) {
			System.out.println(i);
			++i;
		}

	}

}
