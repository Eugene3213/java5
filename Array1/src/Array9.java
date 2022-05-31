import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {

		/*q. 두개의 데이터 배열이 있습니다. 해당 데이터 배열을 다음 결과처럼 값을 출력하시오
		 
		 1번 DATA : 대한민국 일본 중국 베트남 태국
		 2번 DATA ; 40 35 70 55 32
		 결과 DATA ; ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]		 */

		
		String data[][]= {
				{"대한민국","일본","중국","베트남","태국"},
				{"40","35","70","55","32"}
		};
		int ar =data.length;
		int ar2 =data[0].length;
		
		String newdata[]=new String[data[0].length]; 	
		
		int w=0;
		do {

			int ww=0;
			do {
				System.out.println(data[w][ww]);
				newdata[ww] =data[0][ww] + "(" + data[1][ww] + ")";
					
				ww++;
			}while(ww<ar2);
			
				
			
			w++;
		}while(w==0);
		
		System.out.println(Arrays.toString(newdata));
		
		
//		int a=stress.length;
//		int b=stress.length;
//		
//		int c,cc;
//		
//		for(c=1;c<a;c++) {
//			
//			for(cc=1;cc<b;cc++) {
//				
//			}
//		}
//		System.out.println(c);
		
		
		/*q. 해당 두개의 배열 데이터가 있습니다. 각 배열별로 인덱스가 같은 번호를 더해서 짝수,홀수인지를 배열ㅇ 결과 데이터로 재설정 하십시오.
		 
		 Adata = 5 17 19 22 33
		 Bdata = 1 2 3 4 5
		 Result =["짝수","홀수","홀수","작수","짝수"]		 */
		
		
		int A1[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
				
		int data_ea=A1[0].length;
		int f=0;
		int total;
		String result;
		String result_data[]=new String[5];
		
		while(f<data_ea) {
			total =A1[0][f]+A1[1][f];
			
			if(total%2==0) {
				result="짝수";
			}
			else{
				result="홀수";
			}
			result_data[f]=result;
			
			f++;
		}
		 
		System.out.println(Arrays.toString(result_data));
		
		
		
		
		
		
	}

}
