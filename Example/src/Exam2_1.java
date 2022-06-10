
public class Exam2_1 {

	private int val1;		//pc
	private int val2;		//user
	private String msg;		//결과메시지
	
	public  void randomck(int pc,int user) {	//setter(인수값 받음)
		this.val1=pc;
		this.val2=user;
		
		if(this.val1> this.val2) {
			this.msg="UP";
		}
		else if(this.val1<this.val2) {
			this.msg="DOWN";
		}
		else {
			this.msg="정답";
		}
	}
	//getter (인수값x)
	public String result() {
		return this.msg;
	}
}
