package ex;

public class Example6 {

	public static void main(String[] args) {


		int data[]= {10,20,30,40,50};
		
		order or=new order();
		or.order_check(data);		//setter값을 받음
		int result =or.order_recall();		//getter로 값을 가져옴
			System.out.println(result);		//최종 결과값이 적용
	}

}
abstract class abstr{		//추상클래스
	//필드영역: 자료형 변수
	abstract public void order_check(int adata[]);		//setter
	public abstract int order_recall();		//getter
}
class order extends abstr{
	//필드영역 : 필드선언-> 1개 이상의 메소드에 값을 사용해야 할 경우만 필드에 선언함.
	private int total=0;
	
	@Override
	public void order_check(int[] adata) {		//배열을 반복  +짝수값만 출력= 최종값
		int ea=adata.length;
		int w=0;
		while(w<ea) {
			if(adata[w]%2==0) {
				this.total+=adata[w];
			}
			w++;
		}
	}
	@Override
	public int order_recall() {			//최종값을 리턴
		
		return this.total;
	}
}