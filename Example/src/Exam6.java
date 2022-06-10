import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		/*
		 상품가격은 420000 입니다.
		 사용자가 해당 상품 개수를 입력하게 됩니다.
		 해당 상품 가격에 맞는 개수만큼 곱하여 최종 결제 금액을 출력시키는 extends를 제작하시면 됩니다.
		 단, 420000은 절대 숫자가 바뀌면 안됩니다.
		 사용자가 최대 구매 할 수 있는 개수는 5개 까지 입니다;		
		 최종결과 값은 main method에서 출력합니다 */

		number_2 nb=new number_2();
		
		Scanner sc=new Scanner(System.in);
			System.out.println("상품 개수를 입력하세요");
			int a=sc.nextInt();
			
		
		
		
	}

}
class number{
	
	private int w1;
	private int e1;
	protected int r;
	
	public void price(final int w, int e) {
		this.w1=w;
		this.e1=e;
		this.r=this.w1*this.e1;
	}
}
class number_2 extends number{
	
	public void pric2() {
		
		
	}
}