import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
			System.out.println("0~10까지 숫자를 하나 선택하세요");
		int no =sc.nextInt();
		
		
		
		memories m =null;
		m= new memories();
		m.ms(no);
		m= null; 			//해당 인스턴스를 비움.

	
	
		//2.
		m =new memories();
		m.rd();
	
	
	
	}
}

class memories{
	public void ms(int user) {
		//Math.random() 랜덤메소드 사용법 기본은 자료형 double입니다.
		// random -> 보안코드, 인증코드, 추첨, 룰렛
		double a= Math.random();				//0.0 ~ 1.0
		int b = (int)(Math.random()*10);		//0~10 (괄호 잘 보자) double -> int 변경
		System.out.println(b);
		
		if(user==b) {
			System.out.println("당첨");
		}
		else {
			System.out.println("다음기회에");
		}
	}
	
	public void rd() { 				//random util 사용법
		Random r= new Random();		//ramdom 객체 생성 및 인스턴스 적용
		System.out.println(r.nextInt(10)+1);			//0~9까지 r.nextint를 사용
		
		r=null;
	
	}
}