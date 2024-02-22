import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class CambiarContrasenia extends JPanel
{

	public CambiarContrasenia() 
	{
		
		setLayout(null);
		JLabel labelLogIn = new JLabel("Change Password");
		labelLogIn.setFont(new Font ("Arial", Font.BOLD,25));
		labelLogIn.setBounds(165,70,250,25);
		add(labelLogIn);	
		
		JLabel labelUser = new JLabel("Old Password");
		labelUser.setFont(new Font ("Arial", Font.BOLD,15));
		labelUser.setBounds(180,120,150,25);
		add(labelUser);
		
		JTextField textFieldUser= new JTextField();
		textFieldUser.setFont(new Font ("Arial", Font.PLAIN,15));
		textFieldUser.setBounds(180,145,150,25);
		add(textFieldUser);
		
		JLabel labelPassword = new JLabel("New assword:");
		labelPassword.setFont(new Font ("Arial", Font.BOLD,15));
		labelPassword.setBounds(180,195,150,25);
		add(labelPassword);
		
		JPasswordField password = new JPasswordField();
		password.setFont(new Font ("Arial", Font.PLAIN,15));
		password.setBounds(180,225,150,25);
		add(password);
		
		JButton buttonLogIn = new JButton("Login");
		buttonLogIn.setBounds(180,315,150,25);
		add(buttonLogIn);
		
		JCheckBox check = new JCheckBox("Im not a robot", false);
		check.setFont(new Font ("Arial", Font.PLAIN,15));
		check.setBounds(190,270,150,25);
		add(check);
		
		JLabel labelLostPassword = new JLabel("I forgot my password");
		labelLostPassword.setFont(new Font ("Arial", Font.BOLD,15));
		labelLostPassword.setBounds(177,355,180,25);
		add(labelLostPassword);
		
	}
	
}