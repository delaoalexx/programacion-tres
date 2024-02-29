import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.BoxLayout;

class Registro extends JPanel {

    public Registro() {
       //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
    	//Registro.getContentPane().setBackground( Color.decode("#000000") ); // set background color
        
    	setLayout(null);
		JLabel labelNuevoUsuario = new JLabel("NEW USER");
		labelNuevoUsuario.setFont(new Font ("Arial", Font.BOLD,25));
		labelNuevoUsuario.setBounds(180,70,150,25);
		//labelNuevoUsuario.setForeground(Color.decode("#304674"));
		add(labelNuevoUsuario);	
		
		JLabel labelUser = new JLabel("User:");
		labelUser.setFont(new Font ("Arial", Font.BOLD,15));
		labelUser.setBounds(180,120,150,25);
		//labelUser.setForeground(Color.decode("#304674"));
		add(labelUser);
		
		JTextField textFieldUser= new JTextField();
		textFieldUser.setFont(new Font ("Arial", Font.PLAIN,15));
		textFieldUser.setBounds(180,145,150,25);
		add(textFieldUser);
		
		JLabel labelEmail = new JLabel("Email:");
		labelEmail.setFont(new Font ("Arial", Font.BOLD,15));
		labelEmail.setBounds(180,195,150,25);
		//labelEmail.setForeground(Color.decode("#304674"));
		add(labelEmail);
		
		JTextField textFieldEmail= new JTextField();
		textFieldEmail.setFont(new Font ("Arial", Font.PLAIN,15));
		textFieldEmail.setBounds(180,225,150,25);
		add(textFieldEmail);
		
		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setFont(new Font ("Arial", Font.BOLD,15));
		labelPassword.setBounds(180,275,150,25);
		//labelPassword.setForeground(Color.decode("#304674"));
		add(labelPassword);
		
		JPasswordField password = new JPasswordField();
		password.setFont(new Font ("Arial", Font.PLAIN,15));
		password.setBounds(180,300,150,25);
		add(password);
		
		JCheckBox check = new JCheckBox("I accept terms & conditions", false);
		check.setFont(new Font ("Arial", Font.PLAIN,15));
		check.setBounds(160,350,300,25);
		//check.setForeground(Color.decode("#304674"));
		add(check);

        add(Box.createVerticalStrut(25)); 

        JButton buttonCancelar = new JButton("Cancelar");
        buttonCancelar.setBounds(125,400,100,45);
        //buttonCancelar.setForeground(Color.decode("#304674"));
        //buttonCancelar.setSize(100, 45);
        add(buttonCancelar);

        JButton buttonAceptar = new JButton("Aceptar");
        buttonAceptar.setBounds(265,400,100,45);
        //buttonAceptar.setForeground(Color.decode("#304674"));
        //buttonAceptar.setSize(100, 45);
        add(buttonAceptar);

    }
    
    
    /*public Registro() {
			
			setLayout(null);
			JLabel labelNuevoUsuario = new JLabel("NEW USER");
			labelNuevoUsuario.setFont(new Font ("Arial", Font.BOLD,25));
			labelNuevoUsuario.setBounds(180,70,150,25);
			add(labelNuevoUsuario);	
			
			JLabel labelUser = new JLabel("User:");
			labelUser.setFont(new Font ("Arial", Font.BOLD,15));
			labelUser.setBounds(180,120,150,25);
			add(labelUser);
			
			JTextField textFieldUser= new JTextField();
			textFieldUser.setFont(new Font ("Arial", Font.PLAIN,15));
			textFieldUser.setBounds(180,145,150,25);
			add(textFieldUser);
			
			JLabel labelEmail = new JLabel("Email:");
			labelEmail.setFont(new Font ("Arial", Font.BOLD,15));
			labelEmail.setBounds(180,195,150,25);
			add(labelEmail);
			
			JTextField textFieldEmail= new JTextField();
			textFieldEmail.setFont(new Font ("Arial", Font.PLAIN,15));
			textFieldEmail.setBounds(180,225,150,25);
			add(textFieldEmail);
			
			JLabel labelPassword = new JLabel("Password:");
			labelPassword.setFont(new Font ("Arial", Font.BOLD,15));
			labelPassword.setBounds(180,275,150,25);
			add(labelPassword);
			
			JPasswordField password = new JPasswordField();
			password.setFont(new Font ("Arial", Font.PLAIN,15));
			password.setBounds(180,300,150,25);
			add(password);
			
			JCheckBox check = new JCheckBox("I accept terms & conditions", false);
			check.setFont(new Font ("Arial", Font.PLAIN,15));
			check.setBounds(160,350,300,25);
			add(check);
			
			setLayout(null);
			JButton buttonCancelar = new JButton("Cancelar");
			buttonCancelar.setBounds(125,400,100,45);
			add(buttonCancelar);
			
			setLayout(null);
			JButton buttonAceptar = new JButton("Aceptar");
			buttonAceptar.setBounds(265,400,100,45);
			add(buttonAceptar);
	}*/
}