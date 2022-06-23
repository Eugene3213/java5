import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file13 {

	public static void main(String[] args) throws IOException{
		try {
//			//creatDirectories : 신규 디렉토리 생성
//			//Files.createDirectories(Paths.get("C:\\java5\\File_Stream\\src//test"));
//			Path data1= Paths.get("C:\\java5\\File_Stream\\src//movie_db.txt");
//			Path data2 = Paths.get("C:\\java5\\File_Stream\\src//movie_db2.txt");
//			Files.copy(null, null);

//			move: 해당 파일을 다른 폴더(디렉토리)로 이동
//			Path data3=Paths.get("C:\\java5\\File_Stream\\src//movie_db.txt");
//			Path directory =Paths.get("C:\\memo\\");
//			Files.move(data3, directory, StandardCopyOption.REPLACE_EXISTING);
		
//			Path data3 = Paths.get("C:\\java5\\Swing\\src\\swing1//cat.jpg");
//			Files.delete(data3);
			
//			해당 파일 생성
			Path data3=Paths.get("C:\\java5\\File_Stream\\src//movie_db3.txt");
			Files.createFile(data3);
			
		}catch(Exception z) {
			System.out.println(z);
		}

	}

}
