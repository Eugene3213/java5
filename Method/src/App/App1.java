package App;

public class App1 {
//App1이라는 기본 메인 class이며, abox, mail이 공존해 있음
	public static void main(String[] args) {
		//Method11에서 로드 할 경우 해당 외부 blue class를 로드하여 출력시켜 Method11에서 로드 할 수 있도록 함.
		blue b =new blue();
		System.out.println(b.box());
	}
	
	public void abox() {
		System.out.println("Test import");
	}
	
}
//blue는 별도의 외부 class이며, Method11에서 직접적인 핸들링 불가능(로드 불가능)
class blue{
	private String msg;
	
	public String box(){
		this.msg="환영합니다";
		return this.msg;
	}
	
}