import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
//Reader(�ֻ���) - (����) BufferReader, FileReader, CharArrayReader - �������� ASCII
//				(����) InputStreamReader -�̹���, ������, ����� ����
public class file9 {
//InputStream(�Է�)
	public static void main(String[] args) {
		//Stream ; �̹���, ������ , ����� ���� ������ �ε��ϱ� ���ؼ�.(binary)
		//inputStream : �Է���ġ�� ���� ���� �޴� Ŭ���� �Դϴ�. �⺻(int)-ASCII �ڵ�
		//inputStream (�ֻ��� �Է���ġ)
		//(���� Ŭ����)-FileInputStream, AudioInputStream, ObjectInputStream 
		InputStream is = new InputStream() {		//�⺻ Ŭ������ �ε��Ͽ� �������̵� �޼ҵ�
			
			@Override
			public int read() throws IOException {		
				int a = 15;
				return a;
			}
		};		
		//InputStreamReader (�����Ŷ ����)
		//FileinputStream�� ���: InputStreamReader ( "���ϸ�" ,EUCKR) or InputStreamReader("���ϸ�" , UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
			try{
				System.out.println(is.read());
			}catch(Exception z) {
				System.out.println(z);
			}
	
			
			//Ű���尪 �ε�
			InputStream user= System.in; //inputStream �� �⺻ ����
			try {
				int code = user.read();	//Ű���� �Է� ACSII �ڵ尪�� ��ȯ��
				if(code==13) {
					System.out.println("����Ű�� ����� �� ����");
				}
				System.out.println(code);
			}catch(Exception z) {
				
			}
			
	}

}
