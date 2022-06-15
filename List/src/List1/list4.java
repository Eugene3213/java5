package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	//윈도우 R 실행
	//shutdown -s-t0
	public static void main(String[] args) {
		Integer a[]= {3,6,9,12,15};
		LinkedList<Integer> ln=new LinkedList<Integer>(Arrays.asList(a));
			System.out.println(ln);
			
		ln.add(33);
		ln.add(43);
		ln.add(51);
		System.out.println(ln);
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> list =new LinkedList<>();		//빈배열 생성
		String user;
		
		//for(;;) //무한루프
		while(true) {		//무한루프
			System.out.println("숫자를 입력하세요");
			user=sc.next();
			try {		//사용자가 입력한 값이 오류가 있^는지 확인하는 파트0
				int number = Integer.parseInt(user);
				list.add(number);
				int ea =list.size();
					if(ea>5) {	 break;		//5개까지 배열이 입력되면 무한루프를 빠져나옴
					}
			}catch(Exception e){		//오류가 발생하였을 경우 작동되느 ㄴ파트
				System.out.println("해당 입력사항은 문자 입니다. 숫자만 입력하세요");
				
			}
		}
		System.out.println(list);
	}

}
