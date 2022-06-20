package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList , LinkedList ( 배열값) - add, remove , get, size
		//Map (배열키, 배열값)	- get, remove, size, put(add 대신)
		//Map은 배열키 기반이기 때문에 키를 통해서 데이터를 확인 합니다.(속도가 빠름)
		//같은 키 사용 시 마지막에 적용된 값으로 갱신----->키 값을 절대 중복 시키지 않음		
		Map<String, String> m =new HashMap<>();
		//Hong -> Hash function(HashMap) -> 0x21949CB (중복 값이 발생하지 않음)
		m.put("Hong", "홍길동");
		m.put("Kang", "강감찬");
			System.out.println(m.get("Hong"));
			
		m.put("","박혁거세");				//비어있는 키를 사용할 수 있으나 Map에 원리에는 올바르지 않음.
		m.put("park", "");				//키는 있으나 값이 비어있을 경우는 사용됨
		if(m.get("Park").equals("")) {
			m.put("park", "박");
		}
		m.remove("Hong");
		System.out.println(m);
		
		
		//Map : 여러개의 자료형을 사용할 수 있음
		Map<String,Integer> m2 =new HashMap<>();
		m2.put("age",32);
		m2.put("level",5);
			//System.out.println(m2.get("age"));
			System.out.println(m2.keySet());			//key만 출력
			System.out.println(m2.values()); 			//값만 출력
			System.out.println(m2.containsKey("tel"));	//해당 키가 있는지 확인(false:없음, true:있음)
	}

}
