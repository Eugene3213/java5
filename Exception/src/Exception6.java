
public class Exception6 {

	public static void main(String[] args) {
		/*q. 
		 ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� �������� 
		 �ܺ� Ŭ������ ����.
		 �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ� Ȧ���� ��� 
		 "Ȧ���� �Դϴ�"�� ȸ�� �ǵ��� �մϴ�.		 */		
		try {
			int sum =45*3+16+5+22*8;
			cul cl = new cul();
			String result=cl.cul_method(sum);		//return ��
				System.out.println(result);
			
		}catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());			
			}
		}
	}

}
class cul{
	//�ڷ��� �޼ҵ忡�� return ��  ����,����,�Ҽ�, Object�� ���� �ڷ����� ����Ǿ� ����
	public String cul_method(int s) throws Exception {
		if(s%2==0) {
			throw new Exception("����ó�� �߻����� ��Ȯ���� �ʿ��մϴ�");
		}
		else {
			String msg="Ȧ�� �Դϴ�";
			return msg;
		}
	}
}