import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src//list.txt",Charset.forName("EUCKR"));	//Charset.forName : JAVA12 -> EUCKR(ANSI),UTF8,UTF16
			//FileReader fr = new FileReader("C:\\java5\\File_Stream\\src//list.txt");			
			//System.out.println(fr.getEncoding()); //���ڴ� ������ Ȯ�� FileReader
			//System.out.println(fr.read());		//������ ũ��
			//System.out.println(m); 			//-1:������ ���� (�� �̻� ���ڰ� ���� ���)
			while(true) {			//loop�� Ȱ���Ͽ� �ش� ���Ͽ� ���ڸ� ��� ������
				int m=fr.read();
				System.out.print((char)m);
				if(m==-1) {			//�� �̻� ������ ���ڰ� ���� ��� loop ��������
					break;
				}
			}
			fr.close();  //FileReader�� ������
		}catch(Exception z) {
			if(z.getMessage()!=null) {
				System.out.println(z);
			}
		}
		

	}

}
