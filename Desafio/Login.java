//Nome: Daniel Guimarães Faria
//Matrícula: 0050010533

package Desafio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField Login;
	private JPasswordField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(76, 111, 48, 34);
		frame.getContentPane().add(lblSenha);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(76, 58, 48, 34);
		frame.getContentPane().add(lblLogin);
		
		Login = new JTextField();
		Login.setBounds(130, 65, 136, 20);
		frame.getContentPane().add(Login);
		Login.setColumns(10);
		
		Senha = new JPasswordField();
		Senha.setBounds(133, 118, 133, 20);
		frame.getContentPane().add(Senha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String uname = Login.getText();
			String psd = Senha.getText();
			
			if(uname.equals("Daniel94") && psd.equals("kaiser"))
			{
				JOptionPane.showMessageDialog(frame, "Voce conseguiu logar!");
			}
			else 
			{
				JOptionPane.showMessageDialog(frame,"Login ou Senha inválidos!");
			}
			}
		});
		btnLogar.setBounds(130, 171, 89, 23);
		frame.getContentPane().add(btnLogar);
	}
}
