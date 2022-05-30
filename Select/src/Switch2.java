import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		
		/* q. 사용자가 다음과 같은 질문을 받습니다.
		 * "1~5까지 숫자를 하나 입력해 주시길 바랍니다"
		 * 
		 * 결과:
		 * 1: 5%할인쿠폰
		 * 2: 10%할인쿠폰
		 * 3,4: 택배비무료
		 * 5: 다음기회에				*/
		
		
		Scanner sc =new Scanner(System.in);
		
		int user;					//유저입력
			System.out.println("1~5까지 숫자를 하나 입력해 주시길 바랍니다");
			user=sc.nextInt();
			
			
			switch(user) {
			
			case 1:
				System.out.println("5%할인쿠폰");
				break;
			case 2:
				System.out.println("10%할인쿠폰");
				break;
			case 3,4:
				System.out.println("택배비무료");
				break;
			case 5:
				System.out.println("다음기회에");
				break;
				default:
			}
			
		sc.close();

		/* 실무버전
		Scanner sc =new Scanner(System.in);
		
		int user;					//유저입력
			System.out.println("1~5까지 숫자를 하나 입력해 주시길 바랍니다");
			user=sc.nextInt();
			
			String msg;
			switch(user){
			
			case 1:
				msg = "5%할인쿠폰";
				break;
			case 2:
				msg = "10%할인쿠폰";
				break;
			case 3:
			case 4:
				msh = "택배비무료";
				break;
			default:
				msg = "다음기회에";
				break;
			}
			sysout(msg); */
		
		
		// switch version형태
		
		
		String msg;
		switch(user) {
		case 1 ->{
			msg = "5%할인쿠폰";
		}
		case 2 ->{
			msg = "10%할인쿠폰";
		}
		case 3,4 ->{
			msg = "다음기회에";
		}
		
		}
		System.out.println(msg);
		sc.close();
		
		
	}

}
