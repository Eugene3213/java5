import java.util.Random;
import java.util.Scanner;

public class Exam1_1 {

	public static void main(String[] args) {

		/* 일반 random형식 (random double 자료형)
		 int pc =(int)(math.random()*10+1); */
		 
		Exam2_1 ex2=new Exam2_1();
		
		Scanner sc=new Scanner(System.in);
		//util을 이용한 random형식
		Random r=new Random();
		int pc= r.nextInt(10)+1;
		
		int w=5;
		do {
			System.out.println("총 기회는"+ w + "번 남았습니다. 1~10까지 번호 중 하나의 번호");
			int user=sc.nextInt();
			ex2.randomck(pc,user);
			
			String out =ex2.result();
			System.out.println(out);
		
			int check=out.indexOf("정답");	//indexof 단어 검색에 사용.-1:없음 , 0:있음
			if(check==0) {
				break;
			}
			
			w--;
		}while(w>0);
				
sc.close();
	}

}
