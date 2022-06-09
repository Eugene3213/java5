
public class Over {

	public static void main(String[] args) {


		//pt p =new pt();
		//p.display();
		//p.display("메인 내용 값 출력");
		cd c=new cd();
		c.display("메인 내용 값 출력");			//오버로딩
		c.display();						//오버라이드
	}

}
//오버로딩(overloading) : 새로운 메소드를 정의하는 것
//오버라이드(override) : 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것
class pt{
	public void display() {
		System.out.println("외부 내용 값");
	}
	
}
class cd extends pt{
	//aaaa() 메소드는 에노테이션 사용 불가능 부모 class에서 선언하지 않음
	//@Override			//부모 클래스에 메소드가 없음 -> 오류
	//public void aaaa() {		
	//	System.out.println("자식에 만들어진 메소드");
//	}
	
	
	@Override					//에노테이션(표시) : 문제 발생 시 확인(오버라이드에만 존재)
	public void display() {		//오버라이드
		System.out.println("자식 클래스 값으로 변경?");
		super.display();				//부모에는 고유 속성 메소드값을 가져올 때 사용
	}
	public void display(String msg) {			//오버로딩
		System.out.println(msg);
	}
}