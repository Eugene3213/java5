
public class Exception1 {
//Exception : try,catch�� �Բ� ����� �ϰ� �˴ϴ�. (����ó������)
// -RuntimeException --> Error �߻� �� ���� ó�� üũ ���� -Null, Class, Arraysize
// -OtherException --> ���� ó�� üũ���� ��� ��	
	public static void main(String[] args) {
		/* Exception ����
		 Arithmetic : 0���� ���� �� ���߻�
		 NullPointer : Null��ü�� ������ ��
		 ClassCast  :  Ŭ������ ��ȯ
		 NumberFormat : ���������� ��ȯ
		 ArrayIndexOutOfBound : �迭 ���� �� �ε��� ��ȣ ����
		 IOException : ����� ���� �߻�
		 Exception : ��ü ���� ó�� ��Ȳ 
		 */
		int a;
		String b= "a1";
		try {		//1. try : �ش� ���� int�� ������ 
			a = Integer.valueOf(b);		//2. error �߻� : a1�̶�� �����ε� ������ ���ڷ� ��ȯ �� a��� ���ڷ� ���Ͽ� ����
		}
		catch(NumberFormatException e){
			System.out.println(e); 		//3. � �κп��� ������ �߻��ߴ��� üũ��.
		}
		finally {
			b =b.replaceAll("[a-z][A-Z]","");		//4. ������ ��ó�� ��
			a =Integer.valueOf(b);		//5. ������ ���ۼ��ؼ� ���
		}
		System.out.println(a);		//6.���� ����� ���
	}
}
