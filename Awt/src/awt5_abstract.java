import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//awt 환경설정
public abstract class awt5_abstract {

	public abstract String signok();	//getter
	public abstract void idcheck(String id);	//setter
	public abstract void dataload();	//database
	Frame fr= new Frame();
	Button bt=null;
	Button close =null;
	TextField mid = null;
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200,200,300,450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.bt =new Button("중복체크");
		this.close =new Button("종료");
		this.mid=new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(25,200,250,25);
		this.mid.setBounds(25,160,150,25);
		this.bt.setBounds(190,160,80,25);
		this.close.setBounds(200,300,80,25);
		this.fr.add(this.msg);
		this.fr.add(this.msg);
		this.fr.add(this.msg);
		this.fr.add(this.mid);
		this.fr.add(this.bt);
		this.fr.add(this.close);
		this.click();		//awt 디자인이 완료 후 해당 핸들링 메소드로 이동
		
	}


public void click() {
	//중복확인 버튼
	this.bt.addActionListener(new ActionListener() {
		@Override
		//setText(출력). getText(입력값 가져오기)
		public void actionPerformed(ActionEvent e) {
			//awt5_abstract.this.msg.setText("체크완료");
			String userid = awt5_abstract.this.mid.getText();
			
			if(userid.equals("")) {
				msg.setText("아이디를 입력하세요");
			}
			else {
				idcheck(userid);
				String result=signok();
				if(result==null) {
					msg.setText("사용가능한 아이디");
				}
				else {
					msg.setText("다른 아이디 입력");
				}
			}
		}
	});
	this.close.addActionListener(new ActionListener() {
		//종료버튼
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	});
}

}