
public class class1 {

	public static void main(String[] args) {
		//부모가 인스턴스에 적용이 되지 않으면 자식 class는 절대 호풀 하지 못함.
		parents p =new parents();
		p.p_box();
		parents.child pc= p.new child();	//인스턴스에 적용 : 부모 class. 자식class 이름= 부모class명. new 자식class명
		pc.c_box();

	}

}

class parents{			//부모 class		
	String a="홍길동";		//부모 필드에 있는 전역변수(this
	String b;
	
	class child{			//자식class
		int a=20;
		
		public void c_box() {		//자식 method
			double c =10.5;
			System.out.println(c);		//자식 method 전용 지역변수
			System.out.println(this.a);			//자식클래스 전용 전역변수
			System.out.println(parents.this.a);		//부모클래스 전용 전역변수
			System.out.println(parents.this.b);		//부모클래스 전용 전역변수
		}
	}
	
	public void p_box() {		//부모 method
		String a="이순신";
		this.b=a;
		System.out.println(this.a);
	}
}