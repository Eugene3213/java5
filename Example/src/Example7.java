
public class Example7 {

	public static void main(String[] args) {
		/* 다차원 배열로 생성 + 외부 class 및 메소드 사용
		 [data]
		 {"홍길동","합격"},
		 {"이순신","합격"},
		 {"강감찬","불합격"},
		 {"김유신","합격"},
		 {"유관순","불합격"},
		 {"장보고","불합격"}
		 
		 다차원 배열 형태이며, 해당 값중 합격자만 출력되도록 합니다.
		 단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 결과 ; 홍길동 이순신 김유신		 */
		
		id nm=new id();
		id.name();
		
	/*	id i =new id();  				void 사용시
		i.name();
		i=null;	*/
	}

}
class id{
	public static void name() {
		String data[][]= {
				{"홍길동","합격"},
				{"이순신","합격"},
				{"강감찬","불합격"},
				{"김유신","합격"},
				{"유관순","불합격"},
				{"장보고","불합격"}
		};
		
		int ea=data.length;
		
		int w=0;
		
		while(w<ea) {
			
			if(data[w][1].equals("합격")) {
				System.out.println(data[w][0]);
				//System.out.printf("%s님 %s 입니다",data[w][0],data[w][1]);
			}
			
			w++;
		}
		
		
		
		
	}
}