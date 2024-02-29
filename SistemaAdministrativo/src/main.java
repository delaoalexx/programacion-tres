import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class main 
{
	public static void main(String[] args) 
	{
		MyFrame frame =new MyFrame();
		frame.setVisible(true); //para que se abra la ventana
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //detener programa al cerrar la ventana
		
	}
}

class MyFrame extends JFrame
{
	public MyFrame()
	{
		setBounds(500, 500, 500, 580);
		setTitle("Programa"); //Titulo del programa
		setLocationRelativeTo(null);


		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		JMenu menu1 = new JMenu("Ayuda");
		mb.add(menu1);
		JMenu mi1 = new JMenu("Contrasenia");
		menu1.add(mi1);
		JMenuItem mm = new JMenuItem("option 1");
		mi1.add(mm);
		JMenuItem mmDos = new JMenuItem("option 2");
		mi1.add(mmDos);
		JMenuItem mi2 = new JMenuItem("Ayuda personalizada");
		menu1.add(mi2);
		
		Registro registro = new Registro();
		
		LogIn logIn = new LogIn();
		CambiarContrasenia cambiarContra = new CambiarContrasenia();
		Welcome welcome = new Welcome();
		
		add(registro);
		setVisible(true);
		//add(logIn);
        //add(cambiarContra);
        //add(welcome);
	}	
}	

