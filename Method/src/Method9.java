import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 class aaa{
		 int a;
		 String b;					---> field
		 
		 	public aaa(){			---> constructor
		 	
		 	}	
		 	public void
		 	public static void
		 	public string abc		---> method				*/
		
		
		
		
		/*HW.
		 관리자에서 메뉴를 활성화하는 프로세서입니다. 해당 메뉴 활성화는 2차 배열이며, 메뉴명, 활성화하는 (Y,N)으로 구분.
		 해당값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는 메뉴명을 1차 배열로 재구성 후 메인에서 출력 되도록 합니다.
		 결과 : [로켓배송,로켓프레시,골드박스,이벤트,추석]		 
		 단, private 및 return을 활용하여 프로그램을 작성합니다.
		 */
		menus mn=new menus();
		System.out.println(Arrays.toString(mn.get()));
	}

}

class menus{
	private String arrays[][];
	private String yn[];
	
	public menus() {
		String ms[][]= {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.arrays=ms;
			//System.out.println(arrays.toString(this.arrays[0]));
		sub();
	}
	public void sub() {
		
		int w=0;
		int e=this.arrays[0].length;
		String result[] =new String[5];
		
		
		while(w<e) {
			if(this.arrays[1][w].equals("Y")) {
				
				 result[w]=this.arrays[0][w];
			}
		
			w++;
		}
		this.yn=result;
		//System.out.println(Arrays.toString(result));
	}
	public String[] get() {
		return this.yn;
	}
	
	
}	
		
	
	