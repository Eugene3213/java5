import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int a=sc.nextInt();
			
			
			if(a>60) {
				System.out.println("해당 숫자는 60까지만 입력이 되어야 합니다");
			}
			if(a<=60) {
				
				if(a%2==0) {
					System.out.println("짝수입니다");
				}
				else {
					System.out.println("홀수입니다");
				}
			}
			
			sc.close();
				
			

	}

}
