
public class Exception6 {

	public static void main(String[] args) {
		/*q. 
		 ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� �������� 
		 �ܺ� Ŭ������ ����.
		 �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ� Ȧ���� ��� 
		 "Ȧ���� �Դϴ�"�� ȸ�� �ǵ��� �մϴ�.		 */

		
		num nb = new num();
		try {
			int a =45*3+16+5+22*8;
			System.out.println(a);
			
		}catch(Exception e) {
			System.out.println("Ȧ���� �Դϴ�");
			if(e.getMessage()==null) {
				System.out.println(e);
			}
		}
	}

}
class num{
	public void number(int aa) throws Exception {
		if(aa%3==0) {
			throw new Exception();
		}
		else {
			
		}
	}
}