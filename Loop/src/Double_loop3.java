
public class Double_loop3 {

	public static void main(String[] args) {
	
		/*Q.다음 결과값이 출력 되도록 for문으로 작성하시오.
		 * 
		 * 5+2=7
		 * 5+3=8
		 * 5+4=9
		 * 5+5=10
		 * 6+2=8
		 * 6+3=9
		 * 6+4=10
		 * 6+5=11
		 * 7+2=9
		 * 7+3=10
		 * 7+4=11
		 * 7+5=12
		 * ....
		 * 9+5=14
		 */
		
		
		int a,b;
		
		int total;
		
			for(a=5;a<=9;a++) {
				
				for(b=2;b<=5;b++) {
					total=a+b;
					//System.out.println(a+"+"+b+"="+total);
				}
			}
				
		/* q. 더블 while문으로 제작
		 * 
		 * 9*6=54
		 * 9*5=45
		 * 8*7=56
		 * 8*6=48
		 * 8*5=40
		 * 7*7=49
		 * 7*6=42
		 * 7*5=35
		 */
			
		int c=9;
		
		while(c>=7){
			
			int cc=7;
			
			while(cc>=5) {
				System.out.println(c+"*"+cc+"="+(c*cc));
				
				cc--;
			}
			c--;
		}
			
			
		/*q.다음 결과값을 보고 do while문으로 제작하시오.
		 * 5+4=9
		 * 5+5=10
		 * 5+6=11
		 * 5+7=12
		 * 4+4=8
		 * 4+5=9
		 * 4+6=10
		 * 4+7=11
		 * 3+4=7
		 * 3+5=8
		 * 3+6=9
		 * 3+7=10	
		 */
			
		int d=5;
		
		do {
			int dd=4;
			
			do {
				
				System.out.println(d + "+" + dd + "=" + (d+dd));
				dd++;
			}while(dd<=7);
			
			d--;
		}while(d>=3);
			
			
			
			

	}

}
