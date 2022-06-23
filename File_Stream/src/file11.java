import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream을 이용한 파일 로드
public class file11 {

	public static void main(String[] args) throws IOException{
		try {
			InputStream fs =new FileInputStream("C:\\java5\\File_Stream\\src//list.txt");
			//=FileInputStream is =new FileInputStream("C:\\java5\\File_Stream\\src//list.txt");
				System.out.println(fs.available());	//available : 파일 전체 크기 
			byte[] temp=new byte[fs.available()];	//파일 크기 무제한 용량 배열 파일 ( 파일 크기에 따라 유동성 있게 변함)
			int ea= fs.read(temp);
			String data =new String(temp,"UTF8");
				System.out.println(data);
			/*
			byte[] temp = new byte[100];	//파일크기 제약을 걸때
			int ea= fs.read(temp);			//ASCII 코드로 전체를 읽어서 ea에 받도록
			String data =new String(temp,"UTF8");	//String 문자형태로 배열을 받아서 출력
				System.out.println(data);	*/
		}catch(Exception e) {
			
		}
	}

}
