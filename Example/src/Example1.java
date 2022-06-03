import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {

		/*배열+기본(클래스)메소드 문제.
		  1차배열에 다음과 같이 값이 있습니다.
		  배열리스트 22 33 44 55 66 77 88 99 이며 해당 전체 값을 모두 더한 총합계 값을 별도의 메소드로 처리 되도록 합니다.
		  단, 반복문은 무조건 do while문으로 작성 합니다.		 */

		int a []= {22,33,44,55,66,77,88,99};
		//void = 객체생성 + 인스턴스(메모리) 등록
		Example1 ex =new Example1();
		ex.plus(a); 
		
		/* static void 쓸때는 객체생성 인스턴스 등록 필요 X
		 plus();		 */
		 
	}
		
	public void plus(int[] aa) {
		//System.out.println(Arrays.toString(aa));
		int ea=aa.length;				//배열 개수파악
		
		int w=0;
		int total=0;
		
		do {
			System.out.println(aa[w]);
			total=total+aa[w];
			
			w++;
		}while(w<ea);
		System.out.println("총 합계: "+total);
	}
	
}

		
