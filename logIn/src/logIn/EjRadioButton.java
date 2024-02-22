package logIn;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


	class EjRadioButton extends JPanel
	{
		public EjRadioButton()
		{
			
			JRadioButton male = new JRadioButton("Masculino");
			JRadioButton female = new JRadioButton("Femenino");
			add(male);
			add(female);
			
			ButtonGroup sexo = new ButtonGroup();
				sexo.add(female);
				sexo.add(male);
			
		}
	}

