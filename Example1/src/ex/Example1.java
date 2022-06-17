package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		/* 외부 Class를 사용하여 다음 프로세서를 작성하시오.
		 
		 다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나의 배열로 합치도록 합니다.
		 대신 중복된 값은 하나로 처리해야 합니다.	 
		Collections 이용. 단, ArrayList LinkedList 사용시 
		 1번 DB : 11,22,33,44,55
		 2번 DB : 8,10,11,19,44
		 
		 결과
		 [8,10,11,19,22,33,44,55]		 */

		//1번 DB 2번 DB 중복값 비교 및 2번 DB삭제
		//2번 DB를 1번 DB에 추가
		//1번 DB sort로 정렬
		
		outclass ot= new outclass();
		ot.filter();
	}

}
class outclass{
	ArrayList<Integer> a1=null;
	ArrayList<Integer> b1=null;
	
	public void filter() {
		Integer[] a = {11,22,33,44,55};
		Integer[] b = {8,10,11,19,44};
		this.a1= new ArrayList<Integer>(Arrays.asList(a));
		this.b1= new ArrayList<Integer>(Arrays.asList(b));
		
		int w =0;
		do{
			int ww=0;
			int z =this.b1.size();
			while(ww<z) {
				if(this.a1.get(w)== this.b1.get(ww)) {
					//System.out.println(this.b1.get(ww));					//a1 b1 중복값 찾기
					this.b1.remove(ww);
					this.b1.add(ww,0);					
				}
				//System.out.println(this.b1.get(ww));
				ww++;
			}
			//System.out.println(this.a1.get(w));
			w++;
		}while(w<this.a1.size());
		
		int t=0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
			t++;
		}
		//System.out.println(this.b1);
		Collections.sort(this.a1);
		System.out.println(this.a1);
	}
}
