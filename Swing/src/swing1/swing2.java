package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList , LinkedList ( �迭��) - add, remove , get, size
		//Map (�迭Ű, �迭��)	- get, remove, size, put(add ���)
		//Map�� �迭Ű ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ�� �մϴ�.(�ӵ��� ����)
		//���� Ű ��� �� �������� ����� ������ ����----->Ű ���� ���� �ߺ� ��Ű�� ����		
		Map<String, String> m =new HashMap<>();
		//Hong -> Hash function(HashMap) -> 0x21949CB (�ߺ� ���� �߻����� ����)
		m.put("Hong", "ȫ�浿");
		m.put("Kang", "������");
			System.out.println(m.get("Hong"));
			
		m.put("","�����ż�");				//����ִ� Ű�� ����� �� ������ Map�� �������� �ùٸ��� ����.
		m.put("park", "");				//Ű�� ������ ���� ������� ���� ����
		if(m.get("Park").equals("")) {
			m.put("park", "��");
		}
		m.remove("Hong");
		System.out.println(m);
		
		
		//Map : �������� �ڷ����� ����� �� ����
		Map<String,Integer> m2 =new HashMap<>();
		m2.put("age",32);
		m2.put("level",5);
			//System.out.println(m2.get("age"));
			System.out.println(m2.keySet());			//key�� ���
			System.out.println(m2.values()); 			//���� ���
			System.out.println(m2.containsKey("tel"));	//�ش� Ű�� �ִ��� Ȯ��(false:����, true:����)
	}

}
