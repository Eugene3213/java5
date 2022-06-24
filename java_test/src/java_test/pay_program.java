package java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {
		payroll py =new payroll();
		py.start();
		int result[] = py.check();
			System.out.println("�� �Ա��� �ݾ���" + result[0]+"�̸�, �� �ܰ��"+result[1]+"�Դϴ�");
	}
}
class payroll extends pay_abstract{
	String filename=null;
	int total=0;
	int allmoney=this.money;		//���� �ܰ�
	//�Ա� ��Ʈ
	public void input_sc() {
		Scanner sc =new  Scanner(System.in);
		int c=0;		//�ݺ��� ����
		int m_in=0;		//�繫�� ����ڰ� �Է��ϴ� �޿�
		while(c< this.em_name.size()) {
			System.out.println("��ü�� �����մϴ�.["+ this.em_name.get(c)+"]���� ��ü�Ͻ� �ݾ��� �Է��� �ּ���");
			m_in =sc.nextInt();
			this.allmoney-=m_in;
			this.total +=m_in;		//��ü�� ��ü �ݾ�
			c++;
		}
		sc.close();
	}
	@Override
	public void start() {
		try {
			this.filename ="C:\\java5\\java_test\\src//employee.txt";
			this.db();
			this.input_sc();
			//System.out.println(this.em_name.size());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	@Override
	void db() throws IOException {
		this.em_name =new ArrayList<>();		//�� �迭 ����
		this.fr=new FileReader(this.filename,Charset.forName("UTF8"));
		//			System.err.println(this.fr.getEncoding());		//���ڵ� ����
		BufferedReader br = new BufferedReader(fr);
			//System.out.println(br.readLine());
		String data =br.readLine();
		String user[]=data.split(",");
		int w=0;
		int ea=user.length;
		while(w<ea) {
			this.em_name.add(user[w]);
			w++;
		}
		System.out.println(this.em_name);
		br.close();
		fr.close();
	}
	@Override
	public int[] check() {
		return new int[] {this.total,this.allmoney};
	}
}
