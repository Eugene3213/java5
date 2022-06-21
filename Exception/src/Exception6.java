
public class Exception6 {

	public static void main(String[] args) {
		/*q. 
		 사용자가 45*3+16+5+22*8 해당 연산 값의 최종값을 
		 외부 클래스로 전송.
		 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며 홀수일 경우 
		 "홀수값 입니다"로 회신 되도록 합니다.		 */

		
		num nb = new num();
		try {
			int a =45*3+16+5+22*8;
			System.out.println(a);
			
		}catch(Exception e) {
			System.out.println("홀수값 입니다");
			if(e.getMessage()==null) {
				System.out.println(e);
			}
		}
	}

}
class num{
	public void number(int aa) throws Exception {
		if(aa%3==0) {
			throw new Exception();
		}
		else {
			
		}
	}
}