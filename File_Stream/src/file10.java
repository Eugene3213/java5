import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import javax.print.PrintService;

//OutputStream (output) - �ֻ���
//(����) FileoutputStream, ObjectOutputStream, AudioOutputStream
public class file10 {

	public static void main(String[] args) {
		String a= "12345";
		//byte[] : ���ڿ��� ASCII ������ �迭�� ������ �� ���
		byte[] b =a.getBytes();		//getBytes("�����Ŷ") �޼ҵ�
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out;	//��¸� ��� System.out.print ����
		
		try {
			//os.write(b,0,b.length);		//(byte�迭�̸�, �迭��ȣ, �迭ũ��)
			os.flush();			//��� ��Ʈ
		}catch(Exception z) {
			
		}
		
	

	}
}