package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		/*
		 {"hong","lee","park","kim","kang","jang","ha","sa"}
		 abstract�� ����Ͽ� setter, getter�� ������ �����մϴ�
		 ���ο����� �ش� �����͸� �ܺ� Ŭ������ �����ϰ�, ���� �������� �迭�� �����Ͽ� 
		 ��µǵ��� �մϴ�. ��, setter���� �迭 ������ �� �� �ڸ� �̸��� �ִ� �迭�� ���� ���� getter�� ���� �޾� ���ο� �迭�� ���	 */

		newclass cl=new newclass();
		cl.setter();
		ArrayList<String> aa= cl.getter();
			System.out.println(aa);
	}

}
class newclass{
	public void setter() {
		String a[]={"hong","lee","park","kim","kang","jang","ha","sa"};
		int ea = a.length; //=8
		ArrayList<String>ar =new ArrayList<>(Arrays.asList(a));
		ArrayList<String>ar2=new ArrayList<>(Arrays.asList(a));
		for(String name : ar) {
			if(name.length()<4) {
				ar2 =new ArrayList<>();
				ar2.add(name);
			}
		}
	}
	public ArrayList<String> getter() {
		return ar2;
	}
}

/*
package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
	
		newclass nc = new newclass();
		nc.setter();
		ArrayList<String> aa = nc.getter();
		System.out.println(aa);
		/* 
		 {"hong","lee","park","kim","kang","jang","ha","sa"}
		 abstract�� ����Ͽ� setter, getter�� ������ �����մϴ�.
		 ���ο����� �ش� �����͸� �ܺ� class�� �����ϰ� ���� ���� ���� �迭�� 
		 �����Ͽ� ��� �ǵ��� �մϴ�.	  
		 ��. setter���� �迭 �������� 4�� �̸��� �ִ� �迭�� ���� �����Ͽ�
		 getter�� ���� �޾� ���ο��� �迭�� ����Ͻÿ�.
		 ��� : [lee, ha, sa]
		 */
	}
}
/*
class newclass {
	ArrayList<String> ar2 = new ArrayList<>();
	
	public void setter() {
		String a[] =  {"hong","lee","park","kim","kang","jang","ha","sa"};
		ArrayList<String> ar = new ArrayList<>(Arrays.asList(a));
		for(String name : ar) {	
			if(name.length() < 4) {
				ar2.add(name);
			}
		}
	}
	public ArrayList<String> getter() {
		return ar2;
	}
}
*/