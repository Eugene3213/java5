import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream�� �̿��� ���� �ε�
public class file11 {

	public static void main(String[] args) throws IOException{
		try {
			InputStream fs =new FileInputStream("C:\\java5\\File_Stream\\src//list.txt");
			//=FileInputStream is =new FileInputStream("C:\\java5\\File_Stream\\src//list.txt");
				System.out.println(fs.available());	//available : ���� ��ü ũ�� 
			byte[] temp=new byte[fs.available()];	//���� ũ�� ������ �뷮 �迭 ���� ( ���� ũ�⿡ ���� ������ �ְ� ����)
			int ea= fs.read(temp);
			String data =new String(temp,"UTF8");
				System.out.println(data);
			/*
			byte[] temp = new byte[100];	//����ũ�� ������ �ɶ�
			int ea= fs.read(temp);			//ASCII �ڵ�� ��ü�� �о ea�� �޵���
			String data =new String(temp,"UTF8");	//String �������·� �迭�� �޾Ƽ� ���
				System.out.println(data);	*/
		}catch(Exception e) {
			
		}
	}

}
