
public class Method5 {

	public static void main(String[] args) {

		cdb c =new cdb();
		
		/*c.d3="홍길동";
		
		c.data2();
		
		c.d3="이순신";
		c.data1();
		
		c.d3="유관순";
		System.out.println(c.data3());*/
	
		//c.d2= "강감찬";      private로 선언한 객체이므로 main class에서 로드 불가
		c.data2("강감찬");
		String result =c.data3();
			System.out.println(result);
	}

}
class cdb{
	
	String d1=null;		//void 자료형 메소드 로드 가능
	private String d2=null;
	public static String d3;	// 모두 사용 가능
	
	public static void data1() {
		System.out.println(d3);
		//System.out.println(this.d2);		//static 자료형 외에는 로드가 불가능함
	}
	public void data2(String user) {
		this.d2=user;
		System.out.println(d2);
	}
	public String data3() {
		String a=this.d2;
		return a;
		
	}
	
}