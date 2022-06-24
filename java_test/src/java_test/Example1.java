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

		/*q. 사용자가 여섯 개의 숫자를 입력하는 로또 프로그램 입니다. 프로세서 시작 시
		 "숫자를 입력해 주세요:" 총 여섯 번의 숫자를 입력 받게 됩니다.
		 그리고 lotto.txt 결과를 가진 파일을 로드 하여 사용자가 입력한 값과 결과를
		 비교하여 몇개를 맞췄는지 검토하는 프로그램 코드를 작성하시오.
		 
		 [결과예시]
		 총 세 개의 번호를 맟추셨습니다.		 */

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
				//반복문 이용하여 LinkedList 추가
				
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private int val1;		//pc
//	private int val2;		//user
//	private String msg;		//결과메시지
//	
//	public  void randomck(int pc,int user) {	//setter(인수값 받음)
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
//			this.msg="정답";
//		}
//	}
//	//getter (인수값x)
//	public String result() {
//		return this.msg;
//	}
//}