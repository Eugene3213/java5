import java.io.FileWriter;
import java.io.IOException;

public class file4 {
//���� ���� (write)
	public static void main(String[] args) throws IOException,Exception {
		//FileWrite : ���� �����͸� ���Ͽ� ���� Class
		try {
			String user[]= {"ȫ�浿40","������30","������100","a","b","c","d"};
			FileWriter fw= new FileWriter("C:\\java5\\File_Stream\\src//array.txt");
			//FileWriter fw= new FileWriter("C:\\java5\\File_Stream\\src//array.txt",true);		
			//FileWriter true�� ����ϸ� ���� �Էµ� ������ �ʱ�ȭ ��������
			for(int f=0;f<user.length;f++) {
				System.out.println(user[f]);
				fw.write(user[f]);		//write ; ����,�迭 ������ ���� ���Ͽ� ������
			}
			fw.close();			//���� ���»����� ���� �Ͽ� ������
		}catch(Exception x){
			System.out.println("test");
		}
		
	}

}
