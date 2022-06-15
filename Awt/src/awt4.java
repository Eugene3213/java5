
public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java 연계
		decorate de=new decorate();
		de.view();
	}

}
class decorate extends awt4_class{
	
	public String aws="";
	
	public void btn_push(int c) {
		/*사용자가 입력한 숫자를 기준으로 구구단을 작성 */
		int ff;
		String prf="";
		for(ff=1;ff<10;ff++) {
			int k =c*ff;
			prf=prf + c + "*" + ff + "=" + k + "\n";
		}
		
			this.aws=prf;
	}
	public int calls() {
		return aws;
	}
}