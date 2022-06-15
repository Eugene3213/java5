package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/* 넘버데이터1  3,6,9,12,15
		 * 넘버데이터2  2,4
		 * 
		 * 결과 3,6,9,12,15,2,4		 */
		
		
		//Arrays.sort : 배열변수 형태에만 적용
		Integer a[]= {3,6,9,12,15};
		Integer b[]= {2,4};
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(b));
		ArrayList<Integer> ar2=new ArrayList<Integer>(Arrays.asList(a));
		int ea=ar.size();
		int w=0;
		
		while(w<ea) {
			
			ar2.add(ar.get(w));
			
			w++;
		}
		System.out.println(ar2);
		
		Collections.sort(ar2);		//ArrayList, LinkedList sort 오름차순 정렬
		System.out.println(ar2);
		
		int ea2=ar2.size();
		System.out.println(ea2);
	}

}
