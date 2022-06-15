
import java.util.Scanner;

public class Score1 {

	static String[] msg= {"검색할 테이터 학생명을 입력해 주세요:","검색할 과목명을 입력하세요[전체,국어,수학,과학,역사]"};
	
	
	public static void main(String[] args) {
		// 사용자 정보 입력 및 결과정보 출력
		
		Score2 sc=new Score2();
		Scanner text =new Scanner(System.in);
			//System.out.println(Arrays.toString(msg));
			System.out.println(msg[0]);
		String name=text.next();
		sc.stdata(name,null);		//scroe2에 메소드로 사용자 및 점수 전달
		
		String check=sc.gtdata();
		if(check.equals("true")) {
			System.out.println(msg[1]);
			
			String subject =text.next();
			sc.stdata(name, subject);
			
			String score=sc.gtdata();
			
			if(subject.equals("전체")) {			
				String score2[]=score.split(",");
				System.out.printf("점수데이터 : 국어 %s 점, 수학 %s 점, 과학 %s 점, 역사 %s점",score2[0],score2[1],score2[2],score2[3]);
			}
			else {
				System.out.println("점수데이터는 : " +subject+ " " + score+ "점");
			}}
		
			else {
				System.out.println("해당 사용자는 존재하지 않슨디ㅏ");
				System.exit(0);
		}
	
		text.close();
		
	}

}	

