
public class Exception1 {
//Exception : try,catch와 함께 사용을 하게 됩니다. (예외처리사항)
// -RuntimeException --> Error 발생 시 예외 처리 체크 안함 -Null, Class, Arraysize
// -OtherException --> 예외 처리 체크사항 모두 함	
	public static void main(String[] args) {
		/* Exception 종류
		 Arithmetic : 0으로 나눌 ㄸ ㅐ발생
		 NullPointer : Null객체를 참조할 때
		 ClassCast  :  클래스형 변환
		 NumberFormat : 숫자형으로 변환
		 ArrayIndexOutOfBound : 배열 참조 시 인덱스 번호 오류
		 IOException : 입출력 문제 발생
		 Exception : 전체 예외 처리 현황 
		 */
		int a;
		String b= "a1";
		try {		//1. try : 해당 값을 int로 변경함 
			a = Integer.valueOf(b);		//2. error 발생 : a1이라는 문자인데 강제로 숫자로 변환 시 a라는 문자로 인하여 오류
		}
		catch(NumberFormatException e){
			System.out.println(e); 		//3. 어떤 부분에서 문제가 발생했는지 체크함.
		}
		finally {
			b =b.replaceAll("[a-z][A-Z]","");		//4. 데이터 재처리 함
			a =Integer.valueOf(b);		//5. 문법을 재작성해서 사용
		}
		System.out.println(a);		//6.최종 결과값 출력
	}
}
