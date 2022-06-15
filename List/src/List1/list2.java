package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/* 해당 데이터 값 중 휴면고객 테이터는 모두 삭제해야 합니다.
		 * 고객 데이터
		 * 결과
		 * 정재욱,하윤성	 */
		
		String user[]={"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> ar= new ArrayList<String>(Arrays.asList(user));
		
		int ea=ar.size();
			//System.out.println(ea);
		int w=0;
		while(w<ea) {
			
			int ww=0;
			while(ww<0){
				if(!ar.get(ww).equals("정재욱") && !ar.get(ww).equals("하윤성")) {
					ar.remove(0);
					//System.out.println(ar);
				}
				ww++;
			}
			w++;
		}
		
		/* 짝수의 숫자를 모두 삭제합니다. 
		 결과: 7,1,11,37,41
		 */
		Integer number[]={10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar2 =new ArrayList<Integer>(Arrays.asList(number));
		
		int no =ar2.size();
		int z=0;
		do {
			int no2=ar2.size();
			int zz=0;
			
			do {
				if(ar2.get(zz)%2==0){
					ar2.remove(zz);		
					break;
				}
				zz++;	
			}while(zz<no2);
			z++;
		}while(z<no);
		System.out.println(ar2);
		
		
		
		
		
		
		
		
	}
			
			
	
		

}
