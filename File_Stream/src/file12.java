import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//FileOutputStream
public class file12 {

	public static void main(String[] args) throws IOException{
		String test = "연습입니다";
		OutputStream os =new FileOutputStream("C:\\java5\\File_Stream\\src//array.txt",true);
		byte[] data =test.getBytes();		//문자를 ->ASCII로 변환
		os.write(data);
		os.flush();		//flush : Stream에 저장된 모든 값이 메모리에 있게 됩니다. 메모리값을 모두 비우는 작업

	}

}
