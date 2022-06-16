
public class class2 {

	public static void main(String[] args) {
		/*
		 더블 클래스를 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하시오.
		 ㅐ클래스는 두가지가 있습니다
		 부모 클래스는 : mother
		 자식 클래스는 : child
		 메인 클래스에서 mother 클래스로 값을 전달 값은
		 30 50
		 child에서 무보 클래스에서 있는 겂을 받아 두개의 숫자를 곱한 결과값을 출력하시오.		 */
		

		mother m=new mother();
			m.m_th(30,50);
		mother.child  z= m.new  child();
		z.c_th();
	
	}

}
class mother{
	int aa,bb;
	
	public void m_th(int a, int b){
			this.aa=a;
			this.bb=b;
	}
	class child{
		int aa=mother.this.aa;
		int bb= mother.this.bb;
		public void c_th() {
			int cc=aa*bb;
			System.out.println(cc);
		}
			
			
		
	}
}