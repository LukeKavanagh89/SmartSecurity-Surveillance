import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainFram extends JFrame {

	private JPanel contentPane;
	private JTextField txtHomeSecurity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFram frame = new MainFram();
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
	public MainFram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(208, 142, -65, 20);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("Alarms");
		btnNewButton.setBounds(109, 102, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCameras = new JButton("Cameras");
		btnCameras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCameras.setBounds(230, 102, 89, 23);
		contentPane.add(btnCameras);
		
		JButton btnHeating = new JButton("Heating");
		btnHeating.setBounds(109, 142, 89, 23);
		contentPane.add(btnHeating);
		
		JButton btnLocks = new JButton("Locks");
		btnLocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLocks.setBounds(230, 142, 89, 23);
		contentPane.add(btnLocks);
		
		JTextArea txtrAddMessage = new JTextArea();
		txtrAddMessage.setText("Add Message");
		txtrAddMessage.setBounds(109, 191, 210, 22);
		contentPane.add(txtrAddMessage);
		
		txtHomeSecurity = new JTextField();
		txtHomeSecurity.setFont(new Font("Arial", Font.BOLD, 18));
		txtHomeSecurity.setHorizontalAlignment(SwingConstants.CENTER);
		txtHomeSecurity.setText("Home Security");
		txtHomeSecurity.setBounds(99, 11, 236, 41);
		contentPane.add(txtHomeSecurity);
		txtHomeSecurity.setColumns(16);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(162, 229, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
