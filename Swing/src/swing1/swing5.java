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
		//Frame�� absloute ���·� layer�� ���� �մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("����", Font.PLAIN, 12));
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
		msg.setFont(new Font("����", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(10, 139, 418, 23);
		contentPane.add(msg);

		//�ڵ鸵 Class�� ������Ʈ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε����� ���մϴ�  --> �ڵ鸵 �ڵ�� �� �Ʒ������� �̵�
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					int lg= mid.getText().length();			//�Է� ���� ����
					if(lg < 5) {
						msg.setText("���̵�� 5�� �̻� ��� �����մϴ�");
					}
					else {
						msg.setText("���̵� ������ �Դϴ�");
					}
				}
			}
		});
	}
}
