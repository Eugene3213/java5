package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		/* �ܺ� Class�� ����Ͽ� ���� ���μ����� �ۼ��Ͻÿ�.
		 
		 ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. ��, 2���� �迭�� �ϳ��� �迭�� ��ġ���� �մϴ�.
		 ��� �ߺ��� ���� �ϳ��� ó���ؾ� �մϴ�.	 
		Collections �̿�. ��, ArrayList LinkedList ���� 
		 1�� DB : 11,22,33,44,55
		 2�� DB : 8,10,11,19,44
		 
		 ���
		 [8,10,11,19,22,33,44,55]		 */

		//1�� DB 2�� DB �ߺ��� �� �� 2�� DB����
		//2�� DB�� 1�� DB�� �߰�
		//1�� DB sort�� ����
		
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
					//System.out.println(this.b1.get(ww));					//a1 b1 �ߺ��� ã��
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
