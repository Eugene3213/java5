package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String list[] = {"SKT","KT","LGT","¾Ë¶ãÆù"};
		
		
		JComboBox cb = new JComboBox(list);
		cb.setBounds(10, 10, 163, 47);
		contentPane.add(cb);
		
		JLabel msg = new JLabel("New label");
		msg.setFont(new Font("µ¸¿òÃ¼", Font.PLAIN, 12));
		msg.setBounds(10, 76, 265, 35);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
						
				System.out.println(e.getItem());
				//String data =cb.getSelectedItem().toString();
				//String data=String.valueOf(cb.getSelectedItem());
				//String data= String.valueOf(e.getItem());
				String data=e.getItem().toString();
				msg.setText(data);
				
			}
		});
	
	
		}
	}
