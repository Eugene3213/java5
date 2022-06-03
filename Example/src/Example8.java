
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Example8 {

	public static void main(String[] args) {
		/*다음 사용자 복권 관련 프로그램을 요청하였습니다.
		 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 "1~46 번 사이의 숫자를 입력해 주세요"
		 사용자가 입력한 5개의 숫자를 배열로 생성하시오. ( main에 처리)
		 
		 외부 class를 이용하여 pc가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		 pc가 뽑은 다섯개의 숫자를 배열로 생성하시오.(외부 class method로 생성)
		 
		 별도의 결과 method를 하나 더 생성하여 사용자가 입력한 
		 다섯개의 데이터와 PC가 뽑은 배열 데이터를 해당 method로 전달하여 출력.
		 
		 단, 모든 사용하는 반복문은 무조건 do while문으로 작성.		 */
		
		Scanner sc =new Scanner(System.in);
			
		int result[] = new int[5];
			int w=0;
			
			 do{
				System.out.println("1~45번 사이의 숫자를 입력해 주세요");
				int a=sc.nextInt();
				result[w]=a;
			
				w++;
			}while(w<5);
			 
			 System.out.println(Arrays.toString(result));
			 
			 sc.close();
			 
			 card c=new card();
			 c.acard(result);
//			 int aa=4;
//			 card c= new card();
//			 c.acard(aa);
		 

}
class card{
		public void acard(int result2[]) {

			Random r= new Random();
			System.out.println(r.nextInt());
		
}
		public static void bcard() {

		}
	}
}