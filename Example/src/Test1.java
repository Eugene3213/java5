import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			System.out.println("주소를 입력하세요");
			String a=sc.nextLine();
			
			System.out.println("전화번호를 입력하세요");
			String b=sc.next();
			
		System.out.println("해당정보를 확인해주세요 ");
		System.out.println( "주소: "+ a + " 전화번호: "+ b);

		sc.close();
		
	}

}
