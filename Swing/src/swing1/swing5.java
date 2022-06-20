package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		//Frame을 absloute 형태로 layer를 변경 합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("돋움", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC544\uC774\uB514 \uCCB4\uD06C");
		
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBorder(new LineBorder(Color.BLACK));
		btnNewButton.setBounds(169, 51, 93, 35);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setBorder(new LineBorder(Color.MAGENTA));
		mid.setBounds(128, 10, 173, 31);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("돋움", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(10, 139, 418, 23);
		contentPane.add(msg);

		//핸들링 Class가 오브젝트보다 상위코드에 있으면 해당 오브젝트를 로드하지 못합니다  --> 핸들링 코드는 맨 아래쪽으로 이동
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else {
					int lg= mid.getText().length();			//입력 문자 개수
					if(lg < 5) {
						msg.setText("아이디는 5자 이상 사용 가능합니다");
					}
					else {
						msg.setText("아이디 검토중 입니다");
					}
				}
			}
		});
	}
}
