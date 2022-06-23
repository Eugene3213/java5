package ex;

public interface interface8 {
	public String user[]= {"홍길동","우관순","이순신","강감찬"};		//interface에는 무조건 인수값이 들어가야함 , interface 메소드 안의 값은 수정은 가능하지만 메인 class에서 수정 불가능
	public void setter();
	public String getter();
	//private 사용불가, 중괄호 사용불가, extends 사용불가
}
