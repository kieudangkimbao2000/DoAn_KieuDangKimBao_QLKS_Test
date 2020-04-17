package GUI;
import java.lang.ClassNotFoundException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BLL.userBLL;
import DTO.userDTO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class F_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_Login frame = new F_Login();
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
	public F_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(214, 91, 116, 22);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User name");
		lblNewLabel.setBounds(125, 94, 69, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(132, 147, 62, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userDTO uDTO=new userDTO(txtUserName.getText(),txtPassword.getText());
				userBLL uBLL=new userBLL();

				if(uBLL.Login(uDTO)==null) {
					JOptionPane.showMessageDialog(contentPane,"Login khong thanh cong");
				}
				else {
					JOptionPane.showMessageDialog(contentPane,"Login thanh cong");
				}
			}
		});
		btnNewButton.setBounds(263, 199, 97, 25);
		contentPane.add(btnNewButton);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(214, 144, 116, 22);
		contentPane.add(txtPassword);
	}
}
