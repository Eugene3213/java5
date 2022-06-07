import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		

		apink ap = new apink("홍길동",25,"test@test.com",-1000);
		System.out.println(ap.data());
		System.out.println(ap.data2());
		System.out.println(ap.data3());
	}

}
class apink{
	//private선언은 class 필드에서 생성해야 합니다.
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
		if(this.nm=="홍길동") {
			this.nm="hong";
			String e[] =this.email.split("@");		//이메일 중에 이메일 회사 정보만 가져오기위한 배열로 나누는 작업
			//System.out.println(Arrays.toString(e));
			this.email_cp =e[1];
		
		}
			
	}
	public apink(String nm1, int age1, String email1, int point1) {			//private 안에서 사용하지 못함
		//setter 형태
		this.nm =nm1;
		this.email=email1;
		
		if(point1<0) {
			this.point =0;
		}
		else {
			this.point =point1;
		}
		names();
		
	}
	public String data() {
		return this.email_cp;
		//return 밑에는 다른 코드 사용 불가 무조건. 마지막에 사용하는 코드
	}
	public String data2() {
		//getter 형태
		return this.email;
	}
	public int data3() {
		return this.point;
	}
}