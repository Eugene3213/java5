package java_test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/*q. ����ڰ� ���� ���� ���ڸ� �Է��ϴ� �ζ� ���α׷� �Դϴ�. ���μ��� ���� ��
		 "���ڸ� �Է��� �ּ���:" �� ���� ���� ���ڸ� �Է� �ް� �˴ϴ�.
		 �׸��� lotto.txt ����� ���� ������ �ε� �Ͽ� ����ڰ� �Է��� ���� �����
		 ���Ͽ� ��� ������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
		 
		 [�������]
		 �� �� ���� ��ȣ�� ���߼̽��ϴ�.		 */

		lotto lt=new lotto();
		lt.setter();
		
	}
}
class lotto {
	Scanner sc=new Scanner(System.in);
	LinkedList<Integer> k =null;
	String url="C:\\java5\\java_test\\src//lotto.txt";
	
	public void setter() {
		try {
			this.filedload();			
		}catch(Exception e) {
			
		}
	}
	public int getter() {
		return 0;
		
	}
	public void filedload() throws IOException{
		try {
			FileInputStream fi =new  FileInputStream(this.url);			
			//System.out.println(fi.read());
			byte[] temp= new byte[fi.available()];
			int ea= fi.read(temp);	
			String test= new String(temp,0,ea);
				System.out.println(test);
				//�ݺ��� �̿��Ͽ� LinkedList �߰�
				
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private int val1;		//pc
//	private int val2;		//user
//	private String msg;		//����޽���
//	
//	public  void randomck(int pc,int user) {	//setter(�μ��� ����)
//		this.val1=pc;
//		this.val2=user;
//		
//		if(this.val1> this.val2) {
//			this.msg="UP";
//		}
//		else if(this.val1<this.val2) {
//			this.msg="DOWN";
//		}
//		else {
//			this.msg="����";
//		}
//	}
//	//getter (�μ���x)
//	public String result() {
//		return this.msg;
//	}
//}