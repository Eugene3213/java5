
public class Class7 {

	public static void main(String[] args) {
		//Class의 기본 메소드 객체 필드값 전달 
		String mid = "hong";
		String mname = "홍길동";
		Java1 jv1 = new Java1(mid,mname);
		jv1.Java2();
	}

}

class Java1{
	//Java1 class를 main에서 객체생성 및 인스턴스를 실행하면 바로 작동하는 class 기본 메소드 입니다.
	public Java1(String a, String b) {				//class에 기본으로 사용하는 메소드 (class명과 동일)
		System.out.println(a+b);
		Java2();					//void 메소드 를 바로 호출 할 수 있습니다.
	}
	public void Java2() {
		System.out.println("test");
	}
}