import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		

		/* up down game
		 A파트: PC랜덤,Scanner 5번
		 B파트:PC랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과 처리
		 		  
		 기회는 총 다섯 번 
		 1.Pc가 숫자를 하나 선택. random 1~10
		 2.총 기회는 5번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 3.만약에 pc가 7을 선택 한 기준에서 사용자 숫자와 비교
		 -PC:7 사용자:2 ===> 결과: UP
		 4.총 기회는 4번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 -PC:7 사용자:4 ===> 결과: UP
		 5.총 기회는 3번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 -PC7 사용자:7 ===> 결과: 정답입니다. 프로세서 정지		 */
	
	Exam2 ex=new Exam2();
	Scanner sc=new Scanner(System.in);

	int pc=((int)(Math.random()*10)+1);
	
	int w=5;
	while(w>0) {
		
		System.out.printf("총 기회는 %d번 남았습니다.숫자를 선택해 1~10까지",w);
		int user=sc.nextInt();
		ex.Random(pc, user);
		
		w--;
	}
		sc.close();

	}

}
