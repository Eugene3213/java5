package swing1;

public class swing1 {

	public static void main(String[] args) {
		// wrapper class (BOX����)  : Byte, Integer, Long, Double, 
		// float, char, byte, long, short ( �⺻Ÿ��)
		
		Integer a = new Integer(20);	//new Integer --->�ڽ� ����
		int b =new Integer(20);			// ��ڽ� ����
		if(a==b) {
			System.out.println(a+b);
		}
		Integer no = new Integer(99);	//�ڽ�
		Integer no1 =10;		//��ڽ�
		int aa =no; 		//��ڽ�(�ڵ�)
		Integer bb =no.intValue();	//��ڽ�
			System.out.println(bb);
				
		/* �ڽ̰� �ڽ��� ���� ���� equals�� ����ؾ߸� �񱳰� �̷����.	 */
	}

}
