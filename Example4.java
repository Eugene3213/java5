import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 상품가격은 420000 입니다.
		 사용자가 해당 상품 개수를 입력하게 됩니다.
		 해당 상품 가격에 맞는 개수만큼 곱하여 최종 결제 금액을 출력시키는 extends를 제작하시면 됩니다.
		 단, 420000은 절대 숫자가 바뀌면 안됩니다.
		 사용자가 최대 구매 할 수 있는 개수는 5개 까지 입니다;		
		 최종결과 값은 main method에서 출력합니다 */
	
		
		subb2 sb2=new subb2();
		Scanner sc=new Scanner(System.in);
		
			final int price=420000;
			int w=1;
			
			while( w<6) {
				System.out.println("개수를 입력하시오");
				int user=sc.nextInt();
				
				sb2.thing(price,user);
				
				
				w++;
			}
			int result=sb2.rst();
			System.out.println(result);
				
			sc.close();		
	}
}

class subb{
	protected int val=420000;
	private int val2;
	protected int total;
	
	
	public void thing(int price, int user) {
		this.val=price;
		this.val2=user;
		this.total = this.val * this.val2;
		
	}			
}
class subb2 extends subb{
	
	public int rst() {
		
		return this.total;
	}
}
