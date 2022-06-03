import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/* 배열 + 기본(클래스)메소드 문제
		 product : 수박,참외,사과,배,딸기,키위,바나나,망고
		 money : 35000 8000 4000 5500 3800 4400 11000 18900
		 장바구니에 해당 상품을 모두 담았습니다.
		 단, 그 중 사과와 바나나는 제외하고 총 결제 금액을 출력하시오.  총합: 75600	 */
		
		String product[]= {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		int money[]= {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};

		totals(product,money);
	}
	
	public static void totals(String[] p,int[] m) {
		//System.out.println(Arrays.toString(pd,mn));
		
		int ea=p.length;				//과일 배열개수
		int w =0;
		
		int total=0;					//합계
		
		
		while(w<ea) {
			//System.out.println(pd[w]);
			if(!p[w].equals("사과") && !p[w].equals("바나나")) {
				//System.out.println(p[w]);
				total=total+m[w];
			}				
			w++;
		}
		System.out.println("총 합계: "+total);
				
	}
}
	
	
	
	
	


