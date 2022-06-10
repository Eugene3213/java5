
public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=10;
		exam2 ex =new exam2();
		ex.exam1_method(a,b);
		int result =ex.exam2_method();
			System.out.println("최종 결과 값"+ result);
			System.exit(0));
	}

}
class exam1{
	protected int ex_sum=0;
	private int no1;
	private int no2;
	
	public void exam1_method(int ex1_no,int ex2_no) {
		
		this.no1=ex1_no;
		this.no2=ex2_no;
	
	
		if(ex1_no > ex2_no) {
			this.ex_sum =ex1_no +ex2_no;
		}
		else if(ex1_no < ex2_no) {
			exam2_loop();
		}
		else {
			System.out.println("해당 값이 없습니다");
			System.exit(0);
		}
	public void exam2_loop() {
		int w= this.no1;
		while(w<=this.no2) {
			this.ex_sum += w;
			w++;
		}
	}
	
class exam2 extends exam1{
	
	public int exam2_method() {
		return this.ex_sum;
	
	}
}
}