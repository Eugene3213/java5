
public class Method5 {

	public static void main(String[] args) {

		cdb c =new cdb();
		
		/*c.d3="ȫ�浿";
		
		c.data2();
		
		c.d3="�̼���";
		c.data1();
		
		c.d3="������";
		System.out.println(c.data3());*/
	
		//c.d2= "������";      private�� ������ ��ü�̹Ƿ� main class���� �ε� �Ұ�
		c.data2("������");
		String result =c.data3();
			System.out.println(result);
	}

}
class cdb{
	
	String d1=null;		//void �ڷ��� �޼ҵ� �ε� ����
	private String d2=null;
	public static String d3;	// ��� ��� ����
	
	public static void data1() {
		System.out.println(d3);
		//System.out.println(this.d2);		//static �ڷ��� �ܿ��� �ε尡 �Ұ�����
	}
	public void data2(String user) {
		this.d2=user;
		System.out.println(d2);
	}
	public String data3() {
		String a=this.d2;
		return a;
		
	}
	
}