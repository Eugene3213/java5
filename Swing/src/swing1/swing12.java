package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class swing12 extends JFrame {

	private String imagdata[]= {"apink1.jpg","apink2.jpg","apink3.jpg"};
	private JPanel contentPane;
	public int count=0;
	public String url ="C:\java5\Swing\src\swing1";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing12 frame = new swing12();
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
	public swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBackground(new Color(0, 51, 0));
		lb.setForeground(Color.BLACK);
		lb.setBounds(10, 49, 418, 356);
		contentPane.add(lb);
		
		JButton prev = new JButton("이전");
		prev.setBounds(10, 16, 93, 23);
		contentPane.add(prev);
		
		JButton next = new JButton("다음");
		next.setBounds(335, 16, 93, 23);
		contentPane.add(next);
		
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count--;
				if(swing12.this.count<0) {
					swing12.this.count=0;
				}
				System.out.println(swing12.this.count);
				ImageIcon v =new ImageIcon(url+imgdata[swing12.this.count+1)];
				lb.setIcon(v);
			}
		});
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count++;
				if(swing12.this.count > 2) {
					swing12.this.count =2;
				}
				ImageIcon v =new ImageIcon(url+imgdata[swing12.this.count+1)];
				lb.setIcon(v);
				
			}
		});
	}

}
