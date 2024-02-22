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
		
		JLabel labelOldPassword = new JLabel("Old Password");
		labelOldPassword.setFont(new Font ("Arial", Font.BOLD,15));
		labelOldPassword.setBounds(180,120,150,25);
		add(labelOldPassword);
		
		JPasswordField oldPassword = new JPasswordField();
		oldPassword.setFont(new Font ("Arial", Font.PLAIN,15));
		oldPassword.setBounds(180,145,150,25);
		add(oldPassword);
		
		JLabel labelPassword = new JLabel("New password");
		labelPassword.setFont(new Font ("Arial", Font.BOLD,15));
		labelPassword.setBounds(180,195,150,25);
		add(labelPassword);
		
		JPasswordField password = new JPasswordField();
		password.setFont(new Font ("Arial", Font.PLAIN,15));
		password.setBounds(180,225,150,25);
		add(password);
		
		JLabel labelCPassword = new JLabel("Confirm password");
		labelCPassword.setFont(new Font ("Arial", Font.BOLD,15));
		labelCPassword.setBounds(180,275,230,25);
		add(labelCPassword);
		
		JPasswordField oPassword = new JPasswordField();
		oPassword.setFont(new Font ("Arial", Font.PLAIN,15));
		oPassword.setBounds(180,305,150,25);
		add(oPassword);
	
		
		JButton buttonLogIn = new JButton("Change");
		buttonLogIn.setBounds(180,350,150,25);
		add(buttonLogIn);
		

		
	}
	
}