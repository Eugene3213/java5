import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file6 {
//Scanner�� �̿��� ���� ���� ����
	public static void main(String[] args) throws IOException{
		
		try {			
		FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src//db.txt");
		Scanner sc= new Scanner(System.in);		//����� �����Է�
			System.out.println("������ �Է��� �ּ���");
		for(int a=0;a<3;a++) {		//���� �ݺ�
			String notice =sc.nextLine()+ "\n";
			fw.write(notice);		//�ش� �Է»����� db.txt�� �����Ŵ
		}
			sc.close();
			fw.close();
		}catch(Exception z) {
			System.out.println(z);
		}
	}

}
