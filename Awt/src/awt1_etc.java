import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1_etc {

	//GUI 모드 : AWT(abstract window tools, JAVA7 사용), SWING( AWT+ 그래픽 상향 버전)
	//CUI 모드 : Scanner
	
	//SWING : JFrame -> JPanel -> JObject
	
	public static void main(String[] args) {
		/* AWT 생성방식
		Frame -> Panel -> Object (생성순서)
		Object -> Panel-> Frame (적용순서) */
		
		popclose pc =new popclose();
		
		Frame fr = new Frame();			//프레임 창
		fr.setTitle("사용자 로그인");		//창 이름
		fr.setSize(500,500);			//창 크기
		fr.setVisible(true);			//사용 유무
		
		fr.addWindowListener(pc);		//awt 메소드를 상속 받아서 처리
		
		Panel pa=new Panel();			//패널
		
		CheckboxGroup radio =new CheckboxGroup();	//체크박스 그룹설정
		
		TextField id =new TextField(10);		//TextField 10자까지
		TextField pw =new TextField(10);
		TextField sa = new TextField("사원번호를 입력하세요");		//입력 데이터가 미리 적용됨0
		Button b1=new Button("로그인");	//오브잭트(Object)
		Checkbox c1 =new Checkbox("자동로그인");
		Checkbox c2=new Checkbox("동의함",false,radio);
		Checkbox c3=new Checkbox("동의함",true,radio);
			
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1);			//add 추가 object를 panel에 적
		fr.add(pa);			// panel을 frame에 적용		

	}

}
class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램을 종료 합니다");
		System.exit(0);
		System.gc();
	}
}