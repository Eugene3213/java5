
public class Exception6 {

	public static void main(String[] args) {
		/*q. 
		 사용자가 45*3+16+5+22*8 해당 연산 값의 최종값을 
		 외부 클래스로 전송.
		 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며 홀수일 경우 
		 "홀수값 입니다"로 회신 되도록 합니다.		 */		
		try {
			int sum =45*3+16+5+22*8;
			cul cl = new cul();
			String result=cl.cul_method(sum);		//return 값
				System.out.println(result);
			
		}catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());			
			}
		}
	}

}
class cul{
	//자료형 메소드에서 return 값  숫자,문자,소수, Object에 따라서 자료형이 선언되어 생성
	public String cul_method(int s) throws Exception {
		if(s%2==0) {
			throw new Exception("예외처리 발생으로 재확인이 필요합니다");
		}
		else {
			String msg="홀수 입니다";
			return msg;
		}
	}
}