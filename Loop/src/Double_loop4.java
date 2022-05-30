
public class Double_loop4 {

	public static void main(String[] args) {
		
		/*q. 복합반복문 for, do while */
		
		int f;
		for(f=2;f<=3;f++) {
			
			int w=1;
			do {
				//System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
			
		}

		
		/*q. 구구단 7~9단까지 단, 각 구구단 곱셈값은 5까지만 나오도록 합니다. 7*1=7 ~ 7*5=35 ....9*5=45
		 * 제약(do while, while 순으로 작성)		 */
		
		int a=7;
		
		do {
			
			int b=1;
			while(b<=5) {
														//total=a*b;
				//System.out.println(a+"*"+b+"="+(a*b));  //System.out.printf("%d * %d =%d ",a,b,total);
				b++;
			}
			
			a++;
		}while(a<=9);
		
		
		/*q. 다음 결과값을 확인하여 코드를 작성합니다. 단,for문으로 시작하여 while문으로 제작
		
		1*1=1
		2*2=4
		3*3=9
		4*4=16
		5*5=25
		6*6=36
		7*7=49
		8*8=64
		9*9=81  */
		
		int c;
		
		for(c=1;c<=9;c++) {
			
			
			int d=c;
			while(d<=c) {
				
				System.out.println(c+"*"+d+"="+(c*d));		//total2 =d*c;
				d++;										//System.out.println("%d * %d = %d",d,c,total2);
			}
					
		}
		
		/*q. 다음해당 결과값처럼 출력이 되도록 더블반복문을 이용하시오 while, do while문 작성
		 * 1+1=1
		 * 2+1=3
		 * 2+2=4
		 * 3+1=4
		 * 3+2=5
		 * 3+3=6
		 * 4+1=5
		 * 4+2=6
		 * 4+3=7
		 * 4+4=8		 */
		
		
		
		
		
	}

}
