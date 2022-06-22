import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 로드 사용법
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in :  input
		//system.out : output
		try {
			FileReader fr= new FileReader("C:\\java5\\File_Stream\\src//db.txt",Charset.forName("UTF8"));
			Scanner sc=new Scanner(fr);		//system.in (사용자가 직접 입력.), FileReader : 파일을 로드
//			for(;;) {		//loop시 예외처리로 빠질 수 있음
//				String result= sc.nextLine();		//로드 된 입력값을 result로 전달
//				if(result!=null) {
//					System.out.println(result);		//출력					
//				}
//				else {
//					sc.close(); break;
//				}
//				
//			}
			int count =0;
			while(sc.hasNext()) {		//hashNext() : true , false
				sc.nextLine();
				count++;
			}
			System.out.println(count);
			sc.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
