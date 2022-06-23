import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import javax.print.PrintService;

//OutputStream (output) - 최상위
//(하위) FileoutputStream, ObjectOutputStream, AudioOutputStream
public class file10 {

	public static void main(String[] args) {
		String a= "12345";
		//byte[] : 문자열을 ASCII 형태의 배열로 변경할 때 사용
		byte[] b =a.getBytes();		//getBytes("언어패킷") 메소드
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out;	//출력만 사용 System.out.print 역할
		
		try {
			//os.write(b,0,b.length);		//(byte배열이름, 배열번호, 배열크기)
			os.flush();			//출력 파트
		}catch(Exception z) {
			
		}
		
	

	}
}