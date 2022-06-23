package java_test;

import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
	/*	해당 데이터가 있는 상황 입니다. 해당 데이터 중 최고 고점자 사용자만 출력을 하시오.
		출력 예
		1등 : Daniel(98)
		{
		{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
		{"65","74","23","75","68","96","88","98","54"}
		}
		※ abstract는 필수로 사용하시길 바랍니다.      */

		name1 nm=new name1();
		nm.name2();
		System.out.println(nm.turn());
	}

}
abstract class name{
	public abstract void name2(); 

}	
class name1 extends name{

	private String result1=null;
	private int ff;
	String msg=null;
	public String[][] arrays={
			{"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
			{"65","74","23","75","68","96","88","98","54"}
		};

	@Override
	public void  name2() {
		int w=0;
		int ea=this.arrays[0].length;
		this.ff=Integer.parseInt(this.arrays[1][0]);		
		while(w<ea) {
			if(Integer.parseInt( this.arrays[1][w])>ff) {
				this.ff=Integer.parseInt(this.arrays[1][w]);
				this.result1=this.arrays[0][w];
			}
			w++;
			this.msg=this.result1+"("+this.ff+")";
			this.turn();
//			System.out.println(arrays.toString(this.arrays));
		}
	}
	
	public String turn() {
		return this.msg;
	}
}