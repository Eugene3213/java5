import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		//1.
		int num =3;
		datalist da= new datalist();
		da.array_data(num);
		
		//2.
		String pay="신용카드";
			if(pay.equals("신용카드")){
				da.pay1();					//해당 조건에 맞는 메소드를 호출
			}
			else {
				da.pay2();					//메소드에 객체값을 태워서 전달 (객체값은 무한대)
			}
		/* q. 해당 로드할 class명은 agrees 라는 이름을 가지고 있습니다. main 메소드에서 사용자가 "동의함","동의안함"을 입력하게 됩니다. 동의함으로 입력 되었을 경우 "회원가입이 진행 됩니다" 라는
		 * 메세지를 출력하고 , 동의안함을 입력시 "동의를 하셔야 진행 됩니다" 라고 출력.
		 * 단, agrees 클래스 안에 void 메소드 한개 또는 두개를 선택하여 코드를 제작하시오.	 */
			
		/*	String ag ="동의함";

			agrees agr= new agrees();
				
				if(ag.equals("동의함")) {
					agr.ag1();
				}
				else {
					agr.da1();
				}	*/
				
		Scanner sc = new Scanner(System.in);
				System.out.println("동의 하시겠습니까");
				
				String atext =sc.next();
				agrees agr =new agrees();
				agr.ag(atext);
				
				sc.close();			
			
	}
	//필기문제 6/10시험
	/*  1. Editor의 종류
	  	2. Database의 종류
	  	3. Java에서 사용하는 자료형이 아닌 것은?
	  	4. Java에서 사용하는 구분 언어가 잘못 된 것은?
	  	   Project란?
	  	   package란?
	  	   import란?
	  	   class란?
	    5. Java에 대한 설명 중 잘못 된것은? (Java역사X. Java특징O)
	    6. 다음 문법 코드 중 잘못된 부분은?
	 */

}

class datalist{
	//static 메소드를 활용하는 형태 : 여러 package에서 해당 메소드를 자주 사용해야하는 부분에서는 static을 이용하여 사용합니다.
	
	/*static(정적메소드) : 오버라이딩을 사용할 수 없음
	void만 사용(동적메소드) : 오버라이딩을 사용할 수 있음
	
	오버라이딩 예:
	class a{
	void 메소드
	}
	class b extend a {
	void 메소드
	}						*/
	
	
	//1.
	public void array_data(int a) {			//static 없는 메소드
		//System.out.println(a);
	
		int w=1;
		while(w<=9) {
			System.out.println(a*w);
			
			w++;
		}
	
	}
	
	//2.
	public void pay1() {
		System.out.println("신용카드로 결제 진행합니다");
	}
	public void pay2() {
		System.out.println("무통장으로 결제 진행합니다");
	}	
}


class agrees{
	
	
	/*public void ag1() {
		System.out.println("회원가입이 진행됩니다");
	}
	public void da1() {
		System.out.println("동의하셔야 진행 가능합니다");
	}
	
	*/
	
	
	public void ag(String k) {
		String msg;
		if(!k.equals("동의함")) {
			msg ="동의를 하셔야 진행 합니다";
		}
		else {
			msg ="회원가입이 진행 됩니다";
		}
		System.out.println(msg);
	}  
}