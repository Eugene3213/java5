
public class Class3 {

	public static void main(String[] args) {

		//자료형(데이터형) 변환
		//double -> int로 변환
		double a = 137.5;
		int b = (int)a;	
			System.out.println(b);
			
		//int -> double로 변환
		int c=35;
		double d=(double)c;
			System.out.println(d);
			
		//String -> int
		String x = "35";
		String x2 = "156";
		
		int z = Integer.parseInt(x);				//parseint : int형에 사용하는 산술연산 언어
		//int z = Integer.valueOf(x);					//valueof 메소드(메소드함수) -> parseint
		
		int total = Integer.parseInt(x) + Integer.parseInt(x2);		//문자형을 숫자로 변환하여 산술계산을 처리함
			System.out.println(total);
		
		
		String j = "123456789";
		String j2 ="123456789";
		//int total2 = Integer.parseInt(j2) + Integer.parseInt(j);
		long total2 =Long.parseLong(j) + Long.parseLong(j2);				//Long 사용시 Long.parselong 사용함	
		double total3=(double)total2;	
			System.out.println(total2);
			System.out.println(total3);
		
		
		//문자(char) -> 문자(String) //잘 안쓰임. 알아만 두자.,0
		char p ='b';
		String f =String.valueOf(p);					//문자 -> 문자(Valueof만 사용)
			System.out.println(p);
		
		
		
	}

}
