//extends ; 자식 클래스에서 하나의 부모만 로드함.
//implements; 자식 클래스에서 여러 부모를 로드 가능함.( 에노테이션 @ 무조건 사용)
public class inter1 implements ime1,ime2{
	@Override
	public void c1() {
		System.out.println(names);
		System.out.println("interface1");
	}
	@Override
	public void c2(){
		System.out.println("interface2");
	}
	public static void main(String[] args) {

		inter1 it =new inter1();
		it.c1();
		it.c2();
	}

}
