import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

	public static void main(String[] args) {
		/* 해당 정보는 각 지점별 댐 수위현황을 적용한 데이터 입니다. 
		 해당 데이터 중 100미만의 수위를 가진 댐만 20220623.txt 파일로 내용이 저장 되도록 하십시오.	 */
		
		try {

			Path damdata=Paths.get("C:\\java5\\File_Stream\\src//dam//20220623.txt");
			Files.createFile(damdata);
			
		}catch(Exception z) {
			System.out.println(z);
		}
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src//originaldata.txt");
		while(true) {
			int w= fr.read();
			System.out.println((char)m);
		}
		}catch(Exception e) {
			
		}

	}

}
