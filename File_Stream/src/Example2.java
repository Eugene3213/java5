import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

	public static void main(String[] args) {
		/* �ش� ������ �� ������ �� ������Ȳ�� ������ ������ �Դϴ�. 
		 �ش� ������ �� 100�̸��� ������ ���� �︸ 20220623.txt ���Ϸ� ������ ���� �ǵ��� �Ͻʽÿ�.	 */
		
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
