package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		/*
		 {"hong","lee","park","kim","kang","jang","ha","sa"}
		 abstract를 사용하여 setter, getter를 무조건 적용합니다
		 메인에서는 해당 데이터를 외부 클래스로 전달하고, 최종 정보값만 배열로 생성하여 
		 출력되도록 합니다. 단, setter에서 배열 데이터 중 네 자리 미만에 있는 배열만 새로 생성 getter로 값을 받아 메인에 배열로 출력	 */

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
		 abstract을 사용하여 setter, getter를 무조건 적용합니다.
		 메인에서는 해당 데이터를 외부 class로 전달하고 최종 정보 값만 배열로 
		 생성하여 출력 되도록 합니다.	  
		 단. setter에서 배열 데이터중 4자 미만에 있는 배열만 새로 생성하여
		 getter로 값을 받아 메인에서 배열로 출력하시오.
		 결과 : [lee, ha, sa]
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