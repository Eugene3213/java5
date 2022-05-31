import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {

		/*q. 다음중 장바구니에 여려개의 상품이 담겨져 있습니다.
		 * 그 중 택배비가 별도로 측정되는 금액만 추출하시오.
		 * 댁배비는 30000 만원이상(포함)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 
		 * [48000,67000,118200,49800]		 */
		
		
		int a[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int a_ae= a.length;
		int w=0;
		
		int b[] = new int[4];
		
		int ct=0;
		while(a_ae>w) {
			//System.out.println(a[w]);
			
			if(a[w]>=30000) {
				b[ct]=a[w];
				ct++;
			}
			w++;
		}
		System.out.println(Arrays.toString(b));	
		
		
		
		
		
		

	}

}
