package ex;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		/*
		 {"hong","lee","park","kim","kang","jang","ha","sa"}
		 abstract�� ����Ͽ� setter, getter�� ������ �����մϴ�
		 ���ο����� �ش� �����͸� �ܺ� Ŭ������ �����ϰ�, ���� �������� �迭�� �����Ͽ� 
		 ��µǵ��� �մϴ�. ��, setter���� �迭 ������ �� �� �ڸ� �̸��� �ִ� �迭�� ���� ���� getter�� ���� �޾� ���ο� �迭�� ���	 */

		String a[]={"hong","lee","park","kim","kang","jang","ha","sa"};
		int ea = a.length; //=8
		System.out.println(a[0].length());
		//���ο� �迭��
		ArrayList<String>ar =new ArrayList<>();
		ar.add(a[1]);
		ar.add(a[6]);
		ar.add(a[7]);
		
		System.out.println(ar);
	}

}
abstract class name{
	
}
class name2 extends name{
	public String name_3() {
		
	}
}