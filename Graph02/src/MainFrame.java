import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements KeyListener
{
	int cuadroX=200, cuadroY=415;
	private JPanel canvas; 
	boolean isJumping = false;
	
	public MainFrame() 
	{
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 645);
		setLocationRelativeTo(null);
		setTitle("Mario");
		setResizable(false);
		addKeyListener(this);
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
                
                //personaje
                CoinBox ch = new CoinBox(cuadroX,cuadroY,30,30, VERDE_SOMBRA);
                
                // Dibujar las figuras
                p1.draw(g2d);
                p2.draw(g2d);
                p3.draw(g2d);
                pp1.draw(g2d);
                
                
                cB1.draw(g2d);
                cB2.draw(g2d);
                cB3.draw(g2d);
                cB4.draw(g2d);
                
                ch.draw(g2d); //personaje
                
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
	
	@Override
	public void keyPressed(KeyEvent e) {
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
	
		if(e.getKeyChar()== 'a') {
        	System.out.println("Tecla oprimida");
        	cuadroX=cuadroX-5;
        	System.out.println(cuadroX);
        	checkCollision();
        	repaint();
        	
        }
		if(e.getKeyChar()== 'd') {
        	System.out.println("Tecla oprimida");
        	cuadroX=cuadroX+5;
        	System.out.println(cuadroX);
        	checkCollision();
        	repaint();
        	
        }
	
        if (e.getKeyChar() == 'w' && !isJumping) {
            isJumping = true;
            checkCollision();
            jump();
        }
	    }

	    private void jump() {
	        new Thread(() -> {
	            for (int i = 0; i < 110; i++) {
	                cuadroY -= 2; 
	                repaint();
	                try {
	                    Thread.sleep(5); 
	                } catch (InterruptedException ex) {
	                    ex.printStackTrace();
	                }
	            }
	            for (int i = 0; i < 110; i++) {
	                cuadroY += 2;
	                repaint();
	                try {
	                    Thread.sleep(5); 
	                } catch (InterruptedException ex) {
	                    ex.printStackTrace();
	                }
	            }
	            isJumping = false;
	        }).start();
	    
        
		
	}
	    private void checkCollision() {
	        // Colisión con p1
	        if (cuadroX + 30 >= 400 && cuadroX <= 515 && cuadroY + 30 >= 280 && cuadroY <= 450) {
	            System.out.println("Colisión con p1 detectada");
	            cuadroX += 5;
	        }
	        
	        // Colisión con p2
	        if (cuadroX + 30 >= 300 && cuadroX <= 425 && cuadroY + 30 >= 335 && cuadroY <= 450) {
	            System.out.println("Colisión con p2 detectada");
	            cuadroX -= 5;
	        }
	        
	        // Colisión con p3
	        if (cuadroX + 30 >= 900 && cuadroX <= 1024 && cuadroY + 30 >= 335 && cuadroY <= 450) {
	            System.out.println("Colisión con p3 detectada");
	            cuadroX -= 5;
	        }
	    }
	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}

