import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88}
		 * �ش� ������ �� �� ���ڰ��� ��� ������ ��迭 �Ͻñ� �ٶ��ϴ�.
		 * ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter)�� �����մϴ�.
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.	
		 * getter���� �ش� �迭�� return���� �������� �մϴ�. 
		 * ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ� */
		
		try {
			redata r= new redata();
			Object data[]={"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
			r.setter(data);
			LinkedList result = r.getter();		//return �޴� ���� �迭 class�̹Ƿ�  �ش� class���� ���� �� �޾ƾ� ��.
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
				String check =String.valueOf((String)call[w]);	//�ش� �迭 �ε� �� �ڷ��� ��ȯ�� �ϴ� ������ Object�迭�̹Ƿ� ����
				this.redata.add(check);
				//System.out.print(check+",");
			}catch(Exception ex) {	//�ڽ� class ���� ���� �߻��� ��µǴ� catch ��
				//�� throw ����ϸ� �ٽ� main���� ��ȯ
				//call.�߿��� ������ throw�� ���� �� �ش� �ݺ������� ����
			}
			w++;
		}while(w<ea);
	}
	public LinkedList<String> getter() {
//		LinkedList<String> lk =new LinkedList<>();
//		lk.add("ȫ�浿");
//		lk.add("�̼���");
//		lk.add("������");	
		return this.redata;
	}
}