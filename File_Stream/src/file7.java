import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
//�����ɾ� ���� : read(); , readLine(); , next(); ,nextLine();
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src//buffer.txt",Charset.forName("UTF8"));
				//System.out.println((char)fr.read());
			BufferedReader bf = new BufferedReader(fr);	//readLine()���� �ش� ����		//BufferedReader : Temp(�ӽ������) - ȿ�������� ������ ���� ������ ������ �� �ֽ��ϴ�.
				System.out.println(bf.readLine());		//�ش� �ӽ����夵������ ����� ���� �� �Ѱ��� �������� �ε��ϰ� �˴ϴ�.
		//Buffer ���� ���� ����Ͽ����� ��� ������ ���� ������ ���� ����ϰ� �Ǻ��.
					
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
