
public class Exam4 {

	public static void main(String[] args) {
		/*q.
		 두갸의 값을 외부 클래스로 보냅니다.
		 해당 클래스에서 두개의 값을 계산하게 됩니다.
		 계산형식 다음과 같습니다.
		 3,10을 보내게 되면 두개의 값의 합을 구합니다.
		 나머지 외부 클래스에서 핵심 결과값을 출력하는데
		 두개의 합 값이 짝수, 홀수인지를 출력하는 extneds를 구분하시오	 */
		
		
		sub2 sb=new sub2();
		sb.number(3, 10);
		sb.number2();
	}

}
class sub{
	private int aa;
	private int bb;
	protected int cc;
	
	public void number(int a,int b) {
		this.aa=a;
		this.bb=b;
		this.cc= this.aa + this.bb;
	}
}
class sub2 extends sub{
	
	public void number2() {
		if(this.cc%2==0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
	}

}