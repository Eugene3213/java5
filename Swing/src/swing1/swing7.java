package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 34, 397, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("신용카드");
		rd1.setName("CARD");
		rd1.setBounds(64, 5, 73, 23);
		rd1.setSelected(true);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("계좌이체");
		rd2.setName("BANK");
		rd2.setBounds(156, 5, 73, 23);
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("무통장입금");
		rd3.setName("NOBANK");		//setName은 노출은 되지 않으며, background에서 해당 속성에 값을 적용
		rd3.setBounds(262, 5, 85, 23);
		panel.add(rd3);
		
		ButtonGroup gp =new ButtonGroup();	//radio 사용 시 ButtonGroup 사용  
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		JButton btn = new JButton("결제진행");
		
		btn.setBounds(171, 107, 93, 23);
		contentPane.add(btn);
		
		JPanel mu = new JPanel();
		mu.setVisible(false);
		mu.setBounds(10, 149, 397, 106);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("무통장입금"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 21, 145, 41);
		mu.add(textField);
		textField.setColumns(10);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pay="";
				
				if(rd1.isSelected()==true) { //신용카드
					pay=rd1.getName();
					System.out.println("신용카드 선택");
					mu.setVisible(false);
				}
				else if(rd2.isSelected()==true) {		//계좌이체
					System.out.println("계좌이체 선택");
					mu.setVisible(false);
				}
				else {			//무통장입금
					mu.setVisible(true);
					
				}
			}
		});
	}
}
