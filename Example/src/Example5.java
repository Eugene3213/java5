
public class Example5 {

	public static void main(String[] args) {
		/* 2차배열 + 기본(클래스)메소드 문제
		 
		 등록된 고객중 vip 고객만 리스트를 출력하시오.
		 
		 user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 user_level : gold vip guest gold vip vip guest
		 결과 : 이순신, 세종대왕, 김유신		 */

		String user[][]={
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"gold","vip","guest","gold","vip","vip","guest"}
		};		
		
		Example5 a=new Example5();
		a.vip(user);
		
	}

	public void vip(String lst[][] ) {
		
		int ea=lst[0].length;
			
		int w=0;
		
		while(w<ea) {
			
			if(lst[1][w].equals("vip")) {
				System.out.println(lst[0][w]);
				//=System.out.printf("%s ",lst[0][w]);
			}
			
			w++;
		}
		
		/*
		int gp=lst.length;
		
		while(w<gp) {
			int ww=0;
			while(ww<ea) {
				
				System.out.println(lst[w][ww]);
			
				ww++;
			}
			w++;
		}
			*/
	
	
	
	
	
	}
	
		
}