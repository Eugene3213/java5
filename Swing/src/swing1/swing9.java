package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
//JEditorPane �� �Խ��� ���� ��� �Ǵ� �Է� � ����� �Ǹ�, ���̺긮�� ���ۿ����� HTML
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
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
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("���̺긮�� ��");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(10, 10, 778, 745);
		contentPane.add(webpage);
		webpage.setContentType("text/html");		//ContentType : ���ڵ� ��� �׸��� HTML �ڵ嵵 ���
		webpage.setText("<h1>APINK 2022!</h1>"
				+ "<img src='http://t1.daumcdn.net/friends/prod/editor/dc8b3d02-a15a-4afa-a88b-989cf2a50476.jpg'>"
				+ "APINK FOR~~~");
	}
}
