
public class Exam3 {

	public static void main(String[] args) {
		
		inherit2 ih2=new inherit2();
		ih2.it("홍길동","aaa5");
		ih2.print();
	}

}
class inherit1{
	private String nm;			//inherit1 해당 부분에서만 적용
	protected String pw;		//inherit1, inherit2에서 모두 적용 되도록 하며, 외부에서 로드 못함
	public String aa;			//private로 방으 부분을 inherit2에서서도 사용할 수 있도록 하기 위함
		
	public void it(String d1, String d2) {
		this.nm=d1;
		this.pw=d2;
		this.aa=this.nm;
	}	
}
class inherit2 extends inherit1{
	
	public void print() {
		System.out.println(this.aa + "" + this.pw);
	}
}