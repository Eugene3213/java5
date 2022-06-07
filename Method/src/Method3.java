
public class Method3 {

	public static void main(String[] args) {
		
		/*q. 사용자가 2개의 숫자를 적용하여 계산되도록 합니다.
		  최종 계산값을 받아서 결과를 출력하시오.
		 	157, 45
		 	157*45
		 	
		 	최종결과값 출력 7065		 	 */
	math ma=new math();
	int result = ma.m(157,45);
	System.out.println(result);
	
	ma.m2();

	/*q. 다음 숫자 하나를 해당 메소드로 전달하게 됩니다. 해당 메소드에서는 다음과 같이 처리합니다.
	  숫자 3을 전달하면 3*1~ 3*9까지의 모든 결과값을 더하여 sysout 으로 출력 되도록 하십시오. */
	
	math ma3=new math();
	int result2 =ma3.m3(3);
	System.out.println(result2);
	
	String ck =ma.mb("hong");
	System.out.println(ck);
	}
	

}
class math{
	
	public int m(int a, int b) {			
		
		int c= a*b;
		return c;
	}

	public void m2() {
		int z= m(100,200);
		System.out.println(z);
	}
	
	public  int m3(int t) {
		
		int w=1;
		int total=0;
		
		while(w<10) {
			
			total+=(w*t);
					
			w++;
		}
		return total;			//return 사용시 절대 반복문 안에 적용하면 안됩니다. 또한 조건문이라도 더블로 return사용 안됩니다.
		
		
	}
	public String mb(String mid) {
		String msg="";
		
		if(mid.equals("hong")) {
			msg= "ok";
		}
		else {
			msg=  "cancel";
		}
		return msg;	//해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return 시킴
	}
	
	
	
	
}