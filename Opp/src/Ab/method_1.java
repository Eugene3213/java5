package Ab;

import java.util.Arrays;
import java.lang.reflect.Member;

public class method_1 extends ide_mth1{	//pakage Ab2에서 import할 수 있도록 하며, 외부 클래스도 동일하게 모두 가져오게함
	
	public void recall() {	//
		System.out.println("TEST");
	}
	protected static void name() {
		System.out.println("홍길동");
	}
	
	

	public static void main(String[] args) {
		//Array.sort :  배열 오름차순 정렬(숫자,한글,영문) 단, 영문일 경우 대문자가 제일 먼저 오름ㅊ차순으로 정렬 됨.
	
		/*int number_data[]= {5,7,1,4,9,2};
		Arrays.sort(number_data);		//sort : 오름차순
		System.out.println(Arrays.toString(number_data)); */
		
		/*String user_data[]= {"홍길동","장보고","김유신","이순신"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data)); */
		
		/*q.변수를 2개 생성해서 하는 문자, 숫자 현재 가입된 상요자에 아이드를 확인 후 해당 포인트가 적립 되도록 합니다.
		 단, 기존 포인트 + 적립금 포인트에 대한 결과를 출력하셔야 합니다.
		 출력은 main class에서 사용함
		 배열: */
		String a= "park";
		int b=2000;
		String c="감소";
		
		ide_mth1 m1=new ide_mth1();
		m1.setter(a,b);
	}
}



class ide_mth1 extends mth1{
	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total=0;
	private String msg;
	
	public ide_mth1() {
		this.member_ship=new String[][]{
		 	{"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
		 	{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		 };
		 this.ea=this.member_ship[0].length;
		 
	}
	
	@Override
	public void setter(String data1, int data2) {
		this.data1=data1;
		this.data2=data2;
		this.loops(this.data1,this.data2,this.ea);
		
	};
	public static void loops(String a, int b, int c) {
		int w=0;
		int total=0;
		while(w<c) {
			if(this.member_ship[0][w].equals(a)) {
				this.total=Integer.parseInt(this.member_ship[1][w])+data2;
			}
			w++;
		}
		this.msg="증감";
	}
	@Override
	public void setter(int data3[]) {
		
	};
	@Override
	public String getter() {
		String print = this.data1+"님 포인트가"+this.total+"증감 되었습니다";
		return null;
	};
}