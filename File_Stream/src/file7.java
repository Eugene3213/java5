import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
//공통명령어 사항 : read(); , readLine(); , next(); ,nextLine();
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src//buffer.txt",Charset.forName("UTF8"));
				//System.out.println((char)fr.read());
			BufferedReader bf = new BufferedReader(fr);	//readLine()으로 해당 값을		//BufferedReader : Temp(임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있습니다.
				System.out.println(bf.readLine());		//해당 임시저장ㅅ오에서 저장된 내용 중 한개의 라인으로 로드하게 됩니다.
		//Buffer 최초 값을 출력하였을ㅇ 경우 무조건 다음 라인의 값을 출력하게 되빈다.
					
			String data = bf.readLine();	
			int w=0;
			while(w<=2) {
				
				System.out.println(bf.readLine());
				System.out.println(data);
				w++;
			}
				
		}catch(Exception z) {				
			System.out.println(z);
		}
		

	}

}
