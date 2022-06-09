

public class Exam2 {

	private int pc_n;
	private int user_n;
	
	public static void main(String[] args) {
		

	}
	public void Random(int pc, int user) {
		
		this.pc_n=pc;
		this.user_n=user;
		
		if(this.pc_n>this.user_n) {
			System.out.println("UP");
		}
		else if(this.pc_n<this.user_n) {
			System.out.println("Down");
		}
		else if(this.pc_n==this.user_n) {
			System.out.println("정답입니다");
			System.exit(0);
		}
	}
}
