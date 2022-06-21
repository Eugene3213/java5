
public class Exception4 {

	public static void main(String[] args) {	
		try {			
			ex e= new ex();
			e.loader("data");
			
//			Exception aa=new Exception();		//throw : 자신을 호출하여 예외가 발생하면 자신을 호출
//			throw aa;
			
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);				
			}
		}
	}

}
class ex{
	Exception ep=null;
	public void loader(String a) throws Exception {		//throws는 try-catch를 받기 위함
		/*잘못된 문법사항 (자신의 오류를 상위 메인 class에 모두 전달하는 상황)
		if(a=="ok") {
			int keycode  = Integer.valueOf(a);		//정상적이지만, loader class 자체적인 오류가 발생			
		}
		else {
			this.ep=new Exception();	//해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우
			throw this.ep;		
		}		*/
		try {
			if(a=="ok") {
				int keycode =Integer.valueOf(a);
			}
			else {
				System.out.println("test");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			this.ep=new Exception();		//자신의 오류 사항을 리턴 받아서 확인함
			throw this.ep;
		}
	}
}
		