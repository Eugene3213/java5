
public class Exception5 {
	//����: ���� �ְ�, ��¸� ��
	public static void main(String[] args) {
		try {
			words wd=new words();
			String result=wd.files("ȫ�浿");
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("���� ������ �Ǿ� �ùٸ� ���� ���� ���� ����");
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		finally {
			try {
				String result =wd.files("ȫ�浿");
				System.out.println(result);
			}catch(Exception f) {
				System.exit(0);
		}

	}

}
class words{
	//����: ���� �ް�, ���� �� return
	public String files(String aa) throws Exception{
		if(aa==null || aa.equals("")) {
			throw new Exception();		//=> Exception ea= new Exception(); ����
		}
		else {
			String  msg= aa+"�� ȯ���մϴ�";
			return msg;			
		}
	}
}}