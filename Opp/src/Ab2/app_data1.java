package Ab2;

public interface app_data1 {
	String a=null; 			//필드 자료형을 비어있는 값 사용할 경우 적용 안됨.(값 지정해야함)
	int b=0;
	
	public void user_join();	//선언 형태의 메소드는 this 사용못함.
	default void aaa() {		//default에는 this사용이 가능함.(값이 지정되어 있는 경우)
		System.out.println(this.a);
	}
}
