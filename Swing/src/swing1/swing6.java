package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;
	private JLabel msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		
		tel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));
		tel.setFont(new Font("????ü", Font.PLAIN, 12));
		tel.setBounds(10, 25, 268, 35);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("??????ȣ");
		btnNewButton.setFont(new Font("????ü", Font.PLAIN, 12));
		btnNewButton.setBounds(288, 25, 128, 35);
		contentPane.add(btnNewButton);
		
		msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.RED));
		msg.setFont(new Font("????ü", Font.PLAIN, 12));
		msg.setBounds(10, 80, 406, 29);
		contentPane.add(msg);
	
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tel.addKeyListener(new KeyAdapter() {			//addKeyListener : Ű?? ???? ???? ?????Ǵ? ?̺?Ʈ Ŭ????
			//keyPressed : Ű?? ???? ??
			//keyReleased : Ű?? ?????ٰ? ???? ?? 
			//keyTyped : Ű?? ???ڸ? ?Է? ???? ??
			@Override
			public void keyTyped(KeyEvent k) {
				int i = tel.getText().length();		//?Է°??? ???? ?ڸ???
				if(i>11) {
					k.consume();
				}
				
//				System.out.println(k);
//				System.out.println(k.getKeyChar());
//				System.out.println(k.getKeyCode());
				int n=Integer.valueOf(k.getKeyChar());	//?ƽ?Ű ?ڵ??? ????
					//System.out.println(n);
				if(n>=48 && n<=57) {		//sysout?????? ???????? ???? getkeyChar()?? ???????? Integer?? ???? ?? ?ƽ?Ű ?ڵ??? 
					msg.setText("");
				}
				else {
					msg.setText("???ڸ? ?Է??ϼ???");
					k.consume();		//keyTyped?? ?̿?. consume?? ?ش? ?Է? ?? null?? ?ν?
				}
			}
		});
	}

}
