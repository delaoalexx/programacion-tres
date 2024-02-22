package logIn;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;


	class EjSlider extends JPanel
	{
		public EjSlider()
		{
			JSlider slider = new JSlider(0, 100, 10);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			add(slider);
		}
	}