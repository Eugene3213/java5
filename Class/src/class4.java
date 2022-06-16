import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 배열 데이터
		 홍길동,이순신,유관순
		 
		 메인 class에서 문자를 하나 전송합니다. 단, 문자가 null이 될수도 있고, 배열 데이터와 관계 없는 강감찬"이라고 
		 보낼 수도 있습ㄴ디ㅏ. 
		 외부 클래스명: data_list
		 주상 클래스명: v_construct
		 외부 클래스 안의 내부 클래스명 : check			 
		[결과]
		메인 class에서 강감찬을 적용할 경우
		내부 클래스에서 "해당 사용자는 가입자가 아닙니다" 라고 출력
		메인 class에서 이순신을 적용할 경우
		내부 클래스에서 "해당 사용자가 있습니다" 라고 출력
		단, ArrayList로 배열을 로드 하십시오. 						*/
		
	
		data_list da=new data_list();
		da.userinput("이순신");
	}

}
abstract class v_construct{
	String user_name;
	String data_list[];
	public abstract void userinput(String nm);
}
class data_list extends v_construct{
	
	@Override
	public void userinput(String nm) {
		if(nm==null) {
			System.out.println("사용자 이름을 입력하셔야 합니다");
		}
		else {
			this.user_name=nm;
			check ck = new check();
			ck.db();
		}
	}
	class check{						//부모 클래스에서 받은 데이터를 자식 클래스로 이관
		String user_name=data_list.this.user_name;
		String data_list[];			//필드에 배열을 받는 객체 생성
		ArrayList<String> ar= null;		//arraylist util을 필드에 객체 생성
		public void db() {
			//해당 필드에 있는 arraylist를 인스턴스로 적용함
			this.data_list=new String[] {"홍길동","이순신","강감찬"};
			this.ar =new ArrayList<>(Arrays.asList(this.data_list));		//this로 처리
			this.compare();		//최종 DB와 사용자 정보를 비교하는 메소드
		}
		public void compare() {
			int ea = this.ar.size();
			int w=0;
			boolean b1=false;		//결과확인
			do {
				if(this.user_name.equals(this.ar.get(w))) {
					b1=true;
				}
				w++;
			}while(w<ea);

			if(b1==true) {
				System.out.println("해당 사용자가 있습니다.");
			}
			else {
				System.out.println("해당 사용자는 가입자가 아닙니다");
			}
		}
		
	}
}