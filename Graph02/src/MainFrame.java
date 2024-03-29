import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame 
{
	private JPanel canvas;
	
	public MainFrame() 
	{
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 645);
		setLocationRelativeTo(null);
		setTitle("Mario");
		setResizable(false);
	    final Color BLACK_SHADOW = new Color(33,33,33);
	    final Color AZUL_FONDO = new Color(179, 238, 254);
		final Color ROSA_SUELO = new Color(255, 193, 177);
		final Color CAFE_BOX = new Color(255, 144, 88);
		final Color ORANGE_SUELO = new Color(237, 152, 105);
		final Color AZUL_BOX = new Color(132, 192, 255);
		final Color AZUL_SOMBRA_BOX = new Color(19, 143, 226);
		final Color VERDE_BOX = new Color(81, 217, 107);
		final Color VERDE_TUNEL = new Color(22, 137, 20);
		final Color VERDE_SOMBRA = new Color(41, 98, 44);
		
		canvas = new JPanel() 
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Plataformas box
                Plataforma p1 = new Plataforma(400,280,115,170, AZUL_BOX, AZUL_SOMBRA_BOX);
                Plataforma p2 = new Plataforma(300,335,125,115, ROSA_SUELO, ORANGE_SUELO);
                Plataforma p3 = new Plataforma(900,335,125,115, VERDE_BOX, VERDE_SOMBRA);
                
                //CoinBoxs
                
                CoinBox cB1 = new CoinBox(255, 125, 50, 50, CAFE_BOX);
                CoinBox cB2 = new CoinBox(200, 125, 50, 50, CAFE_BOX);
                CoinBox cB3 = new CoinBox(70, 250, 50, 50, CAFE_BOX);
                CoinBox cB4 = new CoinBox(940, 150, 50, 50, CAFE_BOX);
                

                Pipe pp1 = new Pipe(700, 300, 80, 150, VERDE_TUNEL, VERDE_BOX);
                
                // Dibujar las figuras
                p1.draw(g2d);
                p2.draw(g2d);
                p3.draw(g2d);
                pp1.draw(g2d);
                
                cB1.draw(g2d);
                cB2.draw(g2d);
                cB3.draw(g2d);
                cB4.draw(g2d);
                
                
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension screenSize = toolkit.getScreenSize();
                
                //suelo
				g2d.setColor(new Color(255, 193, 177));
				g2d.fillRect(0, 450, 1024, 200);//fondo suelo
				g2d.setColor(new Color(237, 152, 105));
				g2d.fillRect(0, 460, 1024, 10);//primera sombra
				g2d.setColor(new Color(237, 152, 105));
				g2d.fillRect(0, 480, 1024, 200);//segunda sombr
				g2d.setColor(Color.BLACK);
				g2d.fillRect(0, 450, 1024, 3);//linea de arriba
				g2d.fillRect(0, 465, 1024, 3);//linea de abajo
            }
        };
		
        canvas.setBackground(new Color(179,238,254));
        add(canvas);
	}
	

}
