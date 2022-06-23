package ex;

import java.util.Arrays;

//interface
public class Example8 {
/*다음 결과처럼 각각의 배열로 나누어진 것을 다음과 같이 배열로 정렬하기 
 	["홍길동=95","이순신=60","강감찬=80","유관순=95"]		*/
	
	public static void main(String[] args) {
		box2 bx=new box2();
		bx.setter();
	}

}
//extends : abstract, 일반 class 상속
//implements : interface 상속
class box2 implements interface8, interface8_1{
	
	
	@Override
	public void db() {
	
		
	}
	@Override
	public void setter() {
		System.out.println(Arrays.toString(this.user));
		System.out.println(Arrays.toString(this.number));
	}
	@Override
	public String getter() {
	
		return null;
	}
}