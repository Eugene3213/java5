package ex;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		/*
		 {"hong","lee","park","kim","kang","jang","ha","sa"}
		 abstract를 사용하여 setter, getter를 무조건 적용합니다
		 메인에서는 해당 데이터를 외부 클래스로 전달하고, 최종 정보값만 배열로 생성하여 
		 출력되도록 합니다. 단, setter에서 배열 데이터 중 네 자리 미만에 있는 배열만 새로 생성 getter로 값을 받아 메인에 배열로 출력	 */

		String a[]={"hong","lee","park","kim","kang","jang","ha","sa"};
		int ea = a.length; //=8
		System.out.println(a[0].length());
		//새로운 배열로
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