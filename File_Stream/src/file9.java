import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
//Reader(최상위) - (하위) BufferReader, FileReader, CharArrayReader - 문서파일 ASCII
//				(하위) InputStreamReader -이미지, 동영상, 오디오 파일
public class file9 {
//InputStream(입력)
	public static void main(String[] args) {
		//Stream ; 이미지, 동영상 , 오디오 같은 파일을 로드하기 위해서.(binary)
		//inputStream : 입력장치에 대한 값을 받는 클래스 입니다. 기본(int)-ASCII 코드
		//inputStream (최상위 입력장치)
		//(하위 클래스)-FileInputStream, AudioInputStream, ObjectInputStream 
		InputStream is = new InputStream() {		//기본 클래스를 로드하여 오버라이드 메소드
			
			@Override
			public int read() throws IOException {		
				int a = 15;
				return a;
			}
		};		
		//InputStreamReader (언어패킷 변경)
		//FileinputStream일 경우: InputStreamReader ( "파일명" ,EUCKR) or InputStreamReader("파일명" , UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
			try{
				System.out.println(is.read());
			}catch(Exception z) {
				System.out.println(z);
			}
	
			
			//키보드값 로드
			InputStream user= System.in; //inputStream 의 기본 사용법
			try {
				int code = user.read();	//키보드 입력 ACSII 코드값을 반환함
				if(code==13) {
					System.out.println("엔터키는 사용할 수 없다");
				}
				System.out.println(code);
			}catch(Exception z) {
				
			}
			
	}

}
