
public class time3 {

	public static void main(String[] args) {
		/*
		 try {
			System.out.println("수업시작");
			Thread.sleep(5000);
			System.out.println("수업종료");
			
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		 */

		/*q. 외부 class가 있습니다. 단 메인 클레스에서 해당 외부 class를 로드하면 해당 메소드에서 즉각적으로 8초 동안 "처리중입니다. 잠시만 기다려 주세요" 로딩이 발생합니다.
		 	8초 이후에 return으로 "입금이 모두 처리 되었습니다"라는 문자를 받도록 하십시오.		 */
	
		input ip=new input();
		ip.money();
		
	}

}
class input{
	
	String msg="입금이 모두 처리 되었습니다";
	
	public void money() {
		try {
			System.out.println("처리중입니다. 잠시만 기다려 주세요");
			Thread.sleep(8000);
			String kkk=this.msg();
			System.out.println(kkk);
		}catch(InterruptedException a) {
			System.out.println(a);
		}
}
	public String msg() {
		return "입금이 모두 처리 되었습니다";
}
}