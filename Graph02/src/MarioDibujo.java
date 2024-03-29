import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MarioDibujo extends JFrame {
	private JPanel contentPane;
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					try 
					{
						MarioDibujo frame = new MarioDibujo();
						frame.setVisible(true);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setSize(800, 500);
						frame.setLocationRelativeTo(null);
						frame.setTitle("algo");
						frame.setResizable(false);
						frame.setLayout(null);
					}catch(Exception e) 
					{
						e.printStackTrace();
					}
				}
			});
	    }
		
		public MarioDibujo()
		{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
		}
		
		public void paint(Graphics g)
		{
			super.paint(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			//crolores
			final Color AZUL_FONDO = new Color(179, 238, 254);
			final Color ROSA_SUELO = new Color(255, 193, 177);
			final Color CAFE_BOX = new Color(255, 144, 88);
			final Color ORANGE_SUELO = new Color(237, 152, 105);
			final Color AZUL_BOX = new Color(132, 192, 255);
			final Color AZUL_SOMBRA_BOX = new Color(19, 143, 226);
			final Color VERDE_BOX = new Color(81, 217, 107);
			final Color VERDE_TUNEL = new Color(22, 137, 20);
			final Color VERDE_SOMBRA = new Color(41, 98, 44);
			
			//cielo
			g2.setColor(AZUL_FONDO);
			g2.fillRect(0, 0, 800, 500);
			
			//suelo
			
			g2.setColor(ROSA_SUELO);
			g2.fillRect(0, 450, 800, 100);//fondo suelo
			g2.setColor(ORANGE_SUELO);
			g2.fillRect(0, 460, 800, 5);//primera sombra
			g2.setColor(ORANGE_SUELO);
			g2.fillRect(0, 480, 800, 100);//segunda sombra
			
			//linea suelo
			g2.setColor(Color.BLACK);
			g2.fillRect(0, 450, 800, 3);//linea de arriba
			g2.fillRect(0, 465, 800, 2);//linea de abajo
			
			//cubos suelo
			
			//cubo suelo azulk
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(340, 265, 130, 185, 20, 20); //sombra
			g2.fillRoundRect(280, 245, 160, 205, 20, 20); //contorno
			g2.setColor(AZUL_BOX);
			g2.fillRoundRect(285, 250, 150, 200, 20, 20); //color
			g2.setColor(AZUL_SOMBRA_BOX);
			g2.fillRoundRect(420, 250, 15, 200, 5, 5); //sombra sup
			
			
			//cubo suelo cafe
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(285, 335, 100, 115, 20, 20); //sombra
			g2.fillRoundRect(220, 315, 140, 135, 20, 20); //contorno
			g2.setColor(ROSA_SUELO);
			g2.fillRoundRect(225, 320, 130, 130, 20, 20); //color
			g2.setColor(ORANGE_SUELO);
			g2.fillRoundRect(340, 320, 15, 130, 5, 5); //sombra sup
			
			//cubo suelo verde
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(700, 315, 140, 135, 20, 20); //contorno
			g2.setColor(VERDE_BOX);
			g2.fillRoundRect(705, 320, 130, 130, 20, 20); //color
			g2.setColor(VERDE_SOMBRA);
			g2.fillRoundRect(785, 320, 15, 130, 5, 5); //sombra sup
			
			//tunel base
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(545, 295, 90, 155, 10, 10); //contorno
			g2.setColor(VERDE_TUNEL);
			g2.fillRoundRect(550, 300, 80, 150, 10, 10); //color
			g2.setColor(VERDE_BOX);
			g2.fillRoundRect(550, 340, 5, 110, 0, 0); //light verde
			g2.fillRoundRect(565, 340, 5, 110, 0, 0); //light verde
			g2.fillRoundRect(585, 340, 5, 110, 0, 0); //light verde
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(580, 340, 5, 110, 0, 0); //shadow
			g2.fillRoundRect(560, 340, 5, 110, 0, 0); //shadow
			g2.fillRoundRect(605, 340, 25, 110, 5, 0); //shadow
			
			//tunel top
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(540, 295, 100, 45, 10, 10); //contorno
			g2.setColor(VERDE_TUNEL);
			g2.fillRoundRect(545, 300, 90, 35, 10, 10); //color
			g2.setColor(VERDE_BOX);
			g2.fillRoundRect(545, 300, 5, 35, 0, 0); //light
			g2.fillRoundRect(565, 300, 5, 35, 0, 0); //light
			g2.fillRoundRect(585, 300, 5, 35, 0, 0); //light
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(580, 300, 5, 35, 0, 0); //shadow
			g2.fillRoundRect(560, 300, 5, 35, 0, 0); //shadow
			g2.fillRoundRect(610, 300, 25, 35, 5, 0); //shadow
			
			
			//cubos cielo ?
			
			//cubo 1
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(95, 125, 55, 55, 5, 5); //sombra
			g2.setColor(CAFE_BOX);
			g2.fillRoundRect(100, 125, 50, 50, 5, 5); //color
			
			//cubo 2
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(150, 125, 55, 55, 5, 5); //sombra
			g2.setColor(CAFE_BOX);
			g2.fillRoundRect(155, 125, 50, 50, 5, 5); //color
			
			//cubo 2
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(25, 250, 55, 55, 5, 5); //sombra
			g2.setColor(CAFE_BOX);
			g2.fillRoundRect(30, 250, 50, 50, 5, 5); //color
			
			//cubo 3
			g2.setColor(Color.BLACK);
			g2.fillRoundRect(735, 150, 55, 55, 5, 5); //sombra
			g2.setColor(CAFE_BOX);
			g2.fillRoundRect(740, 150, 50, 50, 5, 5); //color
			
			
			
			
		}
	}
