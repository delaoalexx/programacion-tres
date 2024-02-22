package logIn;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


	class EjComboBox extends JPanel
	{
		public EjComboBox()
		{
			String [] frutas = {"Manzana", "Naranja", "Pera", "Uva"};
			JComboBox<String> listaFrutas = new JComboBox<String>(frutas);
			listaFrutas.setSelectedIndex(2);
			add(listaFrutas);
			
		}
	}
