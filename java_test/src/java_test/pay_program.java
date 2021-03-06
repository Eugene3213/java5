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
			System.out.println("총 입금한 금액은" + result[0]+"이며, 총 잔고는"+result[1]+"입니다");
	}
}
class payroll extends pay_abstract{
	String filename=null;
	int total=0;
	int allmoney=this.money;		//현재 잔고
	//입금 파트
	public void input_sc() {
		Scanner sc =new  Scanner(System.in);
		int c=0;		//반복문 변수
		int m_in=0;		//재무과 담당자가 입력하는 급여
		while(c< this.em_name.size()) {
			System.out.println("이체를 시작합니다.["+ this.em_name.get(c)+"]에게 이체하실 금액을 입력해 주세요");
			m_in =sc.nextInt();
			this.allmoney-=m_in;
			this.total +=m_in;		//이체된 전체 금액
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
		this.em_name =new ArrayList<>();		//빈 배열 생성
		this.fr=new FileReader(this.filename,Charset.forName("UTF8"));
		//			System.err.println(this.fr.getEncoding());		//인코딩 형식
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
