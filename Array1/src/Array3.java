import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		int data[]= {5,10,15,20,25,30,35};
		
		/* foreach���� ����Ҷ��� �ε��� ��ȣ�� �ʿ���� ����� ���
		 * for do while�� ����Ҷ��� �ε��� ��ȣ�� �ʿ��� �� ���
		 * 
		 * [0][1][2] : �ε��� ��ȣ
		 */
		
		
		for(int f : data) {					//int f�� ���������� data�迭 ���� �޾Ƽ� ����. �ܼ��� �迭���� ��� foreach
			
			if(f%2==0) {
				//System.out.println(f);
			}
		}
		
		String pay[]= {"�������Ա�","�ſ�ī��","�޴���","��ǰ��","����"};
		
		Scanner sc =new Scanner(System.in);
			//System.out.println("���� �ϰ��� �ϴ� ���¸� ������ �ּ���: ");
			String pm=sc.next();
			
		for(String z : pay) {					//�迭 �����Ͱ� �����̹Ƿ� �޴� ���� ���� ���� �������� ����ؾ� ��.
			
			//1.
			if(pm.equals(z)) {
				//System.out.println(pm+ "�� ���� ���� �˴ϴ�");
			}
			
			//2.
			/*if(pm.equals("�޴���")) {
				System.out.println("���� �ý��� �������� �ش� ������ �Ұ��մϴ�");
			}
			else {
				System.out.println(pm+ "�� ���� ���� �˴ϴ�");
			} */
		
		
		}
		sc.close();
				
		
		
		
		/*q. {"�ܹ���", "����", "ġŲ", "Ŀ��"}
		 * "�ֹ��ϰ��� �ϴ� ������ ������ �ּ���"
		 * �ش� ������ �� �׹��� ����� �˴ϴ�.
		 * ��, "�ֹ�����"��� ����ڰ� �Է½� �� ��� �ֹ��� ����Ǹ� �ֹ� ������ ����Ͻÿ�. 		 */
		
		String food[]={"�ܹ���", "����", "ġŲ", "Ŀ��"};
		
		Scanner sc1=new Scanner(System.in);
			System.out.println("�ֹ��ϰ��� �ϴ� ������ ������ �ּ���");
			String user=sc1.next();
			
			
			
			for(String a : food) {
				
				if(user.equals(a)) {
					System.out.println("�ֹ��ϰ��� �ϴ� ������ ������ �ּ���");
				}
				else if(user.equals("�ֹ�����")) {
					System.out.println("�ֹ��� ����Ǿ����ϴ�. �ֹ�����: ");
				}
			}
			sc1.close();	
				
			
		
		
		

	}

}