import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
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
		Toolkit toolkit = getToolkit().getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		
		setBounds(500, 500, 500, 580);
		setTitle("Menu 👻"); //Titulo del programa
		setLocationRelativeTo(null);
		
		Registro registro = new Registro();
		LogIn logIn = new LogIn();
		CambiarContrasenia cambiarContra = new CambiarContrasenia();
		Welcome welcome = new Welcome();
		
		setVisible(true);
        //add(registro);
		//add(logIn);
        //add(cambiarContra);
        //add(welcome);
	}	
}	

