import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/* 배열 + 기본(클래스)메소드 문제
		  
		product :  수박,참외,사과, 배, 딸기,키위,바나나,망고 중 
		참외,배,키위를 삭제 하였습니다.
		해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하시오.
		단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며 반복문은 자유 사용.
		결과 :[수박,사과,딸기,바나나,망고]	 */

		String[] product = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
	
		Example2 a = new Example2();
		a.fruit(product);	
	}

	public void fruit(String[] pd) {
		//System.out.println(Arrays.toString(pd));
		
		int ea=pd.length;
		int no =5;
		String newproduct[] =new String[no];
		int idx =0;
		
		for(String p : pd) {
			//System.out.println(p);
			if(!p.equals("참외") && !p.equals("배") && !p.equals("키위")) {
				newproduct[idx] =p;
				
				idx++;
			}
		}
		System.out.println(Arrays.toString(newproduct));
	
		
		
		
		
	}
}
