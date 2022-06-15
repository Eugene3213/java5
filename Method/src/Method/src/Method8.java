
public class Method8 {

	public static void main(String[] args) {
		

		/*q.협업 프로그래머가 해당 DB에 값 중 홀수값에 대한 총 개수를 받고자 합니다.
		 해당 개수가 출력될 수 있도록 코드를 작성하시오.		 */
	
	odbc db =new odbc();
		System.out.println(db.nb2());
	
	
	}

}
class odbc{
	private int number[];			//배열값이 변경되지 않도록 사용
	private int ct=0;				//홀수일 경우 +1씩 증가하기 위한 필드 변수값
	
	public odbc() {
		int odata[]= {15,22,17,14,32,35,19,33};
		this.number=odata;
	}
	
	public int nb2(){
		int w=0;
		int e=this.number.length;
		//int ct=0;
		
		while(w<e) {
			if(this.number[w]%2==1) {
				this.ct++;			//홀수이면 +1씩 증가
			}
		w++;	
		}
		return this.ct;			//최종값을 return시킴
		
	}
		
		
	
}
