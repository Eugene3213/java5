package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		 ȸ������ DB�� �ִ� ��Ȳ�Դϴ�.
		 �ش� ���� �߿��� naver.com ���� �ּҸ� ����ϴ� �� ���ο����� ����մϴ�.
			DB�ε� �� �߻� Ŭ�������� �ε尡 �ǵ��� �մϴ�. 
			��Ʈ: IndexOf() ===> naver.com
					String a  ="ki@naver.com";
					System.out.println(a.indexOf("naver.com"));		 */
		
		userlist ul=new userlist();
		ul.setter("naver.com");
		int total = ul.getter();
		System.out.println("naver.com �����ڴ� �� "+ total + " �� �Դϴ�");
	}

}
abstract class basic{
	String arr[][];
	ArrayList<String> ar=null;
	public abstract void setter(String email);
	public abstract int getter();
	public abstract void db();
	 	
}
class userlist extends basic{
	int ea=0;
	int total=0;
	@Override
	public void setter(String email) {
		//System.out.println(email);
		db();
		for(int w=0; w<this.ea; w++) {
			//���������� �迭�������� ī������ �ϰ� �� indexOf-1(����) -1�� ��� ������
			if(this.arr[w][5].indexOf(email)!=-1) {
				this.total+=1;
			}
		}	
//arrayList ���� �뷮 �ʰ� �� �� ����.
//			this.ar= new ArrayList<>(Arrays.asList(arr[w][5]));
//			//System.out.println(this.ar);
//			if(this.ar.get(0).indexOf(email)!=-1) {						///�迭������ indexOf ���� �ȵ�.---> get()�� �����.
//				this.total+= 1;
//			}
//		}
	}
	@Override
		public int getter() {
			return this.total;
		}
	@Override
		public void db() {
		this.arr =new String[][] {
				 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
				 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
				 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
				 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
				 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
				 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
				 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
				 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
				 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
				 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
				 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
			 };	
			 
			this.ea=this.arr.length;
			//System.out.println(ea);
			
		}
	
}