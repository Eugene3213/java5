import java.util.Scanner;

public class data_type {

	public static void main(String[] args) {
		///intern() : equals를 사용하지 않고 ==(부등 연산기호)로 사용	
		String data[]= {"홍길동"};
		
		String a = "홍길동";
		String b = "홍길동";
		String c =new String("홍길동").intern();
		String d =new String("홍길동");
		String e =data[0];
//		Scanner sc=new Scanner(System.in);
//		String f = sc.next().intern();
		
		System.out.println(a==e);
		//new String : 소속이 없는 자유분방한 자료형 (문자, 배열값) 
		
		String data2[]= {"홍길동","홍길동"};
		
		String h =new String(data2[0]).intern();
		String h2=new String(data2[1]).intern();
		String h3=new String(data2[1]).intern();
		

		
		
		
	}
}
