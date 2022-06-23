import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/* q. �ش� ����ڰ� ��ȭ������ �˻��մϴ�.
 * �ش� ��ȭ���� �´� �����Ͱ��� ������� 
 * ��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�. 
 * ��Ʈ: Scanner ���
 * "�˻��� ��ȭ������ �Է��ϼ���"  -> ���˵���2
 * [���˵���2] - ��õ5 2022�� 4�� ����
 * 
 * "�˻��� ��ȭ������ �Է��ϼ���" -> �Ƿη�
 * "�˻��� ��ȭ�� Ȯ�� ���� �ʽ��ϴ�."

����� �� - ��õ 3 2022�� 1�� 5�� ����
Ư�� - ��õ 3 2022�� 1�� ����
���������� - ��õ 2 2022�� 1�� 19�� ����
ŷ����Ŀ - ��õ 2 2022�� 1�� 26�� ����
����: ������ ��� - ��õ 3 2022�� 1�� 26�� ����
�߰ſ� �� - ��õ 3 2022�� 3�� 23�� ����
���� - ��õ 3 2022�� 3�� 8�� ����
���˵��� 2 - ��õ 5 2022�� 5�� 11�� ����
������ - ��õ 3 2022�� 1�� 14�� ����
���콺 - ��õ 2 2022�� 1�� 28�� ����
��íƼ�� - ��õ 4 2022�� 2�� 18�� ����
�ں��� - ��õ 3 2022�� 2�� 18�� ����
�� ��Ʈ�� - ��õ 2 2022�� 3�� 4�� ����
���� ��Ʈ������ �δ� ��Ƽ���� ���� �ŵ�Ͻ� - ��õ 5 2022�� 3�� 25�� ����

 
 */
public class Example1 {

	public static void main(String[] args) throws IOException{
		
		try {		//���� �ε� �� �޼ҵ� ����
			Scanner sc = new Scanner(System.in);
				System.out.println("1.������ȭ 2.����������ȭ : ");
			int user= sc.nextInt();
			if(user==1) {
				movie m= new movie("C:\\java5\\File_Stream\\src//Example1.txt");				
			}
			else if(user==2) {
				System.out.println("���� �غ����Դϴ�");
			}
			sc.close();
		}catch(Exception k) {
			if(k.getMessage()!=null) {
				System.out.println("���� �����ͺ��̽��� ���� ������ �߻��߽��ϴ�");		
			}
		}
	}
}
class movie{
	private String path="C:\\java5\\File_Stream\\src//Example1.txt";
	private BufferedReader br= null;
	private FileReader fr=null;
	private ArrayList<String> list=null;
	private Scanner sc=null;
	
	public movie(String filename) throws IOException{
	
		try {
			this.fr=new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.custom();
			
			this.fr.close();
			this.br.close();
			
			this.search();
		}catch(Exception a) {
			System.out.println(a);
		}
	}
	public void custom() throws IOException{
		this.br =new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		String datas=null;
		
		do{
			this.list.add(datas);
		}while((datas=this.br.readLine())!=null);
		
		System.out.println(this.list);
		
	}
	public void search() {
		this.sc =new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է��� �ּ���: ");
		String subject= this.sc.next().intern();
		boolean call= false;
		for(String moviesb : this.list) {
			if(subject.indexOf(moviesb)==-1) {
				System.out.println(moviesb);
				call=true;
			}
		}
		if(call==false) {
			System.out.println("�����͸� Ȯ�� �� �� �����ϴ�");
		}
		this.search();
	}
}
