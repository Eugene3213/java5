import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88}
		 * 해당 데이터 값 중 문자값만 출력 도도록 재배열 하시길 바랍니다.
		 * 단, 메인에서는 해당 배열을 외불 클래스 (setter)로 전송합니다.
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.	
		 * getter에서 해당 배열을 return으로 보내도록 합니다. 
		 * 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다 */
		
		try {
			redata r= new redata();
			Object data[]={"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
			r.setter(data);
			LinkedList result = r.getter();		//return 받는 값이 배열 class이므로  해당 class명을 선언 후 받아야 함.
			System.out.println(result);
		}catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
			}
		}
//		LinkedList result = r.getter();
//			System.out.println(result);
	}

}
class redata{
	
	LinkedList<String> redata= new LinkedList<>();
	
	public void setter(Object call[]) throws Exception{
		//System.out.println(Arrays.toString(call));
		int ea=call.length;
		int w=0;
		//int check =Integer.valueOf((int)call[0]);
		//int check =(int)call[1];
		do{
			try {
				String check =String.valueOf((String)call[w]);	//해당 배열 로드 시 자료형 변환을 하는 이유는 Object배열이므로 선언
				this.redata.add(check);
				//System.out.print(check+",");
			}catch(Exception ex) {	//자신 class 에서 문제 발생시 출력되는 catch 문
				//단 throw 사용하면 다시 main으로 전환
				//call.중요한 사항은 throw로 전달 시 해당 반복문ㅁ은 종료
			}
			w++;
		}while(w<ea);
	}
	public LinkedList<String> getter() {
//		LinkedList<String> lk =new LinkedList<>();
//		lk.add("홍길동");
//		lk.add("이순신");
//		lk.add("유관순");	
		return this.redata;
	}
}