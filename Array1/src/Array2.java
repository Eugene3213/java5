
public class Array2 {

	public static void main(String[] args) {

		// hong kim park lee jang jung 배열작성

		String id[]= {"hong","kim","park","lee","jang","jung"};
		
		int word =id[4].length();
		//System.out.println(word);
		
		
		
		
		// q. 해당 사용자 리스트 배열이 있습니다. 해당 배열값 중 사용자 아이디 세글자 이상만 출력시키시오. 
		
		int member = id.length;		//전체 회원수를 파악하기 위함
		int w=0;
		int word3;					//각각의 배열 데이터의 문자 개수파악
		
		while(w<member) {
			word3=id[w].length();	//문자 개수파악
			
			if(word3 > 3) {			//세글자 이상의 데이터만 출력
				//System.out.println(id[w]);
			}
				
			w++;
		}
			
			
		/* q. 배열데이터는 다음과 같음
		 * 15 60 11 14 27
		 * 다음 데이터 값을 모두 더해서 최종 결과값을 출력하시오		 */
	
		int data[]= {15,60,11,14,27};
		int data_ea = data.length;
			//System.out.println(data_ea);
		
		int total=0;					//합계
		int dw=0;
		
		while(dw<data_ea) {
			System.out.println(data[dw]);
			
			total=total+data[dw];
		
			dw++;
		}
	
		System.out.println("총 합계: " + total);
	
	}

}
