
public class Exception4 {

	public static void main(String[] args) {	
		try {			
			ex e= new ex();
			e.loader("data");
			
//			Exception aa=new Exception();		//throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ��
//			throw aa;
			
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);				
			}
		}
	}

}
class ex{
	Exception ep=null;
	public void loader(String a) throws Exception {		//throws�� try-catch�� �ޱ� ����
		/*�߸��� �������� (�ڽ��� ������ ���� ���� class�� ��� �����ϴ� ��Ȳ)
		if(a=="ok") {
			int keycode  = Integer.valueOf(a);		//������������, loader class ��ü���� ������ �߻�			
		}
		else {
			this.ep=new Exception();	//�ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ���
			throw this.ep;		
		}		*/
		try {
			if(a=="ok") {
				int keycode =Integer.valueOf(a);
			}
			else {
				System.out.println("test");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			this.ep=new Exception();		//�ڽ��� ���� ������ ���� �޾Ƽ� Ȯ����
			throw this.ep;
		}
	}
}
		