import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/* q. 해당 사용자가 영화제목을 검색합니다.
 * 해당 영화제목에 맞는 데이터값이 있을경우 
 * 영화 전체에 대한 정보를 출력하게 됩니다. 
 * 힌트: Scanner 사용
 * "검색할 영화제목을 입력하세요"  -> 범죄도시2
 * [범죄도시2] - 추천5 2022년 4월 개봉
 * 
 * "검색할 영화제목을 입력하세요" -> 뽀로로
 * "검색한 영화는 확인 되지 않습니다."

경관의 피 - 추천 3 2022년 1월 5일 개봉
특송 - 추천 3 2022년 1월 개봉
블루버스데이 - 추천 2 2022년 1월 19일 개봉
킹메이커 - 추천 2 2022년 1월 26일 개봉
해적: 도깨비 깃발 - 추천 3 2022년 1월 26일 개봉
뜨거운 피 - 추천 3 2022년 3월 23일 개봉
야차 - 추천 3 2022년 3월 8일 개봉
범죄도시 2 - 추천 5 2022년 5월 11일 개봉
딥워터 - 추천 3 2022년 1월 14일 개봉
모비우스 - 추천 2 2022년 1월 28일 개봉
언챠티드 - 추천 4 2022년 2월 18일 개봉
앰블런스 - 추천 3 2022년 2월 18일 개봉
더 배트맨 - 추천 2 2022년 3월 4일 개봉
닥터 스트레인지 인더 멀티버스 오브 매드니스 - 추천 5 2022년 3월 25일 개봉

 
 */
public class Example1 {

	public static void main(String[] args) throws IOException{
		
		FileReader fr =new FileReader("C:\\java5\\File_Stream\\src//Example1.txt",Charset.forName("UTF8"));
		Scanner sc = new Scanner(System.in);
			System.out.println("검색할 영화 제목을 입력하세요");
			String user= sc.nextLine();
		ArrayList<String> ar = new ArrayList<>();
		

	}

}
