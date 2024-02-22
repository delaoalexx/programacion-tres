import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Welcome extends JPanel
{

	public Welcome() 
	{
		
		setLayout(null);
		JLabel labelLogIn = new JLabel("👻 W E L C 0 M E 👻");
		labelLogIn.setFont(new Font ("Arial", Font.BOLD,25));
		labelLogIn.setBounds(140,70,250,25);
		add(labelLogIn);	
		
	}
	
}