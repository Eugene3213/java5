
package App;

import App.App2;
import java.util.Arrays;
import java.util.Scanner;

public class App1 {
	String user;
	String user_subject;

	public static void main(String[] args) {
		/*
		 * 문제[공용프로젝트] 여러명의 점수 데이터가 존재 합니다. 프로그램 실행시 해당 사용자 이름을 입력합니다. 해당 점수 데이터 중 사용자
		 * 이름과 동일한 데이터만 출력 되도록 합니다. [프로세서 실행 결과] 검색할 데이터 학생명을 입력해 주세요? 홍길동
		 * 
		 * 
		 * 검색할 과목 점수? [전체]? 전체 검색데이터 학생명 : 홍길동 점수데이터 : 국어:55 수학:60 과학:77 역사:90 검색할 과목
		 * 점수? [전체]? 수학 검색데이터 학생명 : 홍길동 점수데이터 : 수학:60
		 * 
		 * 배열 데이터값 { {"박은경","이경훈","장운","조기현","김진수"}, {"80","78","92","67","40"},
		 * {"40","80","80","92","100"}, {"95","30","55","90","65"},
		 * {"20","80","100","95","30"} }; A파트 사용자가 해당 질문을 입력할 수 있는 프로세서를 제작하고, 최종 결과 값을
		 * return받아서 처리해야합니다. 단, 해당 데이터에 없는 사용자를 입력할 경우 데이터를 찾지 못했습니다. 라고 입력 되어야 합니다. 또한
		 * 과목을 전체로 입력할 경우 국어~역사까지 모두 출력합니다. 해당 특정 과목을 입력할 경우 해당 과목 점수만 출력되도록 합니다.
		 * 
		 * B파트 A파트에서 전달받은 사용자 입력값 형태에 맞춰서 결과값을 A파트로 다시 재 전달 하시면 됩니다.
		 * 
		 * 
		 * A파트 사용자가 입력하는 값2개 1번 사용자 이름 -> B파트 2번 B파트에서 결과값을 받은후 조건으로 처리하여 2번째 질문 유/무4번
		 * 정상적으로 사용자 이름이 파악 ->검색할 과목명을 입력하세요[전체] 5번 사용자가 최종적으로 이름과 과목명 6번 -A파트 사용자 입력 중
		 * 2가지 모드로 최종 결과를 출력합니다. 8번 전체: 국어data[0],수학data[1],과학data[2],역사data[3] B파트 A파트
		 * 사용자 이름 ->setter ->배열로 검토 -> 사용자 이름 유/무 3번 A파트 사용자 이름, 과목명 -> 코드작성하여 배열값을
		 * 추출(문자열_ 7번 만약 전체 과목 데이터 92,80,55,100 보냅니다 ->A파트 7번(2)
		 */
		App1 DB = new App1();

		String user_data[][] = { { "박은경", "이경훈", "장운", "조기현", "김진수" }, { "80", "78", "92", "67", "40" },
				{ "40", "80", "80", "92", "100" }, { "95", "30", "55", "90", "65" },
				{ "20", "80", "100", "95", "30" } };
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생명을 입력해 주세요?");
		String user = sc.next();
		udata ab = new udata();
		ab.user_name(user);
		
		
		
		System.out.println("검색할 과목 점수는 무엇인가요?");
		String user_subject = sc.next();
		DB.Data(user_data, user, user_subject);
		sc.close();
	}
	
	public void Data(String[][] user_data1, String user_name, String user_subject) {

		int ea = user_data1[0].length;
		for (int w = 0; w < ea; w++) {
			if (user_name.equals(user_data1[0][w])) {
				if (user_subject.equals("국어")) {
					System.out.println(user_data1[1][w]);
				} else if (user_subject.equals("수학")) {
					System.out.println(user_data1[2][w]);
				} else if (user_subject.equals("과학")) {
					System.out.println(user_data1[3][w]);
				} else if (user_subject.equals("역사")) {
					System.out.println(user_data1[4][w]);
				} else {
					if (user_subject.equals("전체")) {
						for (int ww = 0; ww < ea; ww++) {
							System.out.println(user_data1[w][ww]);
						}
					}
				}
			}else {
				System.out.println("데이터를 찾지 못했습니다.");
			}

		}

	}

}
class udata{
	private String user_name;
	public void  user_name(String user) {
		this.user_name=user;
		System.out.println(this.user_name);
	}
}