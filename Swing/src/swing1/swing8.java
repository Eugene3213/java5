package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;

public class swing8 extends JFrame {
//progress바 사용법
	public JProgressBar progress = new JProgressBar();
	public JLabel ng = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(113, 20, 217, 20);
		contentPane.add(progress);
		
		JLabel ng = new JLabel("");
		this.ng.setFont(new Font("돋움체", Font.PLAIN, 12));
		this.ng.setBounds(26, 74, 402, 20);
		contentPane.add(ng);
		
		//swing 프로그램이 작동 후 해당 메소드로 1초 후 실행 되돌독 적용함.
		Timer t =new Timer();
		TimerTask task =new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				pstart();
			}
		};
		t.schedule(task,500);
	}
	public void pstart() {
		int w=0;
		try {
			while(w<=100) {
				this.progress.setValue(w);
				Thread.sleep(300);
				w++;
			}
			
		}catch(Exception k){
			System.out.println("오류발생");
		}
		if(this.progress.getValue()==100) {
			this.ng.setText("다운로드 완료");
		}
	
	}
}
